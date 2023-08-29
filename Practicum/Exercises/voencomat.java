package Exercises;

import java.util.Scanner;

public class voencomat {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your name ");
        String name = scanner.nextLine();
        System.out.println("Print your surname ");
        String surname = scanner.nextLine();
        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        if (age >= 18){
            if (age <= 28){
                System.out.println(name + militaryCommissar);
            }
        } else {
        }

    }
}
