import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Fire{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Fire(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class GamePanel extends JPanel implements KeyListener, ActionListener {
    Timer timer = new Timer(5,this::actionPerformed);
    private int time = 0;
    private int shot = 0;
    private BufferedImage image;
    private ArrayList<Fire> fires = new ArrayList<Fire>();
    private int firedirY = 7;
    private int ballX = 0;
    private int balldirX = 2;
    private int spaceshipX = 0;


    @Override
    public void repaint() {
        super.repaint();
    }

    public boolean CheckBall(){
        for (Fire fire : fires){
            if(new Rectangle(fire.getX(),fire.getY(),10,20).intersects(new Rectangle(ballX,0,20,20))){
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        time += 5;
        g.setColor(Color.red);
        g.fillOval(ballX,0,20,20);
        g.drawImage(image,spaceshipX,490,image.getWidth()/10,image.getHeight()/10,this);
        fires.removeIf(fire -> fire.getY() < 0);
        g.setColor(Color.blue);
        for (Fire fire : fires){
            g.fillRect(fire.getX(),fire.getY(),10,20);

        }
        if (CheckBall()){
            timer.stop();
            String message = "YOU WON.\nShots : " + shot + " fired." + "\nTime : " + time/1000.0 + " seconds.";
            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }
    }

    public GamePanel() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("spaceship.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBackground(Color.BLACK);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Fire fire : fires){
            fire.setY(fire.getY() - firedirY);
        }
        ballX += balldirX;
        if(ballX >= 750){
            balldirX = -balldirX;
        }
        if(ballX <= 0){
            balldirX = -balldirX;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        int dirSpaceX = 20;
        if (c == KeyEvent.VK_LEFT){
            if (spaceshipX <= 0){
                spaceshipX = 0 ;
            }
            else {
                spaceshipX -= dirSpaceX;
            }
        }
        else if(c == KeyEvent.VK_RIGHT){
            if (spaceshipX >= 743){
                spaceshipX = 743;
            }
            else {
                spaceshipX += dirSpaceX;
            }
        }
        else if (c == KeyEvent.VK_SPACE){
            fires.add(new Fire(spaceshipX+15,476));
            shot++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}