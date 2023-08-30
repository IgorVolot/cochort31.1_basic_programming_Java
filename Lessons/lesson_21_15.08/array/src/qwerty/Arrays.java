package qwerty;

public class Arrays {

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //  array should be SORTED!!!!
    public static int binarySearch(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length-1;

        while (leftIndex <= rightIndex) {
            int mid = (rightIndex + leftIndex) / 2;
            if (array[mid] == value) return mid;
            if (array[mid] < value) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }
        return -10;

    }
}
