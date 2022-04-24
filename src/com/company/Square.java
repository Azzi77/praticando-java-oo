package com.company;

public class Square extends Rectangle {


    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calculateArea() {
        return Math.pow(super.getSideA(), 2d);

    }

    @Override
    public double calculatePerimeter() {
        return 4 * super.getSideA();

    }
}
