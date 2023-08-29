package src;

import java.util.Arrays;

public class InputNumbers {
    private int getNum;
    private int size = 0;
    private int[] array = new int[4];
    private boolean zero = false;

    private SmartArray arr;

    public InputNumbers(int getNum) {
        this.getNum = getNum;
        arr = new SmartArray();
    }

//    public void addNums(int nums) {
//        arr.add(nums);
//    }

    public void add(int element) {
        if (size >= array.length) {
            increaseArray();
        }
        array[size] = element;
        size++;
    }


    private void increaseArray() {
        int[] tempArr = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tempArr[i] = array[i];
        }
    }


    public String toString() {
        if (getNum == 0) {
            zero = true;
        }
        return "You have input the following numbers: " + array + " Total: " + size + " numbers. ";
    }
}
