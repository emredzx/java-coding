package edz.order_meal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderMeal extends JFrame{
    Map<String,Integer> orders = new LinkedHashMap<String, Integer>();
    private JCheckBox LAHMACUN3TLCheckBox;
    private JCheckBox KOLA6TLCheckBox;
    private JCheckBox KEBAP15TLCheckBox;
    private JCheckBox KOKOREC12TLCheckBox;
    private JCheckBox AYRAN5TLCheckBox;
    private JCheckBox ICETEA3TLCheckBox;
    private JCheckBox SALGAM4TLCheckBox;
    private JCheckBox TANTUNI10TLCheckBox;
    private JButton ORDERButton;
    private JPanel panel;

    public OrderMeal(){
        add(panel);
        setSize(400,350);
        setTitle("Order Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ORDERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (KOKOREC12TLCheckBox.isSelected()){
                    orders.put("KOKOREC",12);
                }
                else{
                    orders.remove("KOKOREC",12);
                }
                if (KEBAP15TLCheckBox.isSelected()){
                    orders.put("KEBAP",15);
                }
                else {
                    orders.remove("KEBAP",12);
                }
                if(LAHMACUN3TLCheckBox.isSelected()){
                    orders.put("LAHMACUN",3);
                }
                else{
                    orders.remove("LAHMACUN",3);
                }
                if(TANTUNI10TLCheckBox.isSelected()){
                    orders.put("TANTUNI",10);
                }
                else {
                    orders.remove("TANTUNI",10);
                }
                if (AYRAN5TLCheckBox.isSelected()){
                    orders.put("AYRAN",5);
                }
                else {
                    orders.remove("AYRAN",5);
                }
                if(KOLA6TLCheckBox.isSelected()){
                    orders.put("KOLA",6);
                }
                else {
                    orders.remove("KOLA",6);
                }
                if (ICETEA3TLCheckBox.isSelected()){
                    orders.put("ICE TEA",3);
                }
                else {
                    orders.remove("ICE TEA",3);
                }
                if (SALGAM4TLCheckBox.isSelected()){
                    orders.put("SALGAM",4);
                }
                else {
                    orders.remove("SALGAM",4);
                }
                showOrder();
            }
        });
    }
    private void showOrder() {
        int sum = 0;
        String message = "";
        if (orders.isEmpty()){
            String Message = "There is no order yet.";
        }
        else{
            for (Map.Entry<String,Integer> entry : orders.entrySet()){
                message += entry.getKey() + "\n";
                sum += entry.getValue();
            }
            message += "Total cost : " + sum + " TL";
        }
        JOptionPane.showMessageDialog(panel,message);
    }
}

