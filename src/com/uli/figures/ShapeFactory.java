package com.uli.figures;

import com.uli.figures.*;
import com.uli.services.SquareCalculatorService;

public class ShapeFactory {
    public Shape getShape(ShapeTypes types, double length, double width, double radius){
        Shape toReturn = null;
        switch(types){
            case CIRCLE:
                toReturn = new Circle(length, width, radius);
                break;
            case RECTANGLE:
                toReturn = new Rectangle(length, width, radius);
                break;
            case SQUARE:
                toReturn = new Square(length, width, radius);
                break;
        }
        return toReturn;

//        if(shapeType == null){
//            return null;
//        }
//        if (shapeType.equalsIgnoreCase("CIRCLE")){
//            return new Circle();
//        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
//            return new Rectangle();
//        } else if (shapeType.equalsIgnoreCase("Square")){
//            return new Square();
//        }
//        return null;
    }
}
