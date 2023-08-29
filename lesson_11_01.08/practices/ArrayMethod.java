package practices;

public class ArrayMethod {
    public static void main(String[] args) {

        // Задача 4. реализуйте метод, который получает на вход массив и находит его минимальный элемент.

        // Шаг 1. Создать массив
        // Шаг 2. Сделать метод

        int[] array = {14,73,20,8,-15,-45,21,-999};

        minElOfArray(array);  // вызов метода

    }
    //-----------Methods-----------
    public static void minElOfArray(int[] arr){
        // ищем минимальный элемент
        int min = arr[0];   //  переменная для минимума (первый элемент массива)
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min element of array is: " + min);
    }
    // ----------------------------
}
