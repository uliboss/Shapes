package com.uli.figures;

import com.uli.services.Calculator;

public class Square extends Shape {

    public Square() {
    }
    public Square(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    public void create() {
        System.out.println("Square is created");

    }
}
