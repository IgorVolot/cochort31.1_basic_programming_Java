package ait.hw_task1.weekdays;

import java.util.Arrays;

public class WeekdaysArray {
    public static void main(String[] args) {
        /*
        Сформируйте массив, который хранит названия дней недели при условии, что первый рабочий день недели - это
        Понедельник, а последний - Воскресенье. Переопределите этот массив так, чтобы первым рабочим днем недели
        стало Воскресенье, а последним - Суббота.
         */

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Weekdays from Monday to Sunday " + Arrays.toString(weekdays));
        System.out.println("Weekdays from Sunday to Saturday " + Arrays.toString(weekdaysAmerStyle(weekdays)));
    }

    public static String[] weekdaysAmerStyle(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    private static void swap(String[] array, int i1, int i2) {
        String temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
