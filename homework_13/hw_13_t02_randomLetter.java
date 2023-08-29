package homework_13;

import java.util.Arrays;

public class hw_13_t02_randomLetter {
    public static void main(String[] args) {
        System.out.println("Task #2\n");

        //Задача 2.
        //Реализуйте метод, который заполняет массив случайными буквами.
        // Размер массива подается на вход методу.

        char[] letters = new char[40];
        letters = randomLetters('a');

        System.out.print(letters); // 1-й вариант  в печать
        System.out.println();

        for (char element : letters){
            System.out.print(element + " ");  // 2-й вариант  в печать
        }
        System.out.println();
        System.out.println(Arrays.toString(letters));  // 3-й вариант  в печать

    }
    // ----------------Method------------------
    public static char[] randomLetters(char lit) {

        char[] randLetter = new char[26];
        char a = 'a';
        char b = 'z';
        int i = 0;

        while (i < randLetter.length ) {
            randLetter [i] = (char) (Math.random() * (b - a + 1) + a );
            i++;
        }
        return randLetter;
    }
    // ----------------------------------------
}
