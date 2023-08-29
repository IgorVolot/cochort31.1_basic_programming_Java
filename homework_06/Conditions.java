package homework_06;

public class Conditions {
    public static void main(String[] args) {
         /*
        Есть две переменные целого типа. Написать программу, выводящую на экран true если значение одной из переменных = 10
        или сумма значение переменных равна 10. Иначе на экран выводится false.
Пример: int a = 10, int b = 9 -> true
int a = 1 , int b = 9 -> true
int a = 4 , int b = 10 -> true
int a = 4 , int b = 3 -> false
         */

        int a, b;
        a = 10;
        b = 9;

        boolean var_boolean =  a == 10 || b ==10 || (a+b) == 10;  // можно записать так boolean var_boolean =  (a == 10) || (b ==10) || (a+b == 10);
        System.out.println(var_boolean);

        int c, d;
        c = 1;
        d = 9;

        boolean var_boolean_1 =  c == 10 || d ==10 || (c+d) == 10;
        System.out.println(var_boolean_1);

        int e, f;
        e = 4;
        f = 10;

        boolean var_boolean_2 =  e == 10 || f ==10 || (e+f) == 10;
        System.out.println(var_boolean_2);

        int g, h;
        g = 4;
        h = 3;

        boolean var_boolean_3 =  g == 10 || h ==10 || (g+h) == 10;
        System.out.println(var_boolean_3);

    }
}
