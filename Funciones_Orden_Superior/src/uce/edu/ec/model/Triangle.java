package uce.edu.ec.model;

import uce.edu.ec.interfaces.IDrawable;

import java.awt.*;

public class Triangle implements IDrawable {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        int[] xPoints = {100, 150, 200};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}

