package homework_13;


import java.util.Arrays;
import java.util.Scanner;

public class hw_13_t03_integerNumbers {
    public static void main(String[] args) {
        System.out.println("Task #3\n");

        // Задание 3.
        // Реализовать метод, выводящий на экран все делители введенного
        // пользователем целого числа. Вернуть массив со всеми делителями числа.

        Scanner consol = new Scanner(System.in);

        System.out.println("Enter integer number \n");
        int x = consol.nextInt();

        int [] nums = new int[x];

       System.out.println(Arrays.toString(integerDividers(4)));


    }
    // ------------------Methods------------------
    public static int[] integerDividers (int x) {
        int [] ints = new int[x + 1];

        for (int i = 0; i < x; --i) {   //x = ints.length - 1; (4)

            int result = 0;
            if ( ( ints[i] != 0 & ints[i] % x == 0 ) ){
                result = x - ints[i];
                System.out.println();
            }
        }
        return ints;

    }

    //--------------------------------------------
}
