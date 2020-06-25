package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    //В таком виде должно быть реализовано? Если да, то на выходных допишу.

    @Test
    void shouldCalculateSumOfSalesInYear() {
        long expected = 180;
        long actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAveragefSales() {
        long expected = 15;
        long actual = service.average(purchases);
        assertEquals(expected, actual);
    }

}