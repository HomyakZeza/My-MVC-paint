package org.example.controller;

import org.example.controller.action.ActionDraw;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.model.fill.Fill;
import org.example.model.fill.NoFill;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

// TODO: 24.10.2024 Сделать singleton класс
public class Controller {
    private Model model;
    private MyFrame frame;
    private MyPanel panel;
    private Point2D firstPoint;
    private Point2D secondPoint;

    private ActionDraw actionDraw;
    public static Controller instance;
    public Controller() {
        model = new Model();
        MyShape shape = new MyShape(new Rectangle2D.Double());
        Fill fill = new Fill();
        // TODO: 01.11.2024 Найти где потеряли цвет
        fill.setColor(Color.BLUE);
        model.setMyShape(shape);
        shape.setFb(fill);

        actionDraw = new ActionDraw(model, shape);
        MyPanel panel = new MyPanel(this);
        model.addObserver(panel);

        frame = new MyFrame();
        frame.setPanel(panel);
    }
    public static Controller getInstance(){
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }
    public void getPointOne(Point2D p){
        firstPoint = p;
    }
    public void getPointTwo(Point2D p){
        secondPoint = p;
        model.changeShape(firstPoint, secondPoint);
    }
    public void mousePressed(MouseEvent a){
         actionDraw.streatchShape(a.getPoint());

    }
    public void mouseDragger(MouseEvent e){
        actionDraw.createShape(e.getPoint());
    }
    public void draw(Graphics2D g2) {
        model.draw(g2);
    }
}
