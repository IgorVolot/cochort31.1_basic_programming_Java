package homework_13;

import java.util.Arrays;
import java.util.Random;

public class hw_13_t01_gameCube_01 {
    public static void main(String[] args) {
        // Задача 1.
        //Напишите метод, который имитирует бросание игрового кубика.
        // На вход методу подается число бросков, на выходе метод возвращает результаты всех бросков.
        // Кубик из 6 граней n = (int)(Math.random() * (6 - 1 + 1) + 1).

        int [] finalResult = throwCube(10);

        for (int element : finalResult) {  // цикл для вывода в печать содержимое (элементы) массива
            System.out.print(element + " ");
        }

        // другой вариант вывода в печать результата
        System.out.println("\nPrint array with Arrays.toString");

        Arrays.toString(finalResult);  // превращает в строку все содержимое массива
        System.out.println(Arrays.toString(finalResult)); // переводит в печать
        //System.out.println(arrString.charAt(0));
        String str = "[1,2,4,5,1,6,3,5,2,2]";

    }
    // ----------------Methods-----------------------
    public static int[] throwCube( int numberOfTosses) {
        int[] result = new int[numberOfTosses];

        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(6) + 1;
        }
        return result;
    }
    // ----------------------------------------------
}
