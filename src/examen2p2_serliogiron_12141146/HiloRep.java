/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_serliogiron_12141146;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class HiloRep extends Thread{
    JProgressBar barra;
    boolean corre;
    String texto;
    JTextArea area;

    public HiloRep(JProgressBar barra, String texto, JTextArea area) {
        this.barra = barra;
        this.corre = true;
        this.texto = texto;
        this.area = area;
    }

    @Override
    public void run() {
        while (corre) {
            for (int i = 0; i < texto.length(); i++) {
                int car = texto.charAt(i);
                barra.setMaximum(122);

                if (car<97) {
                    barra.setBackground(Color.green);
                }else{
                    barra.setBackground(Color.red);
                }

                barra.setValue(car);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                area.setText(area.getText() + texto.charAt(i));
                corre = false;
            }
        }
    }
}
