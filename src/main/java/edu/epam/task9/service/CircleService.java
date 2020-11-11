package edu.epam.task9.service;

import edu.epam.task9.entity.Circle;

public class CircleService {
    public final double PI = 3.1415926;

    public double getCircumference(Circle circle) {
        return 2 * PI * circle.getRadius();
    }

    public double getArea(Circle circle) {
        return PI * circle.getRadius() * circle.getRadius();
    }
}
