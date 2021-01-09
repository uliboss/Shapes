package com.uli.services;
import com.uli.figures.Shape;

public class PerimeterCalculatorService implements Calculator {
    Shape shape;

    public PerimeterCalculatorService(Shape shape) {
        this.shape = shape;
    }


    @Override
    public double calculate() {
        return shape.getLength() + shape.getWidth();
    }


}
