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
    
        t=new Tren();//iniciar una lista t vacía METODO 1 (el resto en la clase tren)
        
       
        
        //agrego unos cuantos nodos al inicio
        t.agregarAlInicio("Rojo");   // USO DEL METODO 3
        t.agregarAlInicio("Verde");
        t.agregarAlInicio("Amarillo");
        t.agregarAlInicio("Azul");
        t.agregarAlInicio("Marron");
        t.agregarAlInicio("Rojo");
        t.agregarAlInicio("Blanco");
        t.agregarAlInicio("Vintage");
        
        //Verifico si la lista esta vacia o no
        t.estaListaVacia();     // USO DE METODO 2
        t.recorrerNodos();      // USO DEL METODO 5
        
//        llamada a metodo agregar nodo al final
        t.agregarAlFinal("Violeta");  // USO DEL METODO 4
        t.recorrerNodos();      // USO DEL METODO 5
        
        //veo la cantidad de nodos que hay
        t.cantidadNodos();      // USO DEL METODO 6
       
        
        t.eliminarPrimero(); //USO DEL METODO 7
        t.recorrerNodos();
        
        
        t.eliminarUltimo(); //USO DEL METODO 8
        t.recorrerNodos();
        
        t.dadoUnValorEliminar("Rojo");  // USO DEL METODO 9
        t.recorrerNodos();
//        
        
        t.mostrarContenido(2); // USO DEL METODO 10
        
        t.modificarNodoI(2, "Frutilla");
        t.recorrerNodos();
        
//        
        t.insertarNodo(3, "Purpura");  //USO DEL METODO 12
        t.recorrerNodos();
        
        
        t.eliminarNodo(3);
        t.recorrerNodos();
    }
}
