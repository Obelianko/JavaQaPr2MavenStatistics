package ru.netology.statistics;

public class StatisticsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sumAvg = calculateSum(sales);
        long avg = sumAvg / sales.length;
        return avg;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long calculateLowAverageSales(long[] sales) {
        long LowAvg = 0;
        long Avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < Avg) {
                LowAvg = LowAvg + 1;
            }
        }
        return LowAvg;
    }

    public long calculateUpAverageSales(long[] sales) {
        long Up = 0;
        long Avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > Avg) {
                Up = Up + 1;
            }
        }
        return Up;
    }
}

