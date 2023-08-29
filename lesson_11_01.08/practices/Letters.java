package practices;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {

        // Задача 2. Реализуйте метод, который получает на вход строку
        // на английском языке и сообщает количество гласных букв в ней.

        // a, e, i, o, u, y - гласные буквы

        // Шаг 1. Создать сканер
        // Щаг 2. Запросить строку от пользователя
        // Шаг 3. Пишем метод, который принимает эту строку на вход
        // Шаг 4. Пройти циклом по всей строке charAt(index) и посчитать количество гласных

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String st = scanner.nextLine().toLowerCase();  // читает с клавиатуры до нажатия "Enter", включая пробелы и переводит все буквы в маленький регистр
//        st = st.toLowerCase();   можно так (отдельной строкой)


        // вызов метода
        findLetters(st);  // передаем ему на вход аргумент st

    }
    // ----Method----

    public static void findLetters(String s) {
        int count = 0;  // объявили переменную, которая отвечает за счетчик гласных букв
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'a' || s.charAt(i) == 'e'  || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y' ) {
                // увеличивать счетчик
                count++;
            }
        }
        System.out.println("Number of vowels letter are: " + count);
    }


    // --------------
}
