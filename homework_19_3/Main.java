package homework_19_3;

import homework_19_3_01.Cart;
import homework_19_3_01.Product;

public class Main {
    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар (придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления и
        добавления товара в корзину. Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */


        Goods[] array = {
                new Goods("Royal Canin 2kg", 16.95),
                new Goods("Royal Canin 4kg", 26.95),
                new Goods("Royal Canin 4kg", 26.95),
                new Goods("Hill's 2,5kg", 19.25),
                new Goods("Hill's 2x2,5kg", 40.75),
                new Goods("Royal Canin 2kg", 16.95)
        };

        for (Goods goods : array) {
            System.out.println(goods);
        }
        System.out.println();
        System.out.println("Your basket: ");

        Basket basket = new Basket();
        basket.add(array[0]);
        basket.add(array[1]);
        basket.add(array[4]);
        basket.add(array[2]);
        System.out.println(basket);

        System.out.println("Your basket: ");

        basket.removeById(3);
        System.out.println(basket);

        System.out.println("Quantity: " + basket.quantity() + ".");
        System.out.println("Amount: " + basket.summ() + "$");


    }
}
