package com.uli.figures;
import com.uli.services.Calculator;
import com.uli.services.PerimeterCalculatorService;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(double length, double width, double radius) {
        super(length, width, radius);
    }


    @Override
    public void create() {
        System.out.println("Circle is created");

    }


}
