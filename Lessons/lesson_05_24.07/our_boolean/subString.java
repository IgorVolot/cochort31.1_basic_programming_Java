package our_boolean;

public class subString {

    public static void main(String[] args) {

        String javaString = "Java";

        int charlen = javaString.length();
        System.out.println(charlen);


        // substring() method. Находит часть строки начиная с символа на указаной позиции

        //             0 1 2 3 4
        //             w o r l d
        String world = "world";
        String subWorld = world.substring( 1); // начиная с символа по индексу 1
        System.out.println("subWorld");

        /* находит часть строки начиная с символа на указанной позиции (beginIndex) и заканчивая ( но не включая ) символ окончания нужного отрезка ( endIndex )

         */

        subWorld = world.substring(1,4);
        System.out.println(subWorld);

        subWorld = world.substring(1);
        System.out.println(subWorld);

        subWorld = world.substring(0);
        System.out.println(subWorld);

        // в методе substring() символ на позиции индекса начала
        // индекс не может быть меньше 0 и индекс конца подстроки не может беньше индекса начала.



    }
}
