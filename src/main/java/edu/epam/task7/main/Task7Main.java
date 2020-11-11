package edu.epam.task7.main;

import edu.epam.task7.entity.Point;
import edu.epam.task7.report.PointReport;
import edu.epam.task7.service.PointService;

public class Task7Main {
    public static void main(String[] args) {
        Point point1 = new Point(10,10);
        Point point2 = new Point(11,11);
        PointService pointService = new PointService();
        boolean isFirstCloser = pointService.isFirstPointerCloserSecond(point1, point2);
        PointReport pointReport = new PointReport();
        pointReport.printDistanceReport(isFirstCloser, point1, point2);
    }
}
