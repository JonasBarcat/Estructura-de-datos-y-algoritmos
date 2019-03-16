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
public class Lista {
    
    Nodo primero;
    
    
      //Agrego un numero a una lista par o impar dependiendo de cual sea
    // el medotod recibe dos listas vacias y agrega los nodos segun corresponda
    public void agregarParImpar(int numero,Lista listaPar,Lista listaImpar){
        if(numero%2==0){
        // es par agregar a la lista par
          listaPar.agregar(numero);
          System.out.println("Es par");
        }else{
        // es impar agrega a la lista impar
          listaImpar.agregar(numero);
          System.out.println("Es impar");
        }
    }
    
    
    // el medoto solo agrega nodos a una lista, en el metodo agregarParImpar se decide a cual de las dos
    public void agregar(int numero){
        System.out.println("numero "+numero+" recibido en el metodoa agregar");
        Nodo nuevo=new Nodo(numero);
        nuevo.setSiguiente(this.primero);
        this.primero=nuevo;
    }
    
    
    
    
    // este metodo muestra la lista que lo llamó
    public void mostrarLista(){
        Nodo aux=this.primero;
        while(aux!=null){
            System.out.print("|"+aux.getValor()+"|->"); 
            aux=aux.getSiguiente();
        }
        System.out.println(" Fin de la lista");
    }
    
 
    
    
}
