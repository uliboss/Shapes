package com.uli.shapes.right;

// Default constructors can have initial values for fields

public class Rectangle extends RightShape {

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public Rectangle length(double length){
        this.length = length;
        return this;
    }
    public Rectangle width(double width){
        this.width = width;
        return this;
    }

    public Rectangle build(){
        return new Rectangle(length, width);
    }

    @Override
    public void create() {
        System.out.println("Rectangle is created");
    }
}
