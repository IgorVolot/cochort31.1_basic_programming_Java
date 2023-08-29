package homework_12;

public class hw_12_t_01 {
    public static void main(String[] args) {
        System.out.println("============== Home work 02.08 Igor Volotovskyi ===============\n");

        System.out.println("Task #1\n");

//        Задача 1.
//        Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
//        Пример: Hello-> EL
//        В методе main() вывести получившийся результат на экран

        String st = "Hello";
        System.out.print("Hello-> ");

        String st1 = chLoChToUp(st);
        System.out.println(st1);
    }
    // ------Methods----------
    public static String chLoChToUp(String hello){
        String hel = hello.substring(1,3).toUpperCase();
        return hel;
    }
    //-----------------------
}
