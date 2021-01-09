package com.uli.shapes.round;

public class Circle extends RoundShape {

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public void create() {
        System.out.println("Circle is created");
    }

    public Circle setRadius(double radius){
        this.radius = radius;
        return this;
    }

    public Circle build(){
        return new Circle(radius);
    }
}
