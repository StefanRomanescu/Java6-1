package ru.netology.stats;

public class StatsService {

    public int getMinSales(long[] sales) {
        int minSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }

        return minSales;
    }

    public int getMaxSales(long[] sales) {
        int maxSales = 0; //

        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }

        return maxSales + 1;
    }

    public long getAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long getAverageAmount(long[] sales) {
        long averageAmount = getAllSales(sales) / sales.length;
        return averageAmount;
    }

    public long getAboveAverage(long[] sales) {
        long aboveAmount = getAverageAmount(sales);
        long count = 0;
        for (long m : sales) {
            if (m > aboveAmount) {
                count++;
            }
        }
        return count;
    }

    public long getUnderAverage(long[] sales) {
        long aboveAmount = getAverageAmount(sales);
        long count = 0;
        for (long m : sales) {
            if (m < aboveAmount) {
                count++;
            }
        }
        return count;

    }
}