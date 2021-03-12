package com.uli.services;

import com.uli.shapes.right.Rectangle;
import com.uli.shapes.right.RightShape;
import com.uli.shapes.round.RoundShape;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculatePerimeter(RightShape rightShape) {
        return rightShape.getLength() + rightShape.getWidth();
    }

    @Override
    public double calculateSquare(RightShape rightShape) {
        return rightShape.getLength() * rightShape.getWidth();
    }

    @Override
    public double calculateSquare(RoundShape roundShape) {
        return Math.PI * Math.pow(roundShape.getRadius(), 2);
    }
}
