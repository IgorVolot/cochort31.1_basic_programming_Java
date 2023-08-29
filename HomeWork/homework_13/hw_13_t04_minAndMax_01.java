package homework_13;

public class hw_13_t04_minAndMax_01 {
    public static void main(String[] args) {
        // Задача 4 (*)
        //Написать метод, возвращающий минимальный и максимальный элемент
        // из поданного ему на вход массива целых чисел.

        System.out.println();

        int [] nums = {3,1,8,9,6};

        int [] result = findMaxMin(nums);
        System.out.println("Min element = " + findMaxMin(nums)[0] + " max element = " + findMaxMin(nums)[1]);  //  можно так
        // System.out.println("Min element = " + result [0] + " max element = " + result[1]);   // - но лучше так (более читабельно)
    }
    // ---------------------------------------------
    public static int[] findMaxMin (int[] numbers){
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
       // int[] minMax = {min, max};
        return new int[] {min,max};
    }
    //  --------------------------------------------
}
