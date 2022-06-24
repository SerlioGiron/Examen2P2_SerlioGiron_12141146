/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_serliogiron_12141146;

import javax.swing.JProgressBar;

/**
 *
 * @author usuario
 */
public class HiloBar extends Thread{
    JProgressBar barra;
    boolean corre;
    char caracter;

    public HiloBar(JProgressBar barra, char caracter) {
        this.barra = barra;
        this.corre = true;
        this.caracter = caracter;
    }

    @Override
    public void run() {
        while (corre) {
            int car = caracter;
            barra.setMaximum(255);
            barra.setValue(car);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
            
            corre = false;
        }
    }
    
    
}
