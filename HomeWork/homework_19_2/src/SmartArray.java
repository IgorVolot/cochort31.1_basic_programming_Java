package src;

import java.util.Arrays;

public class SmartArray {
    private int size = 0;
    //    private int result;
    private int[] arr = new int[4];

    public void add(int element) {
        if (size < arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        int[] tempoArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempoArr[i] = arr[i];
        }
    }

    private String averageToString() {
        String result = "(";
        for (int i = 0; i < arr.length; ) {
            result = result + ((arr[i] + arr[i++]) / size);
        }
        result += ")";
        return result;
    }

    public String speciTotoString() {
        return Arrays.toString(arr) + " size of array: " + size + " Average value:";
    }

    // получение данных
    public void getArray() {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i];
        }
        res += "]";
        return res;
    }

}
