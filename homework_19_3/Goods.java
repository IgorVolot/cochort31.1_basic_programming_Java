package homework_19_3;

public class Goods {
    public static int temp;
    private static int counter = 0;

    private String title;
    private double price;
    private int id;

    public Goods(String title, double price) {
        counter++;
        this.id = counter;
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return id + "Name of product: " + title + " Price: " + price + "." + temp;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}
