package HW_17_Cars;

public class Main {
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
        MyDate date1=new MyDate(10,4,2017);
        Engine engine1=new Engine(175,"benzine");
        Car car1=new Car("Audi", "black", "AAA7788", date1, engine1);
        Car car2=new Car("BMW", "white", "AAA8877", new MyDate(21,8,2022), new Engine(239,"diesel"));
        Car carWithProblem=new Car("WV","gray","BBB5544", new MyDate(11,6,2021), engine1);  //!!!!

        Car[] cars ={ car1,car2,carWithProblem};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
        System.out.println("------------GO--------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
        System.out.println("-----------test the second drive() call -------------- ");
        cars[0].drive();
        cars[0].stop();
        cars[0].drive();

        System.out.println("===========================   1   ==========================");
        cars[0].stop();
        cars[0].ignition();
        cars[0].drive();

        System.out.println("==========================    2   ========================");
        cars[0].stop();
        cars[0].ignition();
        System.out.println(cars[0].toString());

        System.out.println("------------STOP------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].stop();
        }

//  =======================================    Reference probleme  ========================================================
        // one object engine for two cars!!!!!!
        /*
        Engine engine1=new Engine(175,"benzine");
        Car car1=new Car("Audi", "black", "AAA7788", date1, engine1);
        Car carWithProblem=new Car("WV","gray","BBB5544", new MyDate(11,6,2021), engine1);  //!!!!
         */
        System.out.println("=========================    Reference probleme  ====================================");
        car1.stop();
        carWithProblem.stop();
        System.out.println(car1);
        System.out.println(carWithProblem);
        System.out.println();

        System.out.println("car1 should start engine");
        car1.ignition();
        System.out.println();

        System.out.println(car1);
        System.out.println(carWithProblem);
        System.out.println("==================================  Private  demo  ====================================================");

        Car car4 = new Car("Opel", "blue", "11111", new MyDate(10,10,2010), new Engine(150,"electro"));
//        car4.isDrive=true;  // the isDrive is private => error!!!

        System.out.println(car4);
        System.out.println();

        Persone p1 = new Persone("John", 20);
        Persone p2 = new Persone("Ann", 21);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("The age of p1 is:"+p1.getAge());  // getAge() - we've got access to age value just to use it, with no change!!!

    }
}
