package practices;

public class method {
    public static void main(String[] args) {
        int result = sumNumbers(2,8);
        System.out.println(result + 1);

        System.out.println(sumNumbers(1,3)); // можно записать и так

        String res = helloName("Ann");
        System.out.println(res);
    }

    public static int sumNumbers(int a, int b){   // вместо void записываем int, как тип переменной, используемой в методе
        int sum = a + b;
        System.out.println();
        return sum;  // если после return мы указываем переменную, то смотри пункт выше
                     // result - выводит значение за пределы метода
    }

    // Написать метод, принимающий имя и возвращающий строку типа Hello, name!

    public static String helloName(String name){
        String res = "Hello, " + name + " !";

        // return res; // 1-й вариант

        return "Hello, " + name + " !"; // 2-й вариант

    }
}
