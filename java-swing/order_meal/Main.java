package edz.order_meal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                OrderMeal orderMeal = new OrderMeal();
                orderMeal.setVisible(true);
            }
        });
    }
}
