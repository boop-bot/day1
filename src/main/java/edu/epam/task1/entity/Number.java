package edu.epam.task1.entity;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLastDigit() {
        return (getValue() % 10);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number{");
        sb.append("value = ").append(value).append('}');
        return sb.toString();
    }
}
