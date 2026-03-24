package swingmaxsumavg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingMaxSumAvg {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Operations");
        
        frame.setSize(400, 400);
        
        frame.setLayout(new GridLayout(7, 2, 10, 10)); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField t1 = new JTextField();
        final JTextField t2 = new JTextField();
        final JTextField t3 = new JTextField();

        final JLabel L2 = new JLabel("Result will appear here", SwingConstants.CENTER);

        JButton maxBtn = new JButton("Find Max");
        JButton sumBtn = new JButton("Find Sum");
        JButton avgBtn = new JButton("Find Average");
        JButton clearBtn = new JButton("Clear");

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
                    if (b > a) max = b;
                    if (c > a) max = c;
                    
                    L2.setText("The largest number is: " + max);
                } catch (NumberFormatException ex) {
                    L2.setText("Invalid input. Enter numbers only.");
                }
            }
        });

        sumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(t1.getText());
                    double b = Double.parseDouble(t2.getText());
                    double c = Double.parseDouble(t3.getText());

                    double sum = a + b + c;
                    
                    L2.setText("The sum is: " + sum);
                } catch (NumberFormatException ex) {
                    L2.setText("Invalid input. Enter numbers only.");
                }
            }
        });

        avgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(t1.getText());
                    double b = Double.parseDouble(t2.getText());
                    double c = Double.parseDouble(t3.getText());

                    double avg = (a + b + c) / 3.0;
                    
                    L2.setText("The average is: " + avg);
                } catch (NumberFormatException ex) {
                    L2.setText("Invalid input. Enter numbers only.");
                }
            }
        });

        frame.add(new JLabel("Number 1:"));
        frame.add(t1);

        frame.add(new JLabel("Number 2:"));
        frame.add(t2);

        frame.add(new JLabel("Number 3:"));
        frame.add(t3);

        frame.add(new JLabel("Result:"));
        frame.add(L2);

        frame.add(maxBtn);
        frame.add(sumBtn);
        frame.add(avgBtn);
        frame.add(clearBtn);

        frame.setVisible(true);
    }
}

