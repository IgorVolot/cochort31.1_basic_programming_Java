package Exercises;
import java.util.Scanner;

public class ConvertorFtoC {
    public static void main(String[] args) {

        //        Метод для перевода градусов по фаренгейту в шкалу цельсия.
        //        Формула для расчета С = 5*(F-32)/9. Результат вывести на экран
        //.......................................................................

        // вызов метода

        convertorFtoC();

    }
    // начало метода
    public static void convertorFtoC() {
        // тело метода
        System.out.println("Enter the temperature in F: ");
        Scanner scanner = new Scanner(System.in);
        float tempF = scanner.nextFloat();
        double tempC = 5.0 * ((double) tempF - 32) / 9.0;
        System.out.println("Temperature in C = " + tempC);
        System.out.printf("Temperature in C = %.2f", tempC);  // формула (способ) - сократить до двух знаков после запятой

    }

    //    конец метода
}
