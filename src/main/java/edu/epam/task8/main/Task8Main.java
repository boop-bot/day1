package edu.epam.task8.main;

import edu.epam.task8.entity.Number;
import edu.epam.task8.report.FunctionReport;
import edu.epam.task8.service.FunctionService;

public class Task8Main {
    public static void main(String[] args) {
        Number x = new Number(5);
        FunctionService functionService = new FunctionService();
        Number result = functionService.getFunctionResult(x);
        FunctionReport functionReport = new FunctionReport();
        functionReport.printFunctionReport(x, result);
    }
}
