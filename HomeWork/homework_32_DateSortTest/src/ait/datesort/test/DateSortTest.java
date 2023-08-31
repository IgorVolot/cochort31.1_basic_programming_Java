package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class DateSortTest {
    String[] dates;
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            for (int i = 0; i < dates.length; i++) {
                if(s1.compareTo(s2)>0){
                    dates[i] = dates[i+1];
                }
            }
            return 0;
        };
    }



    public Comparator<String> getDateComparator() {
        return dateComparator;
    }


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