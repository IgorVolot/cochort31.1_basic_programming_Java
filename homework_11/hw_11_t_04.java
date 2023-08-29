package homework_11;

public class hw_11_t_04 {
    public static void main(String[] args) {
        System.out.println("Task #4\n");

        // Задача 4 (*)
        //Имеется массив данных - остатки на счетах клиентов банка
        // (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        // количество клиентских счетов = 20). Произошла деноминация,
        // теперь 1 д.е = 100 старых д.е. Рассчитайте новые остатки денег на счетах клиентов.


        int[] ranArray = new int[20];
        int a = 10000;
        int b = 100000000;
        int i = 0;

        System.out.println("After denomination you've got on your accounts \n");

        while (i < ranArray.length){
            ranArray[i] = (int) (Math.random() * (b - a + 1) +a);
            ranArray[i] = ranArray[i] / 100;
            i++;
        }
        for (i = 0; i < ranArray.length; i++){
            System.out.print( ranArray[i] + " | ");
        }
    }
}        // у меня не получилось вывести в печать массив "до деноминации" ???
