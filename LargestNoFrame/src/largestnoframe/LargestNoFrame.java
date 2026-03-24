package largestnoframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargestNoFrame extends JFrame implements ActionListener {
    private final JTextField t1, t2, t3;
    private final JButton bMax, bAvg, bSum;
    private final JLabel resultLabel;

    public LargestNoFrame() {
        setTitle("Largest Number Finder");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input fields
        t1 = new JTextField("0", 8);
        t2 = new JTextField("0", 8);
        t3 = new JTextField("0", 8);

        // Buttons
        bMax = new JButton("Max");
        bAvg = new JButton("Avg");
        bSum = new JButton("Sum");

        // Result label
        resultLabel = new JLabel("Enter numbers and choose an operation");

        // Add components
        add(new JLabel("Number 1:"));
        add(t1);
        add(new JLabel("Number 2:"));
        add(t2);
        add(new JLabel("Number 3:"));
        add(t3);
        add(bMax);
        add(bAvg);
        add(bSum);
        add(resultLabel);

        // Button listeners
        bMax.addActionListener(this);
        bAvg.addActionListener(this);
        bSum.addActionListener(this);

        // Styling
        getContentPane().setBackground(Color.PINK);
        resultLabel.setForeground(Color.GRAY);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        if (e.getSource() == bMax) {
            int max = Math.max(a, Math.max(b, c));
            resultLabel.setText("Largest number: " + max);
        } else if (e.getSource() == bAvg) {
            int avg = (a + b + c) / 3;
            resultLabel.setText("Average is: " + avg);
        } else if (e.getSource() == bSum) {
            int sum = a + b + c;
            resultLabel.setText("Sum is: " + sum);
        }
    }

    public static void main(String[] args) {
        LargestNoFrame largestNoFrame = new LargestNoFrame();
    }
}
