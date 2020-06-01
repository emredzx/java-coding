package edz.webpage_opener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Webpage extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;


    public Webpage() {
        add(panel1);
        setSize(400,200);
        setTitle("Webpage Opener");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String webpage = textField1.getText();
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(webpage));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
