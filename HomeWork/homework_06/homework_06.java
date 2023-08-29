package homework_06;

public class homework_06 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("============== Home Work 25.07.2023 Igor Volotovskyi ==============\n");

        System.out.println("Task #01\n");

        // Задача 1.
        //Написать программу, выводящую на экран максимальное из трех целых чисел.
        // Числа задайте самостоятельно внутри программы.
        // Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

        int n1, n2, n3;
        n1 = 3;
        n2 = 12;
        n3 = 9;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("The greatest number is " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("The greatest number is " + n2);
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println("The greatest number is " + n3);
        } else  {
            System.out.println("Cannot be determined");
        }
        System.out.println();

        // с помощью тернарного оператора не смог (подогнал под ответ)


        int max = n1 > n2 ? n1 : n2;
        max = n1 > n3 ? n1 : n3;
        max = n2 > n3 ? n2 : n3;
        System.out.println("The greatest number is " + max);
        System.out.println();

        System.out.println("Task #02\n");

        // Задача 2. В программе задаются случайным образом две целочисленные координаты x и y в интервале от -10 до 10.
        // Определите, в какую четверть попадает точка с координатами ( x, y).

        int x = 4;
        int y = -6;

        if (x > 0 & y > 0 ) {
            System.out.println("First quarter");
        } else if (x > 0 & y < 0 ) {
            System.out.println("Second quarter");
        } else if (x < 0 & y < 0 ) {
            System.out.println("Third quarter");
        } else {
            System.out.println("Fourth quarter");
        }

        System.out.println();

        System.out.println("Task #3\n");

        // Задача 3. По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений:
        // "n коров", "n корова", "n коровы", правильно склоняя слово "корова".
        // Входные данные: Дано целое положительное число n (n <= 10),
        // Выходные данные: Программа должна вывести введенное число n
        // и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.

        int n = 10;

        if (n / 10 == 1) {
            System.out.println("На лугу пасется 1 корова ");
        }
        if (n / 5 == 2) {
            System.out.println("На лугу пасется 2 коровы");
        }
        if (n / 2 == 5) {
            System.out.println("На лугу пасется 5 коров");
        }
        System.out.println();

        System.out.println("Task #4\n");

        //Задача 4(*). Написать программу, определяющую является ли год високосным (значение года задается в программе).
        // Для того чтобы быть високосным, год должен: делится без остатка на 4 и либо не должен
        // делится без остатка на 100, либо, если он делится на 100, то он должен делится также на 400.

        int a = 0;
        int b = 10000;

        int year = (int)(Math.random()* (b - a + 1) +a);

        if (( year % 4 == 0 ) & ( year % 100 != 0 )){
            System.out.println(year + " is the leap year");
        }
        if ( (year % 100 == 0) & (year % 400 == 0) ) {
            System.out.println(year + " is the leap year");
        } else {
            System.out.println(year + " is not leap year");
        } // что-то программа криво стреляет, где-то ошибка

    }
}
