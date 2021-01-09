package com.uli.shapes;

// 1. Removed radius from Abstract class because it's not a common field for figures
// 2. Clean up code (constructors and methods, remove radius from them)

public abstract class Shape {

    public Shape() {
    }

    public abstract void create();
}
