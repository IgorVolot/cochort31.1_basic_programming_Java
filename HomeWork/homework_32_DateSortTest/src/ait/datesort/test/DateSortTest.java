package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class DateSortTest {
    Comparator<String> dateComparator;
    String[] dates;


    @BeforeEach
    void setUp() {
        dates = new String[] {"07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16-06-1970"};
        dateComparator = (s1, s2) -> { s1.substring(6,9).compareTo(s2.substring(6,9));
            return Integer.parseInt(Arrays.toString(dates));
        };
    }


//    public Comparator<String> getDateComparator() {
//        return dateComparator;
//    }


    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);
    }

    @Override
    public String toString() {
        return "DateSortTest{" +
                "dateComparator=" + dateComparator +
                '}';
    }
}