package src;

import src.ait.MyDate;

public class Main17 {
    public static void main(String[] args) {
        /*
        #1 Создать класс Car со следующими полями (String brand, String color, String licensePlate, MyDate registrationDate, Engine engine}
Обратите внимание, поля registrationDate и engine - это тоже объект. Engine - содержит информация о мощности двигателя и о типе (бензин, дизель, электро).

    Реализуйте метод toString в каждом классе.
    Реализуйте метод конструктор в каждом классе.
    Создайте два объекта автомобиля.
#2
В классе Engine добавьте методы start и stop. Каждый из них пусть выводит строку "Engine is started" "Engine is stopped".
В классе Car добавьте методы drive и stop. Первый должен заводить двигатель и писать, что такая-то машина поехала.
Второй, соответственно глушить двигатель и останавливать машину.

#3 ** Реализовать проверку, если машина уже едет, а я пытаюсь вызвать метод drive, должно появляться сообщение, что машина уже едет.
         */

        src.ait.MyDate date = new src.ait.MyDate(12,5,2012);
        Engine engine = new Engine(150,"benzine");
        Car car1 = new Car("Mercedes","white","AA2563BT", new src.ait.MyDate(19,12,2020), new Engine(239,"benzine"));
        Car car2 = new Car("BMW", "green","AH7755BP",new src.ait.MyDate(7,5,2019), new Engine(195, "diesel"));
        Car car3 = new Car("Opel","black", "SAK B737",new src.ait.MyDate(13,7,1996),new Engine(196,"diesel"));
        Car car4 = new Car("Tesla","white","B DO 245",new MyDate(28,2,2021), new Engine(130,"electric"));

        Car [] cars = {car1,car2,car3,car4};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }


    }
}
