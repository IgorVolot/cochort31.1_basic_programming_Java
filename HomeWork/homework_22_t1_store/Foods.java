package homework_22_t1_store;

public class Foods {
    private double urgPrice;
    private Store store;

    public Foods(Store store) {
        this.store = store;
    }

    public void buy(){
        System.out.println("Your order contain: " + store.getTitle());
        System.out.println("The standard delivery time is 24 hours.");
        buyUrgent();
    }
    public void buyUrgent(){
        System.out.println("We can deliver your order within 1 hour for an additional " + urgPrice + " Eur.");
    }
}
