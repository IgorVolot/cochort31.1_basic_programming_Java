package practices;

import java.util.Scanner;

public class MethodScan {
    public static void main(String[] args) {

        //1. Написать метод, который принимает имя ( строку) и печатает
        //    Hello, name ,  заменяя переменную name на принятое значение
        //    John -> Hello, John

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name here: ");
        String name = scanner.nextLine();
        helloJohn(name);
    }
    // -------Methods--------
    public static void helloJohn(String name){
        System.out.println("Hello, " + name);
    }

    // ----------------------
}
