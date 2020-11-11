package edu.epam.task8.service;

import edu.epam.task8.entity.Number;

public class FunctionService {
    public Number getFunctionResult(Number number) {
        double x = number.getValue();
        double result = 0;
        if (x >= 3) {
            result = (- x * x + 3 * x + 9);
        } else {
            result = 1 / (x * x * x - 6);
        }
        return new Number(result);
    }
}
