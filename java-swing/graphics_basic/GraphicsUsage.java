package edz.graphics_basic;

import javax.swing.*;
import java.awt.*;

public class GraphicsUsage extends JFrame {
    public GraphicsUsage(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        GraphicsPanel panel = new GraphicsPanel();
        GraphicsUsage frame = new GraphicsUsage("Graphics Usage");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
    }
}
