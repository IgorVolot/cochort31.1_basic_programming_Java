package homework_10;

public class hw_10_t_03 {
    public static void main(String[] args) {
        System.out.println("============ Home work 31.07.2023 Igor Volotovskyi ==========\n");

        System.out.println("Task #2\n");
        //Задача2
        // Оформить решение задачи 4 про треугольник из предыдущего домашнего задания в виде методов.
//        Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
//        1
//        12
//        123
//        1234
//        12345
//        123456
        triangle();
    }

    public static void triangle(){
        int m = 6;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
