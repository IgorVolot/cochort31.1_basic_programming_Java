package homework_05;

public class homework_05 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("============ Home Work 24.07.2023 Igor Volotovskyi ========== \n");

        System.out.println("Task #01\n");

        /*
        Есть строка четной длины. Написать программу, выводящую на экран первую половину этой строки.
Пример: есть Hell , результат He
         */
        String hell = "Hell";

        int hh = hell.length() / 2;
        // System.out.println(hh);
        String halfHell = hell.substring(0, 2);
        System.out.println("The first half of string Hell is " + halfHell);

        System.out.println();


        System.out.println("Task #02\n");

        /*
        Есть две переменные целого типа. Написать программу, выводящую на экран true
        если значение одной из переменных = 10
        или сумма значение переменных равна 10. Иначе на экран выводится false.
Пример: int a = 10, int b = 9 -> true
int a = 1 , int b = 9 -> true
int a = 4 , int b = 10 -> true
int a = 4 , int b = 3 -> false
         */

        int a, b;
        a = 1;
        b = 9;

        boolean b1 = true;
        boolean b2 = false;

        if ( (a|b ) != 10 | (a+b) == 10) {
            System.out.println("a | b = 10 or (a+b) == 10 " + b1);
        }

        a = 4;
        b = 3;
        if ((a+b) != 10) {
            System.out.println("a + b = 10 " + b2);
        }

    }
}
