package homework_11;

import java.util.Random;

public class hw_11_t_04_01 {
    public static void main(String[] args) {
        // Задача 4 (*)
        //Имеется массив данных - остатки на счетах клиентов банка
        // (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        // количество клиентских счетов = 20). Произошла деноминация,
        // теперь 1 д.е = 100 старых д.е. Рассчитайте новые остатки денег на счетах клиентов.


        Random random = new Random();
        double[] randomMoney = new double[20];
        for (int i = 0; i < randomMoney.length; i++){
            randomMoney[i] = random.nextDouble()*(100_000_000 - 10000); // можно и так записать границы случайности.
            System.out.printf("%.2f \n", randomMoney[i]);
        }

        countNewAmount(randomMoney);
    }


    public static double[] countNewAmount(double [] money){
        double[] denominated = new double[20];
        System.out.println("Denominated array\n");
        for (int i = 0; i < money.length; i++){
            denominated[i] = money[i] / 100.0;
            System.out.printf("%.2f %n", denominated[i]);  // %n - все с новой строчки
        }
        return denominated;
    }

}
