package edu.epam.task5.service;

import edu.epam.task5.entity.Number;

public class NumberService {
    public boolean isPerfect(Number number) {
        int sum = 1;
        int tempNumber = number.getValue();
        if (number.getValue() == 0) {
            sum = 0;
        } else {
            for (int i = 2; i <= number.getValue() / 2; i++) {
                if (tempNumber % i == 0) {
                    sum += i;
                }
            }
        }
        return (sum == number.getValue());
    }
}
