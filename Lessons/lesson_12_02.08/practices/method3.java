package practices;

public class method3 {

    // sumNumbers - два одноименных метода в одном классе

    public static void main(String[] args) {
        System.out.println("With two args : " + sumNumbers(1,2));
        System.out.println("With three args : " + sumNumbers(1,2,3));
        System.out.println("With two args : " + sumNumbers(1.5, 4.6));
    }

    public static int sumNumbers(int a, int b){
        return a + b;
    }

    public static int sumNumbers(int a, int b, int c){  // изменено по каким-то признакам (добавили аргумент и все)
        return a + b + c;
    }

    public static double sumNumbers(double a, double b){
        return a + b;
    }
//    public static double sumNumbers(int a, int b){   // так не пройдет, double конфликтует с int и с указанным выше методом
//        return a + b;
//    }
}
