package edz.webpage_opener;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Webpage webpage = new Webpage();
                webpage.setVisible(true);
            }
        });
    }
}
