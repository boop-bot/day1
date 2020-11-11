package edu.epam.task1.service;

import edu.epam.task1.entity.Number;

public class NumberService {
    public int getLastDigitOfSquareNumber(Number number) {
        int result = 0;
        int lastDigit = number.getLastDigit();
        result = (lastDigit * lastDigit) % 10;
        return result;
    }
}
