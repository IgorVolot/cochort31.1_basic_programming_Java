package homework_19_3_01;

public class Main {
    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар (придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления и
        добавления товара в корзину. Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */

        Product[]array ={new Product("product title 1", 8.6),
                new Product("product title 2", 8.6),
                new Product("product title 3", 81.3),
                new Product("product title 4", 10.5),
                new Product("product title 5", 3.6),
                new Product("product title 6", 4.0)
        };

//        Product product1 = new Product(1,"product title 1", 8.6);
//        Product product2 = new Product(1,"product title 1", 8.6);
//        Product product3 = new Product(1,"product title 1", 8.6);
//        Product product4 = new Product(1,"product title 1", 8.6);
//        Product product5 = new Product(1,"product title 1", 8.6);
//        Product product6 = new Product(1,"product title 1", 8.6);

        for (Product product:array){
            System.out.println(product);
        }

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[1]);
        cart.add(array[4]);
        cart.add(array[2]);
        System.out.println(cart);

        cart.removeById(3);
        System.out.println(cart);

        System.out.println("Quantity: "+cart.quantity());
        System.out.println("Amount: "+ cart.summ());

        System.out.println("=======================================================================");

        Product p1 = new Product("product title 1", 8.6);
        Product p2 = new Product("product title 2", 83.46);

        System.out.println(p1);
        p1.temp=10;
        System.out.println(p2);
        System.out.println(p1);
        System.out.println(array[5]);
        array[0].temp++;
        System.out.println(p2);

        Product.temp=132356;
        System.out.println(p1);

        Product.print();

        StaticDemo.printMsg("this is message"); // вызов от класса, без создания объекта, если "static", и конечно он "public".
    }
}
