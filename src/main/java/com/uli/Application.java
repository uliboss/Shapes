package com.uli;

import com.uli.services.CalculatorServiceImpl;
import com.uli.shapes.Shape;
import com.uli.shapes.ShapeFactory;
import com.uli.shapes.ShapeTypes;
import com.uli.shapes.right.Rectangle;
import com.uli.shapes.right.Square;
import com.uli.shapes.round.Circle;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Rectangle rectangle = buildRectangle(shapeFactory, 5, 10);
        Circle circle = buildCircle(shapeFactory, 5);
        Square square = buildSquare(shapeFactory, 10);
        double perimeterForRectangle = calculatorService.calculatePerimeter(rectangle);
        double squareForRectangle = calculatorService.calculateSquare(rectangle);
        double squareForCircle = calculatorService.calculateSquare(circle);
        double perimeterForSquare = calculatorService.calculatePerimeter(square);
        double squareForSquare = calculatorService.calculateSquare(square);
        rectangle.create();
        System.out.println(rectangle);
        System.out.println("Rectangle's perimeter is " + perimeterForRectangle);
        System.out.println("Rectangle's square is " + squareForRectangle);
        System.out.print("\n");
        circle.create();
        System.out.println(circle);
        System.out.println("Circle's square is " + numberFormat.format(squareForCircle));
        System.out.print("\n");
        square.create();
        System.out.println(square);
        System.out.println("Square's perimeter is " + perimeterForSquare);
        System.out.println("Square's square is " + squareForSquare);
    }

    private static Rectangle buildRectangle(ShapeFactory shapeFactory, double length, double width) {
        return ((Rectangle) shapeFactory.getShape(ShapeTypes.RECTANGLE))
                .length(length)
                .width(width)
                .build();
}

    private static Circle buildCircle(ShapeFactory shapeFactory, double radius) {
        return ((Circle) shapeFactory.getShape(ShapeTypes.CIRCLE))
                .radius(radius)
                .build();
    }

    private static Square buildSquare(ShapeFactory shapeFactory, double side) {
        return ((Square) shapeFactory.getShape(ShapeTypes.SQUARE))
                .side(side)
                .build();
    }
    //        CsvReader csvReader = new CsvReader(pathname);
//        Cursor cursor = csvReader.getCursor();
//
//        if(cursor.hasNext()){
//            Rectangle rectangle = ((Rectangle) shapeFactory.getShape(ShapeTypes.RECTANGLE))
//                    .length(cursor[0])
//                    .width(cursor[1])
//                    .build();
//        }
}

