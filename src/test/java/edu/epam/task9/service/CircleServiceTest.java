package edu.epam.task9.service;

import edu.epam.task9.entity.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {
    @Test()
    public void getAreaTest() {
        Circle circle = new Circle(10);
        CircleService circleService = new CircleService();
        double area = circleService.getArea(circle);
        assertEquals(area, circleService.PI * circle.getRadius() * circle.getRadius());
    }

    @Test()
    public void getCircumferenceTest() {
        Circle circle = new Circle(10);
        CircleService circleService = new CircleService();
        double circumference = circleService.getCircumference(circle);
        assertEquals(circumference, 2 * circleService.PI * circle.getRadius());
    }

}