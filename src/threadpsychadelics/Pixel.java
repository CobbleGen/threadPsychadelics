/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpsychadelics;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author max.afklercker
 */
public class Pixel extends JPanel implements Runnable {
    private int color;
    private Thread t;

    public Thread getT() {
        return t;
    }

    public Pixel() {
        t = new Thread(this);
        this.color = (int) (Math.random() * 255);
        this.setBackground(new Color(color, color, color));
    }
    

    @Override
    public void run() {
        while(!Thread.interrupted() && !(color <= 0)) {
            try {
                Thread.sleep(50);
                int newColor = color -(((int) (Math.random() * 10)) -4);
                this.color =  newColor > 0 && newColor < 254 ? newColor : color;
                this.setBackground(new Color(color, color, color));
            } catch(InterruptedException e) {
                break;
            }
        }
        this.setBackground(Color.WHITE);
    }
}
