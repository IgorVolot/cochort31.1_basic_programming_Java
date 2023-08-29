package unit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSumTest {
    ArraysSum arraysSum;

    @BeforeEach
    void setUp() {
        arraysSum = new ArraysSum();
    }

    @Test
    void sumElemOddIndex() {
        int[] arr = {10,20,-30,40}; // тестовый массив
        // Элементы с нечетными индексами это 20, 40. Их сумма 60.
        assertEquals(60,ArraysSum.sumElemOddIndex(arr));

    }
}