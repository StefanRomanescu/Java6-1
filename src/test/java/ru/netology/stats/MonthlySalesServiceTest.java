package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthlySalesServiceTest {

    @Test
    public void shouldFindMinSaleMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxSaleMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long exactlyAllSales = service.getAllSales(sales);
        System.out.println(exactlyAllSales);
    }

    @Test
    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long exactlyAverageAmount = service.getAverageAmount(sales);
        System.out.println(exactlyAverageAmount);
    }

    @Test
    public void shouldFindAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long quantityAboveAverage = service.getAboveAverage(sales);
        System.out.println(quantityAboveAverage);
    }

    @Test
    public void shouldFindUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long quantityUnderAverage = service.getUnderAverage(sales);
        System.out.println(quantityUnderAverage);
    }
}
