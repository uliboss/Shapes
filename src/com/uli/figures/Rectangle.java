package com.uli.figures;
import com.uli.services.Calculator;

public class Rectangle extends Shape {


    public Rectangle() {
    }

    public Rectangle(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    public void create() {
        System.out.println("Rectangle is created");
    }
}
