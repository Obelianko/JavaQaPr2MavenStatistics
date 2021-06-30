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
        long lowAvg = 0;
        long avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < avg) {
                lowAvg = lowAvg + 1;
            }
        }
        return lowAvg;
    }

    public long calculateUpAverageSales(long[] sales) {
        long up = 0;
        long avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > avg) {
                up = up + 1;
            }
        }
        return up;
    }
}

