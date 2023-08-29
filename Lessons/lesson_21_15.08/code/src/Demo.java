package src;

public class Demo {
    int var = 10;
    public static void main(String[] args) {
//        var1=111;  // error! can't get not static variable from static method
//        temp();    // error! can't get not static method from static method
        temp2();
        Demo main=new Demo();
        main.temp();
    }
    public void temp(){
        System.out.println("hello");
    }
    public static void temp2(){
        System.out.println("hello");
    }
}
