package edz.user_login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserLogin userLogin = new UserLogin();
                userLogin.setVisible(true);
            }
        });
    }
}
