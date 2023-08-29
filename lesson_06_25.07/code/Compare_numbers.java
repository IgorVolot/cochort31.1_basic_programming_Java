package code;

public class Compare_numbers {
    public static void main(String[] args) {

        //1. Написать программу , определяющую является ли целое число положительным
        // отрицательным или нулем и выводит результат на экран
        // int x =

        int x = -5;

        if (x > 0) {
            System.out.println("Число положительное");
        }
        if (x < 0) {
            System.out.println("Число отрицательное");
        }
        if (x == 0) {
            System.out.println("Число равно 0");
        }

        int y = 5;

        if (y > 0) {
            System.out.println("Число положительное");
        }else if (y < 0) {
            System.out.println("Число отрицательное");
        }else  {
            System.out.println("Число равно 0");
        }




        // 2.  Есть три переменные целого типа. Написать программу, определяющую
        // равны ли эти числа или нет. Программа должна выводить на экран следующие
        // сообщения: "Все числа равны" - если они равны, "Все числа разные"- если разные
        // "Некоторые из чисел равны"- если какие-то равны

        int a, b, c;
        a = 7;
        b = 4;
        c = 7;

        if ( a == b || a == c || b == c ) {
            System.out.println("Некоторые из чисел равны");
        }

        a = 1;
        b = 2;
        c = 3;

        if ( a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if ( a == b || a == c || b == c ) {
            System.out.println("Some numbers are equal");
        } else {
            System.out.println("All numbers are different");
        }




        //3. Есть три переменные целого типа x, y, z. Написать программу, определяющую
        // их последовательность - если значения возрастают (1,2,3), то программа печатает
        // increasing,   если убывают (3,2,1) - decreasing, и "не убывают и не возрастают"
        // во всех остальных случаях ( neither decreasing nor increasing)

        int x1 = 1;
        int y1 = 2;
        int z1 = 3;

        if (x1 < y1 && y1 <z1) {
            System.out.println("Increasing");
        } else if (x1 > y1 && y1 > z1) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither decreasing nor increasing");
        }






    }
}
