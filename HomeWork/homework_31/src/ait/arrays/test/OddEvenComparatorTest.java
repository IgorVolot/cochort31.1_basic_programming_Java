package ait.arrays.test;

import ait.arrays.utils.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {
    /*
    Write OddEvenComparator implementing Comparator with the method compare for sorting an array of
    Integers in the order: The even integers should go before odd numbers.

    Напишите OddEvenComparator, реализующий Comparator с методом сравнения для сортировки массива.
     Целые числа в порядке: четные числа должны идти перед нечетными числами.
     */
    Integer[] arrNum;
    int num;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{25, 83, 28, 19, 19, 7, 2, 26, 30, 74, 28, 40, 17, 74, 52, 21, 7, 26, 1};
    }

    @Test
    void testPrintArray() {
        System.out.println("======= testPrintArray ==========");
        OddEvenComparator.printArray(arrNum);
    }
    @Test
    void testSearch(){
        System.out.println("======== testSearch =============");
        int index = OddEvenComparator.search(arrNum,7);
        System.out.println("index= "+index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("======= testFindByPredicate ========");
        Integer res = OddEvenComparator.findByPredicate(arrNum, n -> n % 2 == 0);
        System.out.println(res);
    }

    @Test
    void testBubbleSort() {
        System.out.println("======= testBubbleSort ===========");
        Arrays.sort(arrNum);
        OddEvenComparator.printArray(arrNum);
    }

    @Test
    void testSortNumsOddAndEven() {
        System.out.println("========= testSortNumsOddAndEven ========");
        Arrays.sort(arrNum, (n1,n2) -> (n2 % 2 != 0? n2: n1));
        OddEvenComparator.printArray(arrNum);
    }
}