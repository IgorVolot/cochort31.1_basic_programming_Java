package hw.ait.tree;

import java.util.*;

/*
Дана String с произвольным текстом (без знаков препинания слова разделены пробелом).
Необходимо получить map, где ключом будет выступать первая буква слова, а значением, список слов начинающихся на эту букву.
 */
public class Main {
    public static void main(String[] args) {

        String text = "If a class has multiple methods having same name but different in parameters, it is known as Method Overloading";

        String replaced = text.toLowerCase().replace(',', ' ');
        String[] textToArray = null;
        textToArray = replaced.split(" ");
        for (int i = 0; i < textToArray.length; i++) {
            System.out.println(textToArray[i]);
        }
        List<String> list = Arrays.stream(textToArray).toList();
        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------");

        System.out.println(listHandler(list));

    }

    public static Map<String, List<String>> listHandler(List<String> list) {
        Map<String, List<String>> result = new HashMap<>();
        if (list == null) return result;
        for (String lists : list) {
            result.put(lists.substring(0), result.get(lists));
        }
        return result;
    }

}
