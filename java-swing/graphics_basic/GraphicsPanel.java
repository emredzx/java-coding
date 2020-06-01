package edz.graphics_basic;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(100,10,30,40);
        g.fillRect(200,150,30,50);
        g.setColor(Color.BLUE);
        g.drawOval(500,300,30,30);
        g.fillOval(400,200,30,30);
        g.setColor(Color.YELLOW);
        g.drawLine(300,10,600,160);
    }

    public GraphicsPanel() {
        setBackground(Color.BLACK);
    }
}
