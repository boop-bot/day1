package edu.epam.task3.service;

import edu.epam.task3.entity.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareServiceTest {
    @Test()
    public void getSideFromAreaTest() {
        SquareService squareService = new SquareService();
        double side = squareService.getSideLengthFromArea(144);
        assertEquals(side, 12);
    }
    @Test()
    public void getAreaProportionTest() {
        Square square1 = new Square(20);
        Square square2 = new Square(10);
        SquareService squareService = new SquareService();
        double areaProportion = squareService.getAreaProportion(square1, square2);
        assertEquals(areaProportion, 4);
    }
}