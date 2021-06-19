package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();


        // вызываем целевой метод:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateLowAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateLowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateUpAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateUpAverageSales(sales);
        assertEquals(expected, actual);
    }
}

