package com.uli;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Rectangular rectangularFirst = new Rectangular();
        Rectangular rectangularSecond = new Rectangular(10, 5, "SuperRectangular", Rectangular.randomColor[new Random().nextInt(Rectangular.randomColor.length)]);
        Rectangular rectangularThird = new Rectangular(rectangularSecond);
        rectangularSecond.setLength(11);
        System.out.println(rectangularFirst);
        System.out.println(rectangularSecond);
        System.out.println(rectangularThird);
        System.out.println("Perimeter is " + (int)rectangularSecond.getPerimeter());
        System.out.println("Square is " + (int)rectangularSecond.getSquare());
    }
}
