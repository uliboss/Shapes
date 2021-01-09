package com.uli.shapes;

import com.uli.shapes.right.Rectangle;
import com.uli.shapes.right.Square;
import com.uli.shapes.round.Circle;

public class ShapeFactory {
    public Shape getShape(ShapeTypes types){
        Shape toReturn = null;
        switch(types){
            case CIRCLE:
                toReturn = new Circle();
                break;
            case RECTANGLE:
                toReturn = new Rectangle();
                break;
            case SQUARE:
                toReturn = new Square();
                break;
        }
        return toReturn;
    }
}
