package com.uli;

import com.uli.services.CalculatorServiceImpl;
import com.uli.shapes.Shape;
import com.uli.shapes.ShapeFactory;
import com.uli.shapes.ShapeTypes;
import com.uli.shapes.right.Rectangle;

import java.util.ArrayList;
import java.util.List;

// 1. Read what is maven (google maven and go to documentation or open some tutorial link)
// 2. Read about pom.xml file and what it can contain
// 3. Try to move current project from simple java project to maven java project


public class Application {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeTypes.CIRCLE);

        Rectangle rectangle = buildRectangle(shapeFactory, 5, 10);

        List<Shape> shapes = new ArrayList<>();

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        double perimeter = calculatorService.calculatePerimeter(rectangle);

        System.out.println(perimeter);
        System.out.println(rectangle);

        rectangle.create();

    }

    private static Rectangle buildRectangle(ShapeFactory shapeFactory, double length, double width) {
//        CsvReader csvReader = new CsvReader(pathname);
//        Cursor cursor = csvReader.getCursor();
//
//        if(cursor.hasNext()){
//            Rectangle rectangle = ((Rectangle) shapeFactory.getShape(ShapeTypes.RECTANGLE))
//                    .length(cursor[0])
//                    .width(cursor[1])
//                    .build();
//        }

        return ((Rectangle) shapeFactory.getShape(ShapeTypes.RECTANGLE))
                .length(length)
                .width(width)
                .build();
    }
}
