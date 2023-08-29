package homework_10;

public class hw_10_t_02 {
    public static void main(String[] args) {
        System.out.println("============ Home work 31.07.2023 Igor Volotovskyi ==========\n");

        System.out.println("Task #2\n");
        //Задача2
        //Оформить решение задачи в виде методов
        // Написать программу, вычисляющую факториал числа 5.
        // Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        // Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
        //  ! -обозначение факториала.

        factorial();
    }
    // начало методов
    public static void factorial(){
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println();
        }
        System.out.println("Факториал числа 5 = " + fact);
    }
    // конец методов

}



