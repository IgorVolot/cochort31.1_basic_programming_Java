package homework_22_t1_store;

import homework_22_t1_eShop.Goods;

import java.util.Arrays;

public class Basket {
    private int size = 0;
    private Store[] arr = new Store[1];

    public void addStore(Store element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        Store[] tempArray = new Store[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public Store[] getArray() {
        Store[] tempArray = new Store[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += arr[i].getTitle() + ((i == size - 1) ? "]" : "\n");
        }
//        res += "]";
        return res;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }
    }

    public void removeByTitle(String title) {
        int index = getIndexByTitle(title);
        remove(index);
    }

    public int getIndexByTitle(String title) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (title.equals(arr[i].getTitle())) {
                return i;
            }
        }
        return res;
    }

    public int prodQuantities() {
        return size;
    }

    public double orderSum() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }

    public void placeOrder() {
        for (int i = 0; i < size; i++) {
            arr[i].buy();
        }
    }
}
