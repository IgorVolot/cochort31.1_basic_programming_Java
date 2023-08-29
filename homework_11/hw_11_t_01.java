package homework_11;

import java.util.Scanner;

public class hw_11_t_01 {
    public static void main(String[] args) {
        System.out.println("============ Home work 01.08 Igor Volootovskyi =========\n");
        System.out.println("Task #1\n");
        // Задача1
        //Реализуйте с помощью метода конвертор, который переводит скорость
        // в милях в час в скорость в км/час. 1 миля равна 1609 метров.
        // Метод получает на вход данные от пользователя с клавиатуры.

        // Шаг 1. Создать сканер
        // Щаг 2. Запросить данные у пользователя

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of speed in mph here: ");
        int speed = scanner.nextInt();

        converter(speed);

    }
    // -----------Methods---------
    public static void converter(double mph){
        double kmh = 1.609 * mph;
        System.out.printf("in kmh = %.2f", kmh);
        System.out.println();
    }
    // --------------------------
}
