package ru.netology.stats;

public class StatsService {

    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }

    public long monthMaxSales(long[] purchases) {
        long max = findMax(purchases);
        int monthNumb = 0;
        int monthNumbMax = 0;
        for (long purchase : purchases) {
            monthNumb += 1;
            if (purchase == max) {
                monthNumbMax = monthNumb;

            }
        }
        return monthNumbMax;
    }

    public long monthMinSales(long[] purchases) {
        long min = findMin(purchases);
        int monthNumb = 0;
        int monthNumbMin = 0;
        for (long purchase : purchases) {
            monthNumb += 1;
            if (purchase == min) {
                monthNumbMin = monthNumb;

            }
        }
        return monthNumbMin;
    }

    public long lowAverage(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count += 1;
            }
        }
        return  count;
    }

    public long upperAverage(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count += 1;
            }
        }
        return  count;
    }





    public long findMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    public long findMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

}
