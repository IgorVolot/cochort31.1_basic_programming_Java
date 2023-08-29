package code;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        // Дано целое число. Определить сколько в нем цифр?

        Scanner scanner = new Scanner(System.in); // будет читать данные с клавиатуры
        System.out.println("Input number: ");
        int num = scanner.nextInt(); // получаем число с клавиатуры пользователя

        int count = 0;

        // узнаем сколько в нем цифр

        while (num > 0){
            num =  num / 10;
            System.out.println(num);
            count++;
            System.out.println(count);
        }
        System.out.println("Number of digits is: " + count);
    }
}
