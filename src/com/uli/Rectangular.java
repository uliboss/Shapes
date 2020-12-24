package com.uli;

import org.w3c.dom.css.Rect;

public class Rectangular {
    private double length;
    private double width;
    private String name;
    private String color;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if ((length == 0) & (width == 0) & (name == null) & (color == null)) {
            return "No information";
        } else {
            return "Rectangular has next parameters: " +
                    "length = " + (int)length + " cm" +
                    ", width = " + (int)width + " cm" +
                    ", name = '" + name + '\'' +
                    ", color = '" + color + '\'' +
                    '.';
        }
    }

    public Rectangular() {
    }

    public Rectangular(double length, double width, String name, String color) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.color = color;
    }

    public Rectangular(Rectangular rectangular) {
        this.length = rectangular.length;
        this.width = rectangular.width;
        this.name = rectangular.name;
        this.color = rectangular.color;
    }

    public double getPerimeter(){
        return length + width;
    }

    public double getSquare(){
        return length * width;
    }

    public static String[] randomColor = {"Blue", "Yellow", "Black", "Orange", "Purple"};

}
