package edu.epam.task7.service;

import edu.epam.task7.entity.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointServiceTest {
    @Test()
    public void FirstCloserTrue() {
        Point p1 = new Point(5,5);
        Point p2 = new Point(10,10);
        PointService pointService = new PointService();
        boolean result = pointService.isFirstPointerCloserSecond(p1,p2);
        assertTrue(result);
    }

    @Test()
    public void FirstCloserFalse() {
        Point p1 = new Point(55,-55);
        Point p2 = new Point(10,10);
        PointService pointService = new PointService();
        boolean result = pointService.isFirstPointerCloserSecond(p1,p2);
        assertFalse(result);
    }
}