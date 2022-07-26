package org.example.practice;

public class Inheritance {
    public static void main(String[] args)
    {
    Circle mens; // Creating reference.
    mens = new Circle(12.5); // Creating object.
    double areaCircle = mens.areaCircle();
    System.out.println("Area of circle: " +areaCircle);
    Cylinder cyl1 = new Cylinder(2, 3.5);
    System.out.println("radius: " + cyl1.getRadius());
    System.out.println("height: " + cyl1.getHeight());
    System.out.println("volume: " + cyl1.getVolume());
    System.out.println("Surface area: " + cyl1.getsurfaceArea());
    }
}

