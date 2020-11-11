package edu.epam.task1.main;

import edu.epam.task1.entity.Number;
import edu.epam.task1.report.NumberReport;
import edu.epam.task1.service.NumberService;

public class Task1Main {
    public static void main(String[] args) {
        Number number = new Number(13);
        NumberService numberService = new NumberService();
        int result = numberService.getLastDigitOfSquareNumber(number);
        NumberReport report = new NumberReport();
        report.printLastDigitReport(result, number);
    }
}
