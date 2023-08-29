package code;

public class Electronics {
    private Goods goods;

    public Electronics(Goods goods) {
        this.goods = goods;
    }
    public void buy(){
        goods.buy();
        makeWarranty();
    }
    public void makeWarranty(){
        System.out.println("The product includes the official warranty. Please, fill the form.");
    }

    @Override
    public String toString() {
        return goods.toString();
    }
}
