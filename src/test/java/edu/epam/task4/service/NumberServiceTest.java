package edu.epam.task4.service;

import edu.epam.task4.entity.NumberArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    @Test()
    public void isTwoEvenNumbersTrue() {
        NumberArray array = new NumberArray(34, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertTrue(condition);
    }
    @Test()
    public void isTwoEvenNumbersFalse() {
        NumberArray array = new NumberArray(33, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertFalse(condition);
    }
}