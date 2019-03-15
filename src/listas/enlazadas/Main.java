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
public class Main {
        public static void main(String[] args){
        Tren t;
    
        t=new Tren();
        
        t.agregarAlInicio("Rojo");
        t.agregarAlInicio("Verde");
        t.agregarAlInicio("Amarillo");
        t.agregarAlInicio("Azul");
        
        t.listaVacia();
        t.mostrarTren();
       
    }
}
