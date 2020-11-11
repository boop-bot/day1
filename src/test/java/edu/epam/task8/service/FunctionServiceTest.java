package edu.epam.task8.service;

import edu.epam.task8.entity.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionServiceTest {
    @Test()
    public void FunctionResult1() {
        Number x = new Number(3);
        FunctionService functionService = new FunctionService();
        Number result = functionService.getFunctionResult(x);
        assertEquals(result.getValue(), 9);
    }

    @Test()
    public void FunctionResult2() {
        Number x = new Number(2);
        FunctionService functionService = new FunctionService();
        Number result = functionService.getFunctionResult(x);
        assertEquals(result.getValue(), 0.5);
    }
}