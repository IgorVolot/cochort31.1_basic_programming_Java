package homework_10;

import java.util.Scanner;

public class hw_10_t_01 {
    public static void main(String[] args) {
        System.out.println("============ Home work 31.07.2023 Igor Volotovskyi ==========\n");
        System.out.println("Task #1\n");

        // Задача1
        //Написать программу, которая принимает с клавиатуры имя , фамилию и возраст
        // (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        //First name: John
        //Last name: Smith
        //Age: 25

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name ");
        String name = scanner.nextLine();

        System.out.println("Please, enter your surname ");
        String surname = scanner.nextLine();

        System.out.println("Please, enter your age in digits ");
        int age = scanner.nextInt();

        System.out.println("First name: " + name);
        System.out.println();
        System.out.println("Last name: " + surname);
        System.out.println();
        System.out.println("Age: " + age);
        System.out.println();
    }
}
