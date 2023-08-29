package homework_07;

public class homework_07 {
    public static void main(String[] args) {
        System.out.println("============ Home Work 26.07.2023 Igor Volotovskyi ============");
        System.out.println();

        System.out.println("Task #1\n");
         /*
         Задача1
         С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
         Пример:для числа n=3
         1 в кубе 1
        2 в кубе 8
        3 в кубе 27
        */

        int n = 3;
        int a = 1;

        while (a > 0 && a <= n){
            int cube = (a * a * a);
            System.out.println("Cube of " + a + " = " + cube);
            a++;
        }

        System.out.println();
        System.out.println("Task #2\n");

        //Задача2
        //С помощью цикла while написать программу, выводящую на экран результат умножения данного числа n
        // на все целые числа от 0 до n
        //Пример: для числа 3 результат будет 0, 3, 6, 9

        int n1 = 3;
        int i = 0;

        while ( i >= 0 && i <= n1 ){
            int mul = n1 * i;
            System.out.println(n1 + " * " + i + " = " + mul);
            i++;
        }

    }
}
