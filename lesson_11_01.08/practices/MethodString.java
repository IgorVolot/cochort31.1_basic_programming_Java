package practices;

import java.util.Scanner;

public class MethodString {
    public static void main(String[] args) {

        // 3. Написать метод, принимающий строку и печатающий ее два первых символа
        //    Hello -> He

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, print 'Hello' ");
        String hello = scanner.next();
        word(hello);
    }
    public static void word(String str){
        System.out.println(str.substring(0,2));
    }

}
