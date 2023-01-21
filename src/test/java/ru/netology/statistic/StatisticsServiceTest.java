package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMore() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-897, -2, -56, -98, -7, -9, -23, -99999, -56, -4, -8};
        long expected = -2;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}