package com.uli.shapes.round;

import com.uli.shapes.Shape;

public abstract class RoundShape extends Shape {

    protected double radius;

    public RoundShape() {
        this.radius = 0;
    }

    public RoundShape(double radius) {
        this.radius = radius;
    }

    @Override
    public void create() {
        System.out.println("Round shape is created");
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "RoundShape{" +
                "radius=" + radius +
                '}';
    }
}
