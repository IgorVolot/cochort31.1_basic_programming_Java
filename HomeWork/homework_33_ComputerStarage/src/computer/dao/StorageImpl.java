package computer.dao;

import computer.model.Computer;

import java.util.function.Predicate;

public class StorageImpl implements Storage {
    private Computer[] comps;
    private int size;

    public StorageImpl(int capacity) {
        comps = new Computer[capacity];
    }

    @Override
    public boolean addComputer(Computer comp) {
        if (comp != null || size <= comps.length || findComputerByArticle(comp.getArticle()) == null) {
            comps[size] = comp;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Computer removeComputer(long article) {
        for (int i = 0; i < size; i++) {
            if (comps[i].getArticle() == article) {
                Computer compForRemove = comps[i];
                comps[i] = comps[size - 1];
                comps[size - 1] = null;
                size--;
                return compForRemove;
            }
        }
        return null;
    }

    @Override
    public Computer findComputerByArticle(long article) {
        for (int i = 0; i < size; i++) {
            if (comps[i].getArticle() == article) {
                return comps[i];
            }
        }
        return null;
    }

    @Override
    public Computer[] findComputerByBrandName(String brandName) {
        Predicate<Computer> predicate = computer -> computer.getBrandName().equals(brandName);
        return findComputerByBrandName(brandName);
    }

    @Override
    public Computer[] findComputerByModel(String model) {
        Predicate<Computer> predicate = computer -> computer.getModel().equals(model);
        return findComputerByModel(model);
    }

    @Override
    public Computer[] findByYearOfManufactured(int year) {
        Predicate<Computer> predicate = computer -> computer.getYear() == year;
        return new Computer[0];
    }

    private Computer[] findByPredicate(Predicate predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(comps[i])) {
                count++;
            }
        }
        Computer[] result = new Computer[count];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (predicate.test(comps[i])){
                result[j++]= comps[i];
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }
}
