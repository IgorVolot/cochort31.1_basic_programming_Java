package homework_11;

public class hw_11_t_03 {
    public static void main(String[] args) {
        System.out.println("Task #3\n");

//        Задача3
//        Написать метод, принимающий массив целых чисел, и печатающий его
//        в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.

        int[] array = {14,73,20,8,-15,-45,21,-999};

        contrariwise(array);
    }
    // ---------Methods-----------
    public static void contrariwise(int[]arr){
        int i = arr[0];
        int x = arr[0];

        for ( i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();

        arr[0] = arr[arr.length - 1 ];
        arr[arr.length - 1 ] = x;

        System.out.println("Print swapped array");
        i = 0;

        while (i < arr.length){
            System.out.print(arr[i] + " | ");
            i++;
        }

    }
    // ---------------------------
}
