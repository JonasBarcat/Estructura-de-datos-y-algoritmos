/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.enlazadas;

/**
 *
 * @author jonas
 */
public class Vagon {
    private String color;
    private Vagon siguiente;
    
    // constructor de vagones
  public Vagon(String color){
        this.color=color;
        this.siguiente=null;
    }
    
    //setters y getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vagon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vagon siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
