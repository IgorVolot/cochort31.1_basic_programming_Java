package homework_09;

public class homework_09_01 {
    public static void main(String[] args) {
        System.out.println("============ Home work 31.07.2023 Igor Volotovskyi ==========\n");

        System.out.println("Task #1\n");

//        Задача 1
//        Написать программу, вычисляющую факториал числа 5.
//        Факториал числа - это произведение всех целых чисел от 1 до самого числа.
//        Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
//        ! -обозначение факториала.

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial on " + n + " = " + fact);
        System.out.println();


        System.out.println("Task #2\n");

//        Задача 2
//        Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("The number of even numbers in array is " + counter);
        System.out.println();



        System.out.println("Task #3\n");

//        Задача 3
//        Есть массив целых чисел. Написать программу, находящую разницу между значением
//        максимального и минимального элементов. (max - min).

        int max = numbers[0];
        int min = numbers[0];

        for ( int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if ( numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Difference between max and min element = " + (max - min));
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

        int m = 6;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
