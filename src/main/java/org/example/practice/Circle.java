package org.example.practice;


//Area of a circle
public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getR() {
        return radius;
    }
    public void setR(double r) {
        this.radius = r;
    }
    public double areaCircle() {
        double area = 3.14* radius * radius;
        return area;
    }
}


