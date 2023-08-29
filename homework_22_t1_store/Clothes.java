package homework_22_t1_store;

public class Clothes {
    private Store store;

    public Clothes(Store store) {
        this.store = store;
    }

    public void buy() {
        store.buy();
    }

    public String toString() {
        return store.toString();
    }

}
