package homework_11;

public class hw_11_t_01_01 {
    public static void main(String[] args) {
        System.out.println("Task #1\n");
        // Задача1
        //Реализуйте с помощью метода конвертор, который переводит скорость
        // в милях в час в скорость в км/час. 1 миля равна 1609 метров.
        // Метод получает на вход данные от пользователя с клавиатуры.

        convertSpeed(100);

    }

    public static void convertSpeed(double speedMiles){
        double speedKm = 1.609 * speedMiles;
        System.out.println("Speed in miles/hour is " + speedMiles + " and speed in km/hour is " + speedKm);
    }
}
