package homework_19_3;

import java.util.Arrays;

public class SmartArray {
    private double[] arr = new double[1];
    private int size = 0;

    // 1.(5) промежуточная печать
    public String specialToString() {
        return Arrays.toString(arr) + " items: " + size;
    }

    // заполняем массив ----------------------------
    // 3.условие и запрос на увеличение массива
    public void add(int element) {
        if (size < arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    // 2.увеличение массива
    private void increaseArray() {
        double[] tempArray = new double[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    // 6. защита от внешних изменений
    public double[] getArray() {
        double[] tempArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    // 4. вывод в печать
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i];
        }
        res += "";
        return res;
    }

}
