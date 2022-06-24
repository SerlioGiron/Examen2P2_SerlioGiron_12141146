/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_serliogiron_12141146;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cancion implements Serializable{
    //Las canciones tienen nombre, categoría y la lista de
    //caracteres que componen dicha canción
    
    String nombre;
    String categoria;
    ArrayList caracteres = new ArrayList();

    public Cancion() {
    }

    
    
    public Cancion(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    
    
    
    @Override
    public String toString() {
        return nombre ;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(ArrayList caracteres) {
        this.caracteres = caracteres;
    }
    
    
}
