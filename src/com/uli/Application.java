package com.uli;

import com.uli.figures.Circle;
import com.uli.figures.Shape;
import com.uli.figures.ShapeFactory;
import com.uli.figures.ShapeTypes;
import com.uli.services.Calculator;
import com.uli.services.PerimeterCalculatorService;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
//        Rectangular rectangularFirst = new Rectangular();
//        Rectangular rectangularSecond = new Rectangular(10, 5, "SuperRectangular", Rectangular.randomColor[new Random().nextInt(Rectangular.randomColor.length)]);
//        Rectangular rectangularThird = new Rectangular(rectangularSecond);
//        rectangularSecond.setLength(11);
//        System.out.println(rectangularFirst);
//        System.out.println(rectangularSecond);
//        System.out.println(rectangularThird);
//        System.out.println("Perimeter is " + (int)rectangularSecond.getPerimeter());
//        System.out.println("Square is " + (int)rectangularSecond.getSquare());

//        Shape [] shapes = null;
//        for (Shape s: shapes) {
//            s.createShapes
//        }

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeTypes.CIRCLE, 5,3,2);
//        Shape rectangle = shapeFactory.getShape(ShapeTypes.RECTANGLE);
//        Shape square = shapeFactory.getShape(ShapeTypes.SQUARE);
//        circle.create();
//        rectangle.create();
//        square.create();
        Calculator calculator = new PerimeterCalculatorService(circle);
        System.out.println(calculator.calculate());


    }
}
