package homework_08;

public class homework_08 {
    public static void main(String[] args) {

        System.out.println("=========== Home work 27.07.2023 Igor Volotovskyi ============\n");

        System.out.println("Task #1\n");

        // Задача 1
        // Собрать в массив данные о росте (или возрасте) членов группы. Выведите на печать максимальное и минимальное значение.

        int [] age = {25, 34, 56, 28, 43, 18, 36, 39, 41, 28, 25, 35, 22, 30, 44, 27};

        int i = 0;
        int min = age [0];

        while ( i < age.length) {
            if ( age[i] < min ) {
                min = age[i];
            }
            i++;
        }
        System.out.println("Min age of students is: " + min);

        int g = 0;
        int max = age[0];

        while ( g < age.length) {
            if ( age[g] > max ) {
                max = age[g];
            }
            g++;
        }
        System.out.println("Max age of students is: " + max);
        System.out.println();

        System.out.println("Task #2\n");

        // Задача 2
        // Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.

        int [] nums = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int i1 = 0;
        int max1 = nums[0];
        int point1 = 0;

        while ( i1 < nums.length ) {
            if ( nums[i1] > max1) {
                max1 = nums[i1];
                point1 = i1;
            }
            i1++;
        }
        System.out.println("Maximum number " + point1 + " and it is " + max1);

        int i2 = 0;
        int min2 = nums[0];
        int point2 = 0;

        while ( i2 < nums.length ) {
            if ( nums[i2] < min2){
                min2 = nums[i2];
                point2 = i2;
            }
            i2++;
        }
        System.out.println("Minimum number " + point2 + " and it is " + min2);
        System.out.println();

        System.out.println("Task #3\n");

        // Задача 3.
        // Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать. Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.


        int [] ranNum = new int[20];
        int a = 10;
        int b = 20;
        int in = 0;

        while ( in < ranNum.length ) {
            ranNum[in] = (int) (Math.random() * (b - a + 1) + a );
            System.out.print(ranNum[in] + " | " );
            in++;
         }
        System.out.println();

        int n1f = ranNum[in - ranNum.length];
        int n1l = ranNum[in - ranNum.length + (ranNum.length - 1)];

        System.out.println(n1l + " | " + n1f);
        System.out.println();


        System.out.println("Task #4\n");

        // Задача 4(*)
        // Создайте массив, содержащий в себе название карточных мастей.
        // Создайте массив, содержащий в себе карты от двойки до туза.
        // Раздайте из колоды по 6 карт на 4 игрока.

//        int crd = 6;
//        int pl = 4;
//
//        String [] lear = {"Diamonds", "Hearts", "Clubs", "Spades"};
//
//        String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//
//        int x = lear.length * rank.length; // кол-во карт
//
//        //--------- сюда дошел сам, далее с помощью Google,
//        // но все равно - код не работает :( --------------
//
//        // инициализация колоды
//        String[] table = new String[x];
//        for (int s = 0; s < rank.length; s++) {
//            for (int j = 0; j < lear.length; j++) {
//                table[lear.length * s + j] = rank[s] + " " + lear[j];
//            }
//        }
//
//        // перетасовка колоды
//        for (int s = 0; s < x; s++) {
//            int r = (int) (Math.random() * (x-s +1) + s); // случайная карта в колоде
//            String temp = table[r];
//            table[r] = table[s];
//            table[s] = temp;
//        }
//
//        // перетасованная колода выводится на экран
//        for (int s = 0; s < pl * crd; s++) {
//            System.out.println(table[s]);
//            if (s % crd == crd - 1)
//                System.out.println();
//        }





    }
}
