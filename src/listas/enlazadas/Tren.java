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
public class Tren {
    
    
    Vagon primero;
  
    //constructor del tren
    public Tren() {
    }
    
    // si no hay vagones en la lista( si la lista está vacía) muestra:"La lista esta vacia"
    //se ve su funcionamiento cuando no hay vagones cargados en el Main
    public void listaVacia(){
        if(this.primero==null){
            System.out.println("La lista se encuentra vacía (primero apunta a nulo");
        }else System.out.println("La lista no esta vacía");
    }
    
    
    //metodo para agregar vagones
    public void agregarAlInicio(String color){
        Vagon v=new Vagon(color);  // v apunta a la direccion del cagon recien creado
        v.setSiguiente(this.primero); // hago que v apunte a donde esta apuntando el primer vagon (null)
        this.primero=v; //ahora hago que el primero apunte a la direccion donde esta donde apuntaba v
    }
    
    //metodos para mostrar los vagones
    public void mostrarTren(){
        Vagon aux=this.primero;  //aux apunta en la direccion donde apunta el primero
        while(aux!=null){  // como aux está apuntando ahora al inicio de la lista entonce será distinto de nulo
            System.out.print("|"+aux.getColor()+"|->"); //obtengo los datos del objeto en la primera posicion apuntada
            aux=aux.getSiguiente(); //ahora aux apunta en la direccion del siguiente objeto en la lista 
            if(aux==null){System.out.println(" Fin de la lista");}
        }
        System.out.println("");
    }
    

  
    
    
    
    
    
}
