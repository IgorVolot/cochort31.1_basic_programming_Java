package code;

public class for_each {
    public static void main(String[] args) {

        int [] inst = {2,67,34,8};

        for (int i = 0; i < inst.length; i++){
            System.out.println(inst[i]);
        }

        // for-each loop ( enhanced for )

        System.out.println("Print elements with for-each.");

        for (int num : inst) {
            System.out.println(num);
        }

        /*
        Цикл for-each служит для перебора элементов массива без указания индексов и длины массива.
        Создается "итерационная переменная" num, в которую последовательно на каждом шаге записывается
        очередное значение элемента массива. Она записывается в скобках после ключевого слова for.
        Дальше ставится двоеточие, и справа от двоеточия пишется имя перебираемого массива.
         */



    }
}
