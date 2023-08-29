package homework_19_3_01;

import java.util.Arrays;

public class Cart {
    private int size = 0;
    private Product[] arr = new Product[4];          // !!

    public void add(Product element) {               // !!
        if (size < arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        Product[] tempArray = new Product[arr.length * 2]; //!!
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public String specialtoString() {
        return Arrays.toString(arr) + " size: " + size;
    }

    // защита от внешних изменений
    public Product[] getArray() {                       // !!!
        Product[] tempArray = new Product[arr.length];  // !!
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i] + "\n";
        }
        res += "]";
        return res;
    }

    // удаление из корзины (ячеки из массива)
    public void remove(int index) {
        if (index >=0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }

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

    // сумма заказа
    // объявление size
    public int quantity() {
        return size;
    }

    // сумма
    public double summ() {
        double summ = 0;
        for (int i = 0; i < size; i++) {
            summ += arr[i].getPrice();
        }
        return summ;
    }
}
