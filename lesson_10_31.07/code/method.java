package code;

public class method {
    public static void main(String[] args) {

        printHello();
        System.out.println("After printHello - method\n");
        printHello();
        sumNumbers();


//        System.out.println("Hello World!");
//        System.out.println("Hello Java!");
//        System.out.println("Hello Java!");
//        System.out.println("Hello Java!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello Java!");
//        System.out.println("Hello World!");
//        System.out.println("Hello Java!");

    }

    // сигнатура метода
    static void printHello() {
        System.out.println("Hello World!");
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
        System.out.println("Hello Java!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello Java!");
        System.out.println("Hello World!");
        System.out.println("Hello Java!");

        System.out.println("------------------------------------");

    }



    static void sumNumbers(){
        int a = 4;
        int b = 3;
        int sum = a + b;
        System.out.println("a + b = " +sum);
    }
}
