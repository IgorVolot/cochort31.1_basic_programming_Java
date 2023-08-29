package practices;

public class MoneyOnAccount {
    public static void main(String[] args) {
//        Задание 1. Реализуйте метод, который получает на вход сумму вклада,
//        процентную ставку и количество дней, а возвращает накопленный доход.
//        Формула для расчета: https://www.raiffeisen.ru/wiki/kak-rasschitat-procenty-po-vkladu/

        double sum = 0;
        double percent = 0;
        int days = 0;

        double g = gainIncome(350_000, 4.7, 273);
        System.out.println("Gain = " + g);

        System.out.println(gainIncome(350_000, 4.7, 273));


    }
    // -----------------Methods-----------------------

    public static double gainIncome(double summ, double percent, int days) {  // имена могут совпадать в разных областях видимости
//        double s = summ;
//        double p = percent;
//        int d = days;
//        int dy = 365;
//
//        double result = (s * p * d / dy) / 100.0;
//
//        // где:
//        //
//        //result — выплаченные проценты,
//        //s — первоначальная сумма вложений,
//        //p — годовая ставка,
//        //d — количество дней вклада,
//        //dy — количество дней в году — 365 или 366.
//
//        return result;

        // можно в одну строчку
        return (summ * percent * days / 365 ) / 100.0;

    }




    // ------------------------------------------------
}
