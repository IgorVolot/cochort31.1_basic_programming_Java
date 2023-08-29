package homework_09;

import java.util.Scanner;
import java.util.Random;

public class homework_09 {
    public static void main(String[] args) {

        System.out.println("========== Home work 28.07.2023 ===========\n");

        System.out.println("Task #1\n");

//        Задача 1
//        Написать программу, вычисляющую факториал числа 5.
//        Факториал числа - это произведение всех целых чисел от 1 до самого числа.
//        Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
//        ! -обозначение факториала.

        int a = 1;
        int f = 1;
        int c = 5;

        while (a <= c){
            f = f * a++;
        }
        System.out.println("Факториал числа 5 = " + f);
        System.out.println();


        System.out.println("Task #2\n");

//        Задача 2
//        Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.

        int [] nums = new int[10];
        int even = 0;
        int odds = 0;
        a = 1;
        int b = 100;

        for (int i = 0; i < nums.length; i++ ){
            nums [i] = ((int) (Math.random() * (b - a + 1) + a ));
            System.out.print(nums [i] + " | ");

            if (nums[i] % 2 != 0){
                odds++;
            } else {
                even++;
            }
        }
        System.out.println();
        System.out.println( "There are " + even + " even numbers.\n");


        System.out.println("Task #3\n");

//        Задача 3
//        Есть массив целых чисел. Написать программу, находящую разницу между значением
//        максимального и минимального элементов. (max - min).

        int [] nArr = new int[10];
        int g = 0;
        int min = nArr[0];
        int max = nArr[0];

        while ( g < nArr.length ) {
            nArr [g] = ((int) (Math.random() * (b - a + 1) + a ));
            if (nArr [g] < min) {
                min = nArr [g];
            } else if (nArr[g] > max){
                max = nArr [g];
            }
            g++;
        } int dif = max - min;
        System.out.println("Разница между значениями максимального и минимального элементов " + dif);
        System.out.println();


        System.out.println("Task #4\n");

//        Задача 4*
//        Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
//        1
//        12
//        123
//        1234
//        12345
//        123456

    }
}
