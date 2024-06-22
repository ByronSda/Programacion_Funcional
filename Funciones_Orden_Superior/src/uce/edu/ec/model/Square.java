package uce.edu.ec.model;

import uce.edu.ec.interfaces.IDrawable;

import java.awt.*;

public class Square implements IDrawable {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(100, 100, 100, 100);
    }
}
