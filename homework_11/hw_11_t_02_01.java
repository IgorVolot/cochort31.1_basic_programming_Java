package homework_11;

public class hw_11_t_02_01 {
    public static void main(String[] args) {
        int [] inst = {1,2,3,4,5,6,7,8,9};
        sumOfArray(inst);
    }

    //Задача2
    //Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход
    // массив и определяет сумму его элементов.

    static void sumOfArray(int[] inst){
        int sum = 0;

        for ( int i = 0; i < inst.length; i++){
            sum +=inst[i];
        }
        System.out.println("sum of element in array = " + sum);
    }
}
