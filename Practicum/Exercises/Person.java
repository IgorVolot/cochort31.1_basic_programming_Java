package Exercises;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
              // чтение с клавиатуры и вывод их на экран (имя , фамилия , возраст)
        Scanner scanner = new Scanner(System.in);  // включаем прием ввода данных с клавиатуры
        System.out.println("Input your name ");  // приглашение пользователю
        String name = scanner.next();  // получение данных с клавиатуры от пользователя
        System.out.println("Input your lastname ");  // приглашение пользователю
        String lastname = scanner.next();  // получение данных с клавиатуры от пользователя
        System.out.println("Input your age ");  // приглашение пользователю
        byte age = scanner.nextByte();  // получение данных с клавиатуры от пользователя (byte, int, short, .. ,)
        // выводим данные на экран
        System.out.println("Your name: " + name);
        System.out.println();
        System.out.println("Your lastname: " + lastname);
        System.out.println();
        System.out.println("Your age: " + age);
    }
}
