package homework_13;

public class hw_13_t04_minAndMax {
    public static void main(String[] args) {
        System.out.println("Task #4\n");

        // Задача 4 (*)
        //Написать метод, возвращающий минимальный и максимальный элемент
        // из поданного ему на вход массива целых чисел.

        int [] ints = {25,95,39,26,65,-36,0,-95,62,196};

        minAndMax(ints);
    }
    // --------------------Method----------------------
//    public static int [] minAndMax (int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int min = nums[0];
//            int max = nums[0];
//            if (nums[i] > max){
//                 max = nums[i];
//                return nums;
//            } else if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        return nums;
//    }

    public static int[] minAndMax(int[] nums) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]< min) {
                return nums;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {

            }
        }
        return nums;
    }
    // ------------------------------------------------
}
