package practice.unit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementTest {

    SumElement sumElement;

    @BeforeEach
    void setUp() {
    }

    @Test
    void averageEvenElements() {
        int [] arr = {10, 21, 20, 41};  // evens - 10+20, their average 15.0
        assertEquals(15.0, SumElement.averageEvenElements(arr));
    }
}