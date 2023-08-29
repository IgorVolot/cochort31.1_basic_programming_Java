package homework_22_t1_store;

public class Store {
    private String title;
    private double price;
    Basket basket = new Basket();

    public Store(String title, double price) {
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
