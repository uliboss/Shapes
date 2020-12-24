package com.uli;

public class Application {
    public static void main(String[] args) {
        Rectangular rectangularFirst = new Rectangular();
        Rectangular rectangularSecond = new Rectangular(10, 5, null, null);
        Rectangular rectangularThird = new Rectangular(rectangularSecond);
        System.out.println(rectangularFirst);
        System.out.println(rectangularSecond);
        System.out.println(rectangularThird);
        System.out.println("Perimeter is " + (int)rectangularSecond.getPerimeter());
        System.out.println("Square is " + (int)rectangularSecond.getSquare());
    }
}
