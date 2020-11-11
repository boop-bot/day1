package edu.epam.task1.service;

import edu.epam.task1.entity.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    @Test()
    public void isLastDigitCorrect() {
        Number number = new Number(44);
        NumberService service = new NumberService();
        int result = service.getLastDigitOfSquareNumber(number);
        assertEquals(result, 6);
    }
    @Test()
    public void isLastDigitNotCorrect() {
        Number number = new Number(17);
        NumberService service = new NumberService();
        int result = service.getLastDigitOfSquareNumber(number);
        assertNotEquals(result, 0);
    }
}