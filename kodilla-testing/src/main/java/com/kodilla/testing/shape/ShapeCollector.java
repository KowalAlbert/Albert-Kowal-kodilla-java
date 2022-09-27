package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new LinkedList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public String getFigure(int n) {
        return figures.get(n).getShape();
    }

    public String showFigures() {
        String theFigures = "Figures: ";
        for (int i = 0; i < figures.size(); i++) {
            theFigures = theFigures + figures.get(i).getShape() + " , ";
        }
        return theFigures;
    }
}
