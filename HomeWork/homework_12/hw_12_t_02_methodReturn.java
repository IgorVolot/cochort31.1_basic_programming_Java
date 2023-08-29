package homework_12;

public class hw_12_t_02_methodReturn {
    public static void main(String[] args) {
        System.out.println("Task #2\n");

        // Задача 2.
        // Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1.
        // Если да, метод возвращает true, если нет false.
        // static boolean checkOnesAndZeros( int[] ints)
        // В методе main() вывести получившийся результат на экран

        int[] array = {999,23,28,0,-38,8,-1,1001,56};

        System.out.println(checkOnesAndZeros(array));

    }
    // ---------------------Methods-----------------
    public static boolean checkOnesAndZeros( int[] ints) {
        boolean flag = false;
        for ( int i = 0; i < ints.length; i++) {
            if (ints[i] == 0 || ints [i] == -1) {
                flag = true;
                // можно написать return true;
            }
        }
        return flag;  // можно написать return false;
    }
    // --------------------------------------------
}
