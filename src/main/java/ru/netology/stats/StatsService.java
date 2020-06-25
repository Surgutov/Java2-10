package ru.netology.stats;

public class StatsService {

    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = purchase + sum;
        }
        return sum;

    }

    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }


}
