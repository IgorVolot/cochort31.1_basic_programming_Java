package homework_10;

public class hw_10_t_04 {
    public static void main(String[] args) {
        System.out.println("============ Home work 31.07.2023 Igor Volotovskyi ==========\n");

        System.out.println("Task #3\n");
//        Задача3
//        Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
//        Формула для расчета С = 5*(F-32)/9. Результат вывести на экран

        fahrenheit();
    }

    // начало методов

    public static void fahrenheit(){
        int f = 72;
        int c = (5 * (f - 32))/9;
        System.out.println(c+ "C " + "= " + f + "f ");
    }

    // конец методов
}
