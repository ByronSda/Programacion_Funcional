package uce.edu.ec.main;

import uce.edu.ec.container.Controller;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controller controller = new Controller();
            controller.show();
        });
    }
}
