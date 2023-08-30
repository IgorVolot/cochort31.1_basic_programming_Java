package aitf;

import aitStore.SmartArray;

public class NumbersHandler {
    private aitStore.SmartArray numbers;
    public NumbersHandler (SmartArray numbers){
        this.numbers=numbers;
    }

    public int getQuantity(){
        int size = numbers.getArray().length;
       return size;
    }

    public double calcAverage(){
        int[] array = numbers.getArray();
        double summ = 0;
        for ( int num: array){   // num => [i]
            summ+=num;
        }
        return summ/array.length;
    }
    public void printStat(){
        System.out.println("The total quantity of numbers: "+getQuantity()+" Average value: "+calcAverage());
    }

}
