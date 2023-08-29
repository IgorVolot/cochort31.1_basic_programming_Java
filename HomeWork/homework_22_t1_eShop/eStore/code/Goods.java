package code;

public class Goods {
    private String title;
    private double price;

    public Goods(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    public void buy(){
        System.out.println(" Your order contain: "+title);
        System.out.println(" Delivery next 72 hours. ");
    }
}
