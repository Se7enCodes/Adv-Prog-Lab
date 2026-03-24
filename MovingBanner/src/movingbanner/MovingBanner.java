package movingbanner;

import java.awt.*;
import javax.swing.*;

public class MovingBanner extends JFrame implements Runnable {
    private String msg = "   Welcome to the Moving Banner   ";
    private Thread t;
    private boolean running = true;

    public MovingBanner() {
        setTitle("Moving Banner");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.RED);
        setForeground(Color.BLUE);
        setVisible(true);

        // Start the thread
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (running) {
            try {
                repaint();
                Thread.sleep(250);

                // Rotate the string
                char ch = msg.charAt(0);
                msg = msg.substring(1) + ch;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(getForeground());
        g.drawString(msg, 100, 80);
    }

    public void stopBanner() {
        running = false;
    }

    public static void main(String[] args) {
        new MovingBanner();
    }
}
