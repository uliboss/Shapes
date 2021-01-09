package com.uli.shapes.right;

import com.uli.shapes.Shape;

public abstract class RightShape extends Shape {

    protected double length;
    protected double width;

    public RightShape() {
        this.length = 0;
        this.width = 0;
    }

    public RightShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void create() {
        System.out.println("Right shape is created");
    }

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

    @Override
    public String toString() {
        return "RightShape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
