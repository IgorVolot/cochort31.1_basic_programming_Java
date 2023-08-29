package homework_19_2_01;

import java.util.Scanner;

public class NumbersReader {
    public SmartArray read() {
        SmartArray result = new SmartArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input integer numbers");
        System.out.println(" '0' means the end if input");

        int num;
        do {
            System.out.println("next number: ");
            num = scanner.nextInt();
            if (num == 0) return result;
            result.add(num);
        } while (true);

        // или как вариант
//        do {
//            System.out.println("next number: ");
//            num = scanner.nextInt();
//            if (num!=0) result.add(num);
//        } while (num!=0);


    }
}
