package com.uli.figures;

import com.uli.services.Calculator;

public abstract class Shape {
    private Calculator calculator;
    private double length;
    private double width;
    private double radius;


    public Shape() {
    }



    public Shape(double length, double width, double radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape{" +
                ", length=" + length +
                ", width=" + width +
                ", radius=" + radius +
                '}';
    }

    public abstract void create();




    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
