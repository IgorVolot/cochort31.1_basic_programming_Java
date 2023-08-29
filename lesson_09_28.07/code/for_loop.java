package code;

public class for_loop {
    public static void main(String[] args) {

        // Цикл  For
        /*
        for( initialisation; condition; increment/decrement ) {
            statement(s)
            }
        initialisation - присвоение начального значения переменной, которая будет изменяться в цикле

        condition - булеановое выражение, определяющее будет ли выполняться цикл

        increment/decrement - изменение счетчика
         */

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        for ( int i = 100; i > -100; i-=5 ) {  // шаг increment/decrement может быть любой i++; i--; i+15 и т. д.
            System.out.println(i);
        }
        System.out.println("End of loop\n");

        for (int count = 10; count < 5; count++) {
            count++;
        }

        // примеры написания кодов for

        int i, j;
        for ( i = 0, j = 10; i < j; i++, j--){
            System.out.println("i and j: "+i+" "+j);
        }

        int k = 0;
        for ( ; k <10; ){
            System.out.println(k);
            k++;
        }
//
//        for ( ;; ){        // бесконечный цикл
//        }
        System.out.println("---------------------------------------");


        // посчитать сумму чисел от 0 до n, используя цикл for
        int n = 10;
        int sum = 0;

        for ( int l = 0; l <= n; l++){
            sum += l;
        }
        System.out.println(sum);

        System.out.println();

        // без тела цикла

        int y;
        sum = 0;

        for ( y = 0; y <= n; sum += y++ );

        System.out.println("sum without body is " + sum);





    }
}
