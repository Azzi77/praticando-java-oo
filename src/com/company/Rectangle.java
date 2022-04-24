package com.company;


public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea(){
        double area = this.sideA * this.sideB;
        return area;
    }

    public  double calculatePerimeter(){
        double perimeter = 2 * (this.sideA + this.sideB);
        return perimeter;
    }
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
