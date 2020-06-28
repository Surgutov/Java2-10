package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSumOfSalesInYear() {
        long expected = 180;
        long actual = service.sum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSum() {
        long expected = 15;
        long actual = service.average(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthMaxSales() {
        long expected = 8;
        long actual = service.monthMaxSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthMinSales() {
        long expected = 9;
        long actual = service.monthMinSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthCountLowAverage() {
        long expected = 5;
        long actual = service.lowAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthCountUpperAverage() {
        long expected = 5;
        long actual = service.upperAverage(purchases);
        assertEquals(expected, actual);
    }
}