package code;

public class continue_and_break {
    public static void main(String[] args) {

        // continue
        // используется в цикле. Если программа встречает слово continue, то
        // идущая за ним часть цикла пропускается и происходит переход к следующей итерации цикла.

        int [] arr = {2,67,34,8};

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == 67){
                continue;
            }
            System.out.println(arr[i]);
        }

        System.out.println();


//        for ( int i = 0; i < 5; i++) {
//            if (i ==3){
//                continue;
//            }
//            System.out.println(arr[i]);
//        }

        // Break
        // если в программе в цикле встречается слово break,
        // то происходит выход из цикла и переход к команде, следующей за циклом.

        System.out.println();

        for ( int i = 0; i < 100; i++) {
            System.out.println(i);
            if ( i == 50){
                break;
            }
        }

        System.out.println("Out of for loop");



    }
}
