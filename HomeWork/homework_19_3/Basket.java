package homework_19_3;

import java.util.Arrays;

public class Basket {

    private Goods[] arr = new Goods[1];
    private int size = 0;

    // 1. Constructor

    // заполняем массив ----------------------------
    // 3.условие и запрос на увеличение массива
    public void add(Goods element) {
        if (size < arr.length) {
            increaseBasket();
        }
        arr[size] = element;
        size++;
    }

    // 2.увеличение массива
    private void increaseBasket() {
        Goods[] tempArray = new Goods[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public String specialtoString() {
        return Arrays.toString(arr) + " size: " + size;
    }


    // 4. вывод в печать
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i] + "\n";
        }
        res += "";
        return res;
    }

    public Goods[] getBasketAsArray() {
        Goods[] tempArray = new Goods[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public void remove(int index) {
        if (index >=0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
        }
        size--;
    }

    public int getIndexById(int id) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].getId() == id) return i;
        }
        return res;
    }

    public void removeById(int id) {
        int index = getIndexById(id);
        remove(index);
    }

    public int quantity() {
        return size;
    }

    public double summ() {
        double summ = 0;
        for (int i = 0; i < size; i++) {
            summ += arr[i].getPrice();
        }
        return summ;
    }


}
