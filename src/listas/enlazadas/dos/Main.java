/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.enlazadas.dos;

/**
 *
 * @author jonas
 */
public class Main {
     public static void main(String[] args){
         Lista t;
         Lista par;
         Lista impar;
         
         t=new Lista(); // solo crea al "tren" principal para poder llamar al metodo que compara las listas par e impar
         // Creacion de las dos listas vacias, par e impar
         par=new Lista();
         impar=new Lista();
         
         t.agregarParImpar(2,par, impar);
         t.agregarParImpar(4,par, impar);
         t.agregarParImpar(6,par, impar);
         t.agregarParImpar(1,par, impar);
         t.agregarParImpar(3,par, impar);
         t.agregarParImpar(5,par, impar);
         
         par.mostrarLista();
         impar.mostrarLista();
         
     }
    
}
