package qwerty;

import java.util.Arrays;

public class Main {
    final static int a=10; // it's about final
    final static int[]arr={10,11,12};
    public static void main(String[] args) {
//        int [] array = {4,-2,8,0,7,6,5,-5,77,4};
        int [] array = {-5,-2,0,4,4,5,6,7,8,77};
//        System.out.println(Arrays.search(array,-2)); // 1
//        System.out.println(Arrays.search(array,77));  // 8
//        System.out.println(Arrays.search(array,333));  // -1
//        System.out.println(Arrays.search(array,4));  // 0



        System.out.println("============================================");

        System.out.println(Arrays.binarySearch(array,0));   // 2
        System.out.println(Arrays.binarySearch(array,-5));   // 0
        System.out.println(Arrays.binarySearch(array,99));   // -10
        System.out.println(Arrays.binarySearch(array,7));   // 7
        System.out.println(Arrays.binarySearch(array,4));   // 3


//        a=11;  // impossible to change
        arr[0]=133; // possible to change



    }
}
