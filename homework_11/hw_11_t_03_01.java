package homework_11;

public class hw_11_t_03_01 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArray(array);
    }

    //        Задача3
//        Написать метод, принимающий массив целых чисел, и печатающий его
//        в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.


    public static void reverseArray(int[]inst){
        for (int i = inst.length - 1; i >= 0; i--){
            System.out.print(inst[i] + " | ");
        }
    }
}
