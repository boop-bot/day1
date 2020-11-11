package edu.epam.task8.entity;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number{");
        sb.append("value = ").append(value).append('}');
        return sb.toString();
    }
}
