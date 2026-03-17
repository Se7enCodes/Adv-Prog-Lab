package appletcode1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;


/*
 * Simple Applet Utility
 * Demonstrates background color, foreground color, text, and a square
 */

public class AppletCode1 extends Applet {

    // applet initialization
    @Override
    public void init() {
        setBackground(Color.white);

//        setForeground(Color.BLACK);
    }

    // paint() is used to draw graphics on the applet
    @Override
    public void paint(Graphics g) {

        // Draw a square
        // drawRect(x position, y position, width, height)
        
        g.setColor(Color.BLUE);
        g.drawRoundRect(100, 50, 30, 40, 50, 60);

        g.setColor(Color.RED);
        g.drawString("Simple Applet Example", 60, 40);

        g.setColor(Color.GREEN);
        g.drawOval(20, 30, 40, 25);
        
        g.setColor(Color.darkGray);
        g.drawArc(50, 70, 50, 60, 60, 70);
        
        g.setColor(Color.darkGray);
        g.drawArc(70,60,60,50,70,50);
    }
}