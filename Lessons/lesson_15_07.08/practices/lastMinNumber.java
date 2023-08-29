package practices;

import java.util.Random;

public class lastMinNumber {
    public static void main(String[] args) {
        // Написать метод, который получает массив целых чисел, и
        // возвращает последнее число в массиве , которое меньше 0.

        //Random randomNums = new Random();
        int [] numbers = {2,-9,45,83,-64,0,58,39};
        int [] numbers2 = {-2,9,45,83,64,0,58,39};
        System.out.println(getLastLessThanZeroNum(numbers));
        System.out.println(getLastLessThanZeroNums(numbers2));

    }
    // -------------------------------------------------------
    public static int getLastLessThanZeroNum(int [] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<result){
                result = array[i];
            }
        }
        return result;
    }
    // -----------------------------------------------------
    public static int getLastLessThanZeroNums(int[] arr){
        int result = 0;
        for (int i = arr.length - 1; i>=0; i--){
            if (arr[i]<result){
                result = arr[i];
            }
        }
        return result;
    }
}
