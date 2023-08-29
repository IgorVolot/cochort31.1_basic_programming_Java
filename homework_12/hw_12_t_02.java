package homework_12;

public class hw_12_t_02 {
    public static void main(String[] args) {
        System.out.println("Task #2\n");

        // Задача 2.
        // Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
        // если нет false.
        // static boolean checkOnesAndZeros( int[] ints)
        // В методе main() вывести получившийся результат на экран

        int[] array = {3,4,-7,27, -1,99,10,-38,55,0};

        System.out.println(checkOnesAndZeros(array));


    }
    // ------Methods----------
    public static boolean checkOnesAndZeros( int[] ints){
        boolean result = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints [i] == 0 || ints [i] == -1){
                result = true;
            }
        }
        return result;
    }
    //-----------------------
}
