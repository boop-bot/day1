package edu.epam.task3.entity;

public class Square {
    private double sideLength;

    public Square() {}
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return (getSideLength() * getSideLength());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("side length = ").append(sideLength).append(" ; area = ").append(getArea());
        return sb.toString();
    }
}
