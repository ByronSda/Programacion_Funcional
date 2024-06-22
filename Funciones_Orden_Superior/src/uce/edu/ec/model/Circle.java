package uce.edu.ec.model;

import uce.edu.ec.interfaces.IDrawable;

import java.awt.*;

public class Circle implements IDrawable {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillOval(100, 100, 100, 100);
    }
}

