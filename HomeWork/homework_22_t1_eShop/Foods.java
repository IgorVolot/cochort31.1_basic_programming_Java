package homework_22_t1_eShop;

public class Foods {
    private double urgPrice;
    private Goods goods;
    public Foods (Goods goods){
        this.goods=goods;
    }

    public void buy(){
        System.out.println("Your order contain: " + goods.getTitle());
        System.out.println("The standard delivery time is 24 hours.");
        buyUrgent();
    }
    public void buyUrgent(){
        System.out.println("We can deliver your order within 1 hour for an additional " + urgPrice + " Eur.");
    }
}
