package computer.dao;

import computer.model.Computer;

public interface Storage {
    boolean addComputer(Computer comp);

    Computer removeComputer(long article);

    Computer findComputerByArticle(long article);

    Computer[] findComputerByBrandName(String brandName);

    Computer[] findComputerByModel(String model);

    Computer[] findByYearOfManufactured(int year);

    int size();

}
