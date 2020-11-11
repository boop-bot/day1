package edu.epam.task7.service;

import edu.epam.task7.entity.Point;

public class PointService {
    public double getDistance(Point point) {
        return Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
    }

    public boolean isFirstPointerCloserSecond(Point p1, Point p2) {
        return (getDistance(p1) < getDistance(p2));
    }
}
