package edu.epam.task6.main;

import edu.epam.task6.entity.Time;
import edu.epam.task6.report.TimeReport;
import edu.epam.task6.service.TimeService;

public class Task6Main {
    public static void main(String[] args) {
        int seconds = 10000;
        TimeService timeService = new TimeService();
        Time time = timeService.getTime(seconds);
        TimeReport timeReport = new TimeReport();
        timeReport.printTimeReport(seconds, time);
    }
}
