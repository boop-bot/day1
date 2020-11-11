package edu.epam.task4.main;

import edu.epam.task4.entity.NumberArray;
import edu.epam.task4.report.NumberReport;
import edu.epam.task4.service.NumberService;

public class NumberMain {
  public static void main(String[] args) {
    NumberArray array = new NumberArray(33, 55, 65, 44);
    NumberService service = new NumberService();
    boolean result = service.isTwoEvenNumbers(array);
    NumberReport report = new NumberReport();
    report.printEvenReport(result, array);
  }
}
