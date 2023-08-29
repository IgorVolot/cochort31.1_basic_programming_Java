package practices;

public class lastMinNumber_01 {
    public static void main(String[] args) {

        // Написать метод, который получает массив целых чисел, и возвращает последнее число в массиве , которое меньше 0.

        int [] arr = {6,3,5,2,-7,4,-2,3};  // result  will be -2
        int [] arr1 = {6,3,5,2,7,4,2,3};   // result  will be 0
        System.out.println(getLastNumberLessThenZero(arr1));

    }
    // -----------------------------------------
    public static int getLastNumberLessThenZero (int [] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                result = array[i];
            }
        }
        return result;

    }
    //-----------------------------------------
}
