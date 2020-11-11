package edu.epam.task7.report;

import edu.epam.task7.entity.Point;

public class PointReport {
    public void printDistanceReport(boolean result, Point p1, Point p2) {
        System.out.println("is first point closer ...... " + result);
        System.out.println("point 1 " + p1);
        System.out.println("point 2 " + p2);
    }
}
