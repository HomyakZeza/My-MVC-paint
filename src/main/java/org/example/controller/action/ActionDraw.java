package org.example.controller.action;

import org.example.model.Model;
import org.example.model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class ActionDraw {
    private MyShape sampleShape;
    private Point2D firstPoint;
    private Point2D secondPoint;
    private Model model;
    public ActionDraw(Model model, MyShape shape) {
        this.model = model;
        sampleShape = shape;
    }

    public void createShape(Point point) {
        secondPoint = point;
        sampleShape.setFrame(firstPoint, secondPoint);
        model.update();
    }

    public void streatchShape(Point point) {
        firstPoint = point;
        sampleShape = sampleShape.clone();
        model.createCurrentShape(sampleShape);
    }

}
