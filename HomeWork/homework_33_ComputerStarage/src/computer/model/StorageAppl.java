package computer.model;

import computer.dao.StorageImpl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class StorageAppl {
    public static void main(String[] args) {

        StorageImpl storage = new StorageImpl(200);

        Computer[] comp = new Computer[9];

        comp[0] = new Computer(123456781, 2022, "Apple", "MacBook Pro");
        comp[1] = new Computer(123456782, 2021, "Acer", "model2");
        comp[2] = new Computer(123456783, 2019, "Acer", "model3");
        comp[3] = new Computer(123456784, 2023, "HP", "model4");
        comp[4] = new Computer(123456785, 2015, "Lenovo", "model5");
        comp[5] = new Computer(123456786, 2018, "Apple", "MacBook Pro");
        comp[6] = new Computer(123456787, 2022, "Lenovo", "mode6");
        comp[7] = new Computer(123456788, 2018, "HP", "model7");
        comp[8] = new Computer(123456789, 2020, "Acer", "model2");

        for (int i = 0; i < comp.length; i++) {
            storage.addComputer(comp[i]);
        }
        System.out.println(storage.size());
        System.out.println("================ Unsorted ====================");
        printComp(comp);
        System.out.println("================ Sorted by Article =====================");
        Arrays.sort(comp);
        printComp(comp);
        Comparator<Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return Long.compare((long)o1.getArticle(), (long) o2.getArticle());
            }
        };
        Arrays.sort(comp, comparator);
        System.out.println("================ Sorted by Article and Model =====================");
        printComp(comp);

    }


    public static void printComp(Computer[] comps) {
        for (Computer computer : comps) {
            System.out.println(computer);
        }
    }

}
