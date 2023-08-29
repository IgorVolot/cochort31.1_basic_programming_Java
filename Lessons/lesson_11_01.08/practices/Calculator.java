package practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Задача 3. Calculator:
        //добавить ввод чисел и математического действия пользователем;
        //реализовать все вычисления методами, которые получают данные для вычислений на вход.

        // Шаг 1. Создать сканер
        // Щаг 2. Запросить строку от пользователя
        // Шаг 3. Пишем метод, который принимает эту строку на вход

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        double a = scanner.nextDouble();
        System.out.println("Input action: ");
        String action = scanner.next();    // .next() - ввод до пробела  / .nextLn() - до "Enter"
        System.out.println("Input second number: ");
        double b = scanner.nextDouble();


        switch (action) {
            case  "+" : {
                sum(a, b);
                break;
            }
            case  "-" : {
                subst(a, b);
                break;
            }
            case  "*" : {
                multiplay(a, b );
                break;
            }
            case  "/" : { // это деление для целых чисел
                division(a, b);
                break;
            }
            case "q" :{
                return;
            }
            default: {
                System.out.println("Can't understand");
            }
        }


    }
    // -----Methods---------

    public static void sum(double a, double b){
        System.out.println(a + b);

    }
    public static void subst(double a, double b){
        System.out.println(a-b);
    }
    public static void multiplay(double a, double b){
        System.out.println(a*b);
    }
    public static void division(double a, double b){
        System.out.println(a/b);
    }


    // ---------------------
}
