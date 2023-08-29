package ait.hw_task1.temperature_of_may;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthTemperatureTest {
    MonthTemperature monthTemperature;

    @BeforeEach
    void setUp() {
        monthTemperature = new MonthTemperature();
    }

    @Test
    void maxTemp() {
        double[] arr = {15.0, 18.3, 25.0, 23.2};
        assertEquals(25.0, MonthTemperature.maxTemp(arr));
    }

    @Test
    void minTemp() {
        double[] arr = {15.0, 18.3, 25.0, 23.2};
        assertEquals(15.0, MonthTemperature.minTemp(arr));
    }

    @Test
    void averageTemp() {
        double[] arr = {10.0, 20.0, 30.0, 40.0};
        assertEquals(25.0, MonthTemperature.averageTemp(arr));

    }
}