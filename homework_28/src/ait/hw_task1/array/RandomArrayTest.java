package ait.hw_task1.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomArrayTest {
    RandomArray randomArray;

    @BeforeEach
    void setUp() {
        randomArray = new RandomArray();
    }

    @Test
    void findDuplicateElement() {
        int[] arr = {10, 20, 10, 30, 40};
        assertEquals(10, RandomArray.findDuplicateElement(arr));
    }
}