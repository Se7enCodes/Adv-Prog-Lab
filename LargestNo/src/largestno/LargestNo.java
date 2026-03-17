package largestno;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="LargestNo" width=500 height=500></applet> */

public class LargestNo extends Applet implements ActionListener {
    String str = "";
    TextField t1, t2, t3;
    Button B;
    String msg = " ";

    // The methods shown here depict the lifecycle of an applet program.
    // Method 1
    public void init() {
        msg += "inside init()";
        t1 = new TextField(8);
        t2 = new TextField(8);
        t3 = new TextField(8);

        B = new Button("Max");

        add(t1);
        add(t2);
        add(t3);
        add(B);

        t1.setText("0");
        t2.setText("0");
        t3.setText("0");

        B.addActionListener(this);
        
        setBackground(Color.PINK);

        setForeground(Color.GRAY);
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
        str = e.getActionCommand();
        repaint();
    }

    // Method 2
    public void start(){
        msg += " Inside start now";
        System.out.println("Start");
    }
    // Method 3
    public void paint(Graphics g) {
        int a = 0, b = 0, c = 0, max = 0;
        String s1, s2, s3, s4;

        g.drawString("Enter numbers in each box", 10, 20);

        s1 = t1.getText();
        s2 = t2.getText();
        s3 = t3.getText();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        c = Integer.parseInt(s3);

        if (str.equals("Max")) {
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }

            s4 = String.valueOf(max);
            g.drawString("Largest number: " + s4, 20, 200);
        }
    }
    
    // Method 4
    public void stop(){
        msg += " Inside stop now";
        System.out.println("Stop");
    }
    
    //Method 5
    public void destroy(){
        msg += "Inside destroy";
        System.out.println("Destroyed");
    }
    
//    public static void main(String[] args){
//        System.out.println("This is not shown to applet");
//    }
    
}
