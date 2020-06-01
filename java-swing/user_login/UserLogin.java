package edz.user_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {

    private JPanel panel1;
    private JTextField username;
    private JPasswordField userpass;
    private JButton loginButton;

    public UserLogin(){
        add(panel1);
        setSize(400,200);
        setTitle("User Login");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = userpass.getText();
                String message;
                if (user.equals("emredzx") && pass.equals("123456")){
                    message = "Login Successful";
                }
                else {
                    message = "Wrong Credentials";
                }
                if (message.equals("Login Successful")){
                    JOptionPane.showMessageDialog(panel1,message);
                    System.exit(0);
                }
                else {
                    JOptionPane.showMessageDialog(panel1,message);
                }
                username.setText("");
                userpass.setText("");
            }
        });
    }
}
