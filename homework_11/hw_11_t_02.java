package homework_11;

public class hw_11_t_02 {
    public static void main(String[] args) {
        System.out.println("Task #2\n");

        //Задача2
        //Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход
        // массив и определяет сумму его элементов.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        sumOfArray(array);
    }
    // ---------Methods--------
    public static void sumOfArray(int[] arr){
        int i  = arr[0];
        int sum = 0;

        while (i < arr.length){
            sum = sum + i++;
        }
        System.out.println("The summ of numbers in array is: " + sum);
    }
    //-------------------------
}
