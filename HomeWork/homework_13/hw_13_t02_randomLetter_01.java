package homework_13;

import java.util.Arrays;
import java.util.Random;

public class hw_13_t02_randomLetter_01 {
    public static void main(String[] args) {
        // Задача 2.
        // Реализуйте метод, который заполняет массив случайными буквами.
        // Размер массива подается на вход методу.

        System.out.println("Print Letters");
        System.out.println(Arrays.toString(randomLetters(20)));

    }
    // -----------------Methods---------------------
    public static char[] randomLetters (int length) {
        char [] letters = new char[length];
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (random.nextInt(90 - 65 ) + 65);  // 90 - 65 берем значения по таблице кодов ASCII
            // letters[i] = (char) (random.nextInt(90,65));  пишется так, если комп ругается, то пиши как в предидущей строке
        }
        return letters;
    }
    // ----------------------------------------------
}
