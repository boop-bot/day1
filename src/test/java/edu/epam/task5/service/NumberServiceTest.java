package edu.epam.task5.service;

import edu.epam.task5.entity.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    @Test()
    public void isPerfectCorrect() {
        Number number = new Number(496);
        NumberService service = new NumberService();
        boolean result = service.isPerfect(number);
        assertTrue(result);
    }
    @Test()
    public void isPerfectNotCorrect() {
        Number number = new Number(1111);
        NumberService service = new NumberService();
        boolean result = service.isPerfect(number);
        assertFalse(result);
    }
}