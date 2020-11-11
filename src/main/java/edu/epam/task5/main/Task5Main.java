package edu.epam.task5.main;

import edu.epam.task5.entity.Number;
import edu.epam.task5.report.NumberReport;
import edu.epam.task5.service.NumberService;


public class Task5Main {
    public static void main(String[] args) {
        Number number = new Number(8128);
        NumberService numberService = new NumberService();
        boolean result = numberService.isPerfect(number);
        NumberReport report = new NumberReport();
        report.printPerfectReport(result, number);
    }
}
