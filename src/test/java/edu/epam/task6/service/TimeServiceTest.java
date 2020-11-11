package edu.epam.task6.service;

import edu.epam.task6.entity.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeServiceTest {
    @Test()
    public void timeTest() {
        int seconds = 3600;
        TimeService timeService = new TimeService();
        Time time = timeService.getTime(seconds);
        assertEquals(time.getHours(), 1);
        assertEquals(time.getMinutes(), 0);
        assertEquals(time.getSeconds(), 0);
    }
}