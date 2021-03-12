package com.uli.services;

import com.uli.shapes.right.RightShape;
import com.uli.shapes.round.RoundShape;

public interface CalculatorService {
    double calculatePerimeter(RightShape rightShape);
    double calculateSquare(RightShape rightShape);
    double calculateSquare(RoundShape roundShape);
}
