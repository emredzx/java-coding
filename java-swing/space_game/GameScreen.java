import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame {
    public GameScreen(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        GameScreen gameScreen = new GameScreen("Space Game");
        GamePanel gamePanel = new GamePanel();
        gameScreen.setResizable(false);
        gameScreen.setFocusable(false);
        gameScreen.setSize(800,600);
        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel.requestFocus();
        gamePanel.addKeyListener(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.setFocusTraversalKeysEnabled(false);
        gameScreen.add(gamePanel);
        gameScreen.setVisible(true);
    }
}
