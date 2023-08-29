package src;

public class Singleton2 {
    public final static String MESSAGE = "this is singleton pattern";
    public static final Singleton2 INSTANCE = new Singleton2();

    public int temp;

    private Singleton2() {   // 1. constructor
    }


    public void print() {
        System.out.println(MESSAGE);
        System.out.println(temp);
    }


}