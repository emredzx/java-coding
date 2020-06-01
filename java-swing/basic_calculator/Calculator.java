package edz.basic_calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JLabel export;
    private JPanel field1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton xButton1;
    private JButton button2;
    private JButton button3;
    private JButton xButton;

    public Calculator() {
        add(field1);
        setSize(400,200);
        setTitle("Basic Calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first_number = Double.parseDouble(textField3.getText());
                double second_number = Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(first_number + second_number));
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first_number = Double.parseDouble(textField3.getText());
                double second_number = Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(first_number - second_number));
            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first_number = Double.parseDouble(textField3.getText());
                double second_number = Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(first_number * second_number));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first_number = Double.parseDouble(textField3.getText());
                double second_number = Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(first_number / second_number));
            }
        });
    }
}
