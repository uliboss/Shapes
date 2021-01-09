package com.uli.services;

import com.uli.shapes.right.Rectangle;
import com.uli.shapes.right.RightShape;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculatePerimeter(RightShape rightShape) {
        return rightShape.getLength() + rightShape.getWidth();
    }

    @Override
    public double calculateSquare(RightShape rightShape) {
        return rightShape.getWidth() * rightShape.getLength();
    }
}
