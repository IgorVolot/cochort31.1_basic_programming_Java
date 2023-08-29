package homework_13;

import java.util.Arrays;

public class hw_13_t03_integerNumbers_01 {
    public static void main(String[] args) {
        // Задание 3.
        // Реализовать метод, выводящий на экран все делители введенного
        // пользователем целого числа. Вернуть массив со всеми делителями числа.

        System.out.println("Print all dividers\n");

        System.out.println(Arrays.toString(findAllDividers(9)));
    }
    // -------------------Methods--------------------
    public static int[] findAllDividers (int n) {
        int counter = 0;

        for (int i = 1; i <=n ; i++) {
            if ( n % i == 0) {
                counter++;
                //System.out.print(i + " | ");
            }
        }
        System.out.println();

        int[] dividers =new int[counter];

        int index = 0;
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0) {
                dividers[index] = i;
                index++;
            }
        }
        return dividers;
    }
    // ----------------------------------------------
}
