package ait.hw_task1.ip_address;

import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args) {
        /*
        Программа получает на вход IP-адрес в одну строку: например, 192.168.23.1 (четыре числа, разделённые точками).
        Каждое число должно быть в диапазоне от 0 до 255. Программа должна вывести эти четыре числа по отдельности.
        Идеальное решение: создать Java-класс IPAddress и реализовать в нем метод валидации создаваемого объекта.
        Альтернативное решение: IP-адрес вводится с клавиатуры, используются самостоятельно разработанные методы.
        Разработать тесты.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number from 0 till 255 ");
        int ipNum1 = scanner.nextInt();
        System.out.println("Enter the number from 0 till 255 ");
        int ipNum2 = scanner.nextInt();
        System.out.println("Enter the number from 0 till 255 ");
        int ipNum3 = scanner.nextInt();
        System.out.println("Enter the number from 0 till 255 ");
        int ipNum4 = scanner.nextInt();
        scanner.close();

        int[] ipNum = {ipNum1, ipNum2, ipNum3, ipNum4};

        String ip = new String(ipNum1 + "." + ipNum2 + "." + ipNum3 + "." + ipNum4);
        System.out.println(ip);

        System.out.println("You entered " + validateIp(ipNum, false) + " numbers");
    }

    public static boolean checkIp(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (!(num[i] >= 0 && num[i] <= 255)) {
                return false;
            }
        }
        return true;
    }

    private static String validateIp(int[] ip, boolean b) {
        b = false;
        for (int i = 0; i < ip.length; i++) {
            if (checkIp(ip) == b) {
                return "wrong";
            }
        }
        return "right";
    }
}
