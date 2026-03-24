package swinglarg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingLargest {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Largest Number");

        frame.setSize(350, 350);
        
//        frame.setLayout(new GridLayout(3, 3, 20, 20));
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField t1 = new JTextField();
        final JTextField t2 = new JTextField();
        final JTextField t3 = new JTextField();

//        JLabel L1 = new JLabel("Enter 3 numbers:");
        final JLabel L2 = new JLabel("Result will appear here", SwingConstants.CENTER);

        JButton maxBtn = new JButton("Find Max");
        JButton clearBtn = new JButton("Clear");
        

frame.add(clearBtn);

        clearBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            L2.setText("Result will appear here");
        }
});

        maxBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(t1.getText());
                    double b = Double.parseDouble(t2.getText());
                    double c = Double.parseDouble(t3.getText());

                    double max = a;

                    if (b > max) max = b;
                    if (c > max) max = c;

                    L2.setText("The largest number is: " + max);
                } catch (NumberFormatException ex) {
                    L2.setText("Invalid input. Enter numbers only.");
                }
            }
        });

//        frame.add(L1);
//        frame.add(t1);
//        frame.add(t2);
//        frame.add(t3);
//        frame.add(maxBtn);
//        frame.add(clearBtn);
//        frame.add(L2);

        frame.add(new JLabel("Number 1:"));
        frame.add(t1);

        frame.add(new JLabel("Number 2:"));
        frame.add(t2);

        frame.add(new JLabel("Number 3:"));
        frame.add(t3);

        frame.add(new JLabel("Result: "));
        frame.add(L2);
//      Last row: buttons side by side
        frame.add(maxBtn);
        frame.add(clearBtn);

        frame.setVisible(true);
    }
}
