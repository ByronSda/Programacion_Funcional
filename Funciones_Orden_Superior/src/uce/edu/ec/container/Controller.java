package uce.edu.ec.container;

import uce.edu.ec.interfaces.IDrawable;
import uce.edu.ec.model.Circle;
import uce.edu.ec.model.Square;
import uce.edu.ec.model.Triangle;

import java.awt.*;
import javax.swing.*;

public class Controller {
    private JFrame frame;
    private JButton btnTriangle, btnSquare, btnCircle;
    private JPanel panelDraw;
    private IDrawable SelectedFigure;

    public Controller() {
        frame = new JFrame("Draw Figures");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));

        btnTriangle = new JButton("Triangle");
        btnSquare = new JButton("Square");
        btnCircle = new JButton("Círcle");

        btnTriangle.addActionListener(e -> seleccionarFigura(new Triangle()));
        btnSquare.addActionListener(e -> seleccionarFigura(new Square()));
        btnCircle.addActionListener(e -> seleccionarFigura(new Circle()));

        panelBotones.add(btnTriangle);
        panelBotones.add(btnSquare);
        panelBotones.add(btnCircle);

        // Panel para el dibujo
        panelDraw = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (SelectedFigure != null) {
                    SelectedFigure.draw(g);
                }
            }
        };

        frame.setLayout(new BorderLayout());
        frame.add(panelBotones, BorderLayout.WEST);
        frame.add(panelDraw, BorderLayout.CENTER);
    }

    private void seleccionarFigura(IDrawable figura) {
        SelectedFigure = figura;
        panelDraw.repaint();
    }

    public void show() {
        frame.setVisible(true);
    }
}

