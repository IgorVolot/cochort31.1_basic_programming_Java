package computer.model;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private long article;
    private int year;
    private String brandName;
    private String model;

    public Computer(long article, int year, String brandName, String model) {
        this.article = article;
        this.year = year;
        this.brandName = brandName;
        this.model = model;
    }

    public long getArticle() {
        return article;
    }

    public void setArticle(long article) {
        this.article = article;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer: " + "article- " + article + ", " + brandName +"-" + model  + ", manufactured in " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return article == computer.article && Objects.equals(brandName, computer.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article, brandName);
    }

    @Override
    public int compareTo(Computer o) {
        int result  = brandName.compareTo(o.brandName);
        if (result != 0){
            return result;
        }

        return Integer.compare(year,o.year);
    }
}
