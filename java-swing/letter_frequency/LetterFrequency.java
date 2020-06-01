package edz.letter_frequency;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetterFrequency extends JFrame{
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton showFrequencyButton;
    private JLabel word;
    private JLabel letter;

    public LetterFrequency(){
        add(panel1);
        setSize(400,200);
        setTitle("Letter Frequency");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showFrequencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String writing = textArea1.getText();
                int letternum = 0;
                for (int i = 0 ; i < writing.length() ;i++){
                    if (writing.charAt(i) != ' '){
                        letternum++;
                    }
                }
                String[] wordarray = writing.split(" ");
                word.setText("Word : " + wordarray.length);
                letter.setText("Letter : " + letternum);

            }
        });
    }
}
