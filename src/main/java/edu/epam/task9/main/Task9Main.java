package edu.epam.task9.main;

import edu.epam.task9.entity.Circle;
import edu.epam.task9.report.CircleReport;
import edu.epam.task9.service.CircleService;

public class Task9Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        CircleService circleService = new CircleService();
        double circumference = circleService.getCircumference(circle);
        double area = circleService.getArea(circle);
        CircleReport circleReport = new CircleReport();
        circleReport.printCircleReport(area, circumference, circle);
    }
}
