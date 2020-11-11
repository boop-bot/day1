package edu.epam.task3.service;

import edu.epam.task3.entity.Square;

public class SquareService {
    public double getSideLengthFromArea(double area) {
        return Math.sqrt(area);
    }

    public Square getInscribedSquare(Square square) {
        Square inscribedSquare = new Square((square.getSideLength() / Math.sqrt(2)));
        return inscribedSquare;
    }

    public double getAreaProportion(Square bigSquare, Square inscribedSquare) {
        return (bigSquare.getArea() / inscribedSquare.getArea());
    }
}
