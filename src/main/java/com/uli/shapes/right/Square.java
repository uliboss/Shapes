package com.uli.shapes.right;

public class Square extends RightShape {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void create() {
        System.out.println("Square is created");
    }

    public Square side(double side) {
        this.width = side;
        this.length = side;
        return this;
    }

    public Square build() {
        return new Square(length);
    }
}
