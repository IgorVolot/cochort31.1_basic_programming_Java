package code;

//  можно вручную импортировать класс, который находится в стандартных библиотеках Java ( обычно происходит автоматически
//  после создания нового источника "Scanner" ниже)
import java.util.Scanner;

// import java.util.*;   - импортирует все классы Java из папки util.

public class our_scanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  // создаем сканер
//
//        System.out.println("Enter a number ");
//        int num1 = scanner.nextInt();  // чтение ввода пользователя и запись результата в переменную num1.
//
//        System.out.println("You enter number " + num1);
//
//        System.out.println("Enter next number ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("You enter number " + num2);
//        int sum = num1 + num2;
//
//        System.out.println(num1 + " + " + num2 + " = " + sum);

        System.out.println("-----------------------------------------------------------------\n");

        System.out.println("Enter your name ");
        String name = scanner.nextLine();  // метод для чтения строк nextLine() - считывает пользовательский ввод в виде строки

        System.out.println("Enter your surname ");
        String surname = scanner.nextLine();

        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + " " + surname + " ! " + "You are " + age + " old.");

        // next() - считывает пользовательский ввод в виде строки до пробела.

        System.out.println("Enter your name and surname ");
        String nameSecondName = scanner.next();
        System.out.println(nameSecondName);

        scanner.close();





    }
}
