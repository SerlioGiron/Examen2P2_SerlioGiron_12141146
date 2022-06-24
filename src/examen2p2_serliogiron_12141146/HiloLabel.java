/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_serliogiron_12141146;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class HiloLabel extends Thread{
    //int num;
    boolean corre;
    JLabel etiqueta;

    public HiloLabel(JLabel label) {
        //this.num = num;
        this.etiqueta = label;
        this.corre = true;
    }

    @Override
    public void run() {
        while (corre) {
            
            
            System.out.println("num: " + 1);
            etiqueta.setText("Grabando en " + 1 + " ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            System.out.println("num: " + 2);
            etiqueta.setText("Grabando en " + 3 + " ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            System.out.println("num: " + 3);
            etiqueta.setText("Grabando en " + 3 + " ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            
            //label.setText("Grabando ...");
            corre = false;
        }
    }
    
    
}
