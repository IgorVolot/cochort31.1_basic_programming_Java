package homework_22_t1_store;

import homework_22_t1_eShop.Clothes;
import homework_22_t1_eShop.Electronics;
import homework_22_t1_eShop.Goods;

public class Main {
    public static void main(String[] args) {
        /*
        Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий: продукты, электроника, одежда.
        У каждого товара есть цена и наименование. У каждого товара есть метод купить, при покупке продуктов
        должна появиться дополнительная цена за срочность доставки. При покупке электроники, покупателю оформляют гарантию
        (т.е. при покупке должен выполнятся метод “Оформить гарантию”).

        Необходимо создать соответствующую структуру классов метод покупки товара.
        Вы можете использовать класс “корзина” реализованный ранее.

         */
        System.out.println("Your basket: \n");


        Clothes socks = new Clothes(new Goods("socks, 6 pair, size 35-38", 7.5));
        System.out.println(socks);
        socks.buy();


        Electronics e1 = new Electronics(new Goods("Milk Frother ", 19.9));
        System.out.println(e1);
        e1.buy();


    }
}
