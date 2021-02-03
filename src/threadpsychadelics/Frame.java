/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpsychadelics;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author max.afklercker
 */
public class Frame extends JFrame{
    ArrayList<Pixel> pixels = new ArrayList<>();
    
    public Frame() {
        for (int i = 0; i < 400; i++) {
            Pixel pixel = new Pixel();
            pixels.add(pixel);
        }
    }
}
