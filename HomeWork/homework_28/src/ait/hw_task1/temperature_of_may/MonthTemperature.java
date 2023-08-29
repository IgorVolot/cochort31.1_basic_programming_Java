package ait.hw_task1.temperature_of_may;

public class MonthTemperature {
    public static void main(String[] args) {
        /*
        Задайте массив для фиксирования данных о дневной температуре за месяц май.
        Заполните массив случайными числами в интервале от 15.0 до 25.0 градусов Цельсия.
        Найдите разницу между минимальной и максимальной температурой за месяц, среднюю температуру и отклонение от
        средней температуры в меньшую и большую сторону. Разработайте соответсвующий тест (набор тестов).
         */

        double[] tempOfMay = new double[31];
        double a = 15.0;
        double b = 25.0;
        for (int i = 0; i < tempOfMay.length; i++) {
            tempOfMay[i] = (double) (Math.random() * (b - a + 1) + a);
        }
        printArray(tempOfMay);
        System.out.println("------------------------------");
        System.out.printf("Средняя температура = %.2f", averageTemp(tempOfMay));
        System.out.println();
        System.out.printf("Разница между минимальной и максимальной температурой за месяц = %.2f", (maxTemp(tempOfMay) - minTemp(tempOfMay)));
        System.out.println();
        System.out.printf("Отклонение от средней температуры в большую сторону = %.2f", (maxTemp(tempOfMay) - averageTemp(tempOfMay)));
        System.out.println();
        System.out.printf("Отклонение от средней температуры в меньшую сторону = %.2f", (averageTemp(tempOfMay)) - minTemp(tempOfMay));
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double maxTemp(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double minTemp(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double averageTemp(double[] arr) {
        double summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        double average = summ / arr.length;
        return average;
    }
}
