/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpsychadelics;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author max.afklercker
 */
public class Frame extends JFrame{
    ArrayList<Pixel> pixels = new ArrayList<>();
    
    public Frame() {
        this.setLayout(new GridLayout(50, 50));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 1000));
        this.pack();
        for (int i = 0; i < 2500; i++) {
            Pixel pixel = new Pixel();
            pixels.add(pixel);
            this.add(pixel);
            pixel.getT().start();
        }
    }
}
