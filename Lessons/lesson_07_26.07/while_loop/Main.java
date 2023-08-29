package while_loop;

public class Main {
    public static void main(String[] args) {

        /* если надо распечатать 5 единиц ???
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

         */

        // while ( condition ) {
        // statement;
        // statement;
        // }

        int i = 0; // присвоение начального значения переменной условия цикла

        while ( i < 10 ) {
            System.out.println(i); // или записать System.out.println(i++);
            i++; // если не поставить i++ будет бесконечный цикл
        }

        System.out.println("End of loop");

        int j =10;

        while ( j > 1 ){
            System.out.println(j);
            j--;
        }

        /*  еще один пример бесконечного цикла

        while (true) {
            System.out.println("Hello");
        }
         */

        // распечатать латинский алфавит из маленьких букв
        System.out.println("Print alphabet");
        char ch = 'a';

        while (ch <= 'z') {
            System.out.print(ch+ " ");
            ch++;
        }
        System.out.println();

        // Написать программу, считающую сумму чисел от 1 до 5.
        // 1+2+3+4+5

        // от 1 до 100

        int y = 1;
        int sum = 0;
        int n = 100;

        while (y <= n){
            sum = sum + y; // 1
            y++;
        }
        System.out.println("sum of " + n + " digits is " + sum);
        System.out.println();

        int y1 = 1;
        int sum1 = 0;
        int n1 = 0;   // в данном случае приведет к ложности условия цикла

        while (y <= n){
            sum1 = sum1 + y1; // 1
            y1++;
        }
        System.out.println("sum of " + n1 + " digits is " + sum1);

        // цикл DO-WHILE
        /*
        Отличие цикла do-while от while заключается в том, что проверка условия в нем происходит в конце цикла
         */

        int g =10;

        do {
            System.out.println(g);
            g--;
        } while (g > 1);

        System.out.println("End of do-while\n");

        //  Вложенные циклы. Цикл может находиться внутри другого цикла.

        // Пример: Написать программу, выводящую на экран таблицу умножения.

        System.out.println("Multiplication Table ");

        int i1 = 1;
        while (i1 <= 9){  // i1 = 1

            int j1 = 1;
            while (j1 <= 9){  // j1 = 1
                System.out.println(i1 + " * " + j1 + " = " + j1*i1);
                j1++;
            }
            System.out.println("**************");
            i1++;
        }
    }
}
