package practices;

public class MethodHiBye {
    public static void main(String[] args) {

        // 2. Написать метод, принимающий две строки  и печатающий их таким образом, что
        //    если принятые строки Hi  и Bye , то напечатано будет HiByeByeHi

        hiBye();

    }
    // ----------Methods----------
    public static void hiBye(){
        String hi = "Hi";
        String bye = "Bye";
        System.out.println( hi + bye + bye + hi);
    }
    // --------------------------
}
