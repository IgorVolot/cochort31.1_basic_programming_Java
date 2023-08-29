package homework_12;

public class hw_12_t_01_returnSubStr {
    public static void main(String[] args) {
        System.out.println("Task #1\n");

//        Задача 1.
//        Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
//        Пример: Hello-> EL
//        В методе main() вывести получившийся результат на экран

        String st = "Hello";  // определили строку
        String result = hello2Symbols(st); // вызвали метод, передали в него st, результат метода присвоили в переменную
        System.out.println(result);  //  напечатали

        //  альтернативный вывод в печать
        System.out.println(hello2Symbols(st));
    }
    // ---------Methods------------------
    public static String hello2Symbols (String s ) {
        return s.substring(1,3).toUpperCase();   //  метод возвращает второй и третий символы строки заглавными буквами.
    }
    // -----------------------------------
}
