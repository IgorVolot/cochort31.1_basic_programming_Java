package homework_12;

public class hw_12_t_03 {
    public static void main(String[] args) {
        System.out.println("Task #3\n");

        // Задача 3.
        // Написать метод, принимающий массив целых чисел и число и находящий индекс
        // этого числа(элемента) в массиве. Если такой элемент есть, возвращается его индекс,
        // если нет, метод возвращает -1. В методе main() вывести получившийся результат на экран.

        int[] inst = {3,4,-7,27,99,10,-38,55,0,37,93};
        findIndex(inst, 10);
    }
    // ----------- Methods --------------
    public static void findIndex(int[] inst, int x){
        boolean flag = false;
        int i;
        int y = 0;
        for ( i = 0; i < inst.length; i++){
            if (inst [i] == x){
                flag = true;
                y = i;
            }
        }
        if (flag){
            System.out.println("Element " + x + " presents in array and its index is " + y );
        } else {
            System.out.println("Element " + x + " doesn't present in array.");
        }
    }
    // ----------------------------------
}
