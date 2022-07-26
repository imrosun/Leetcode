package org.example.practice;


//Cylinder
public class Cylinder extends Circle {
    double volume;
    double surfaceArea;
    double radius;
    double height;
    double result;
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.radius = radius;
        this.height = height;
    }
    public double getRadius ()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public double getsurfaceArea()
    {
        return (2 * Math.PI * radius) * (radius + height);
    }
    public double getVolume()
    {
        return (Math.PI * height * Math.pow(radius, radius));
    }
}

