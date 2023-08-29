package ait.hw_task1.array;

public class RandomArray {
    public static void main(String[] args) {
        /*
        Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
        Распечатайте полученный массив. Создайте метод, который определяет наличие дубликатов в массиве.
        Разработайте соответсвующий тест (набор тестов).
         */

        int[] array = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);

        System.out.println("Duplicates are " + findDuplicateElement(array));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int findDuplicateElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
