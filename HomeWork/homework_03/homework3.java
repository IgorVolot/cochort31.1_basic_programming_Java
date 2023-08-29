package homework_03;

import java.sql.SQLOutput;

public class homework3 {
    public static void main(String[] args) {
        System.out.println("==============  Home Work 20.07.2023 Igor Volotovskyi ==============");
        System.out.println();
        System.out.println("Exercise #1");

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int j = 8;
        int k = 9;
        int sum1 = a + b + c + d + e + f + g + h + j + k;

        double sum2 = (double) sum1 / 10;

        System.out.println("Result = " + sum2);
        System.out.println();

        System.out.println("Exercise #2");

        int v = 1000;
        int y = 500;
        int z = v + y - 100;

        System.out.println("Стоимость суммы товаров со скидкой = " + z + "руб");
        System.out.println("Скидка = 100руб");
        System.out.println();

        System.out.println("Exercise #3");
        int day = 25 + 30 + 32 + 25 + 27 + 24 + 29 + 23; // температура днем
        int night = 17 + 13 + 17 + 17 + 18 + 15 + 17 +13; // температура ночью
        double w = (double) day / 7 + (double) night / 7;
        float t = (float) w / 2;

        System.out.println("Средняя температура за неделю г.Тодтмос - " + t);
        System.out.println();

        System.out.println("Exercise #4");

        int n = 2;
        int m = 3;
        System.out.println("Варианты остатка при делении числа на 2 - " + a / n + "," + (double) b / n + "," + c / n);
        System.out.println("Варианты остатка при делении числа на 3 -" + a / m + "," + (float) b / m + "," + (float) c / m);
        System.out.println();

        System.out.println("Exercise #5");
        int x = 3;
        int x1 = x += x++;

        System.out.println("Result - " + x1);



    }
}
