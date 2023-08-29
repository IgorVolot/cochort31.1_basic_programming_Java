package code;

public class Main_01 {
        public static void main(String[] args) {

                // Независимая система исчисления
                // XXII = 10 + 10 + 1 + 1 = 22

                // Позиционная система исчисления
                // 1. Десятичная система
                // 513 = 5*100 + 1*10 + 3*1
                // 513 = 5*10^2 + 1*10^1 + 3*10^0

                // 2. Двоичная система исчесления 0 или 1 (decimal binary)
    /*
    0           000
    1           001
    2           010
    3           011
    4           100
    5           101
    6           110
    7           111
    8          1000

    101 = 1*2^2 + 0*2^1 + 1*2^0 = 4 + 0 + 1 =  5

    ASCII (American Standard Code for Information Interchange

    a...z - 26 символов
    A...Z - 26 символов
    0...9 - 10 символов
    ,.!$&^ -* и т.д. - 32 символа
    всего - 95
    -------------------------------------------------------------------
    16 система

    Hexadecimal        Decimal        Binary
       0                 0             0000
       1                 1             0001
       2                 2             0010
       .
       .
       A                 10
       B                 11
       C
       D
       E
       F                 15
     */


        /*public static void main(String[] args){
                System.out.println("\u0024");

                /*  Тип char
                В Java для хранения символов используется 2 байта, т.е. можно хранить символы в дапазоне от 0 до 65535.
                Java использкет Unicode. ASCII являются частью юникода в диапазоне от 0 до 127.

                */
                char ch;
                ch='X';
                // ch = 'a';

                System.out.println("This is character: "+ch);
                System.out.println("This is character: "+'X');

                ch++;
                System.out.println("ch is now: "+ch);

                int chInt = 'X';
                System.out.println("chInt is: "+chInt);

                System.out.println("He says \"hello\" ");
                //    \"  - для передачи двойных кавычек
                //    \'  - для передачи одинарной кавычки
                //    \\  - для передачи слеш
                //    \n  - перевод каретки (печать с новой строки)
                //    \t  - табуляция
                //    \u0000 - символ юникода

                System.out.print("Hello\n");
                System.out.print("\nJava");
                // "Hello\n"  - \n заменяет команду System.out.println();
                System.out.println();
                System.out.println("Hello\tJava\tHello");

                System.out.println("k");  // строка из одного символа
                System.out.println('k');  // символ

                Human john = new Human();
                john.name="John";
                john.age=25;

                System.out.println("code.Human's name is "+john.name);
                System.out.println("code.Human's age is "+john.age);

                Human bill = new Human();
                bill.name="Bill";
                bill.age=46;

                System.out.println("code.Human's name is "+bill.name);
                System.out.println("code.Human's age is "+bill.age);
                bill.canTalk();
                bill.canWalk();


        }




}
