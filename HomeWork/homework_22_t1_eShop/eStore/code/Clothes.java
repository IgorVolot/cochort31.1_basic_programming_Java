package code;

public class Clothes {

    private Goods goods;

    public Clothes(Goods goods) {
        this.goods = goods;
    }
    public void buy(){
        goods.buy();
    }
    public void buy(int a){
        goods.buy();
    }
    public String toString(){
        return goods.toString();
    }
}
