package practices;

import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {
        // Задача 1. Реализуйте метод, который вычисляет длину гипотенузы
        // прямоугольного треугольника по двум заданным пользователем катетам (теорема Пифагора).

        // Шаг 1. Создать сканер
        // Щаг 2. Запросить данные у пользователя

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input catet a: ");
        double a = scanner.nextDouble();
        System.out.println("Input catet b: ");
        double b = scanner.nextDouble();

        // Шаг 3.
        pifagorMethod(a,b);  // с передачей ему аргументов

    }
    // start method
    public static void pifagorMethod(double x, double y) {  // объявили метод с параметрами на входе
        double c = Math.sqrt(x * x + y * y); // или  = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Hipotenusa = " + c);
    }


    // end of method
}
