package code.src;

public class Singleton {
    public final static String MESSAGE = "this is singleton pattern";
    private static Singleton INSTANCE = null;   // 3.
    public int temp;                            // 7.

    private Singleton() {                        // 1.
        System.out.println("we are in constructor");
    }

    public static Singleton getInstance() {     // 2.
        if (INSTANCE == null) {                 // 4.
            INSTANCE = new Singleton();
        }
        return INSTANCE;                        // 5.
    }

    public void print() {                       // 6.
        System.out.println(MESSAGE);
        System.out.println(temp);

    }


}
