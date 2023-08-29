package homework_22_t1_store;

public class Electronics {
    private Store store;


    public Electronics(Store store) {
        this.store = store;
    }

    public void buy() {
        store.buy();
        makeWarranty();
    }

    public void makeWarranty() {
        System.out.println("The product includes the official warranty. Please, fill the form.");
    }

    @Override
    public String toString() {
        return store.toString();
    }
}
