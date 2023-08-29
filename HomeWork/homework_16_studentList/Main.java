package studentList_hw_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        #1 Создать класс Student со следующими полями (String firstName, String lastName,
        MyDate birthday, String group, MyDate startCourse}
Создайте пару объектов этого класса. Напишите метод studentToString(Student student),
который возвращает строку с данными студента.
         */
        System.out.println("Hello! You're welcome on my page\n");
        Scanner scanner = new Scanner(System.in);

        Student student = getStudentFromScanner(scanner,"Please, enter your name, lastname, day of birth, your group name and date of your course start");
        System.out.println(student.toString());

        student.sayHello();

    }
    public static Student getStudentFromScanner ( Scanner scanner, String msg){
        Student student = new Student();
        System.out.println("Input your first name: ");
        student.firstName = scanner.nextLine();
        System.out.println("Input your last name: ");
        student.lastName = scanner.nextLine();
        student.birthday = getMyDateFromScanner(scanner, "Input your date of birthday:");
        System.out.println("Input your group name: ");
        student.group = scanner.nextLine();
        student.startCourse = getMyDateFromScanner(scanner, "Input your date of course beginning: ");
        return student;
    }

    public static MyDate getMyDateFromScanner (Scanner scanner, String msg){
        System.out.println();
        MyDate date = new MyDate();
        System.out.println("Input your day: ");
        date.day = scanner.nextInt();
        System.out.println("Input your month: ");
        date.month = scanner.nextInt();
        System.out.println("Input your year: ");
        date.year = scanner.nextInt();
        scanner.nextLine();
        return date;
    }
    public static String studentGroup(String groupName){
        return groupName;
    }
}
