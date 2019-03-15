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
    
   
    
    ///métodos-----------------------------------------
    
    // si no hay vagones en la lista( si la lista está vacía) muestra:"La lista esta vacia"
    //se ve su funcionamiento cuando no hay vagones cargados en el Main
    public void estaListaVacia(){ // verifica si esta o no vacia la lsita??  METODO 2 
        if(this.primero==null){
            System.out.println("La lista se encuentra vacía (primero apunta a nulo");
        }else System.out.println("La lista no esta vacía");
    }
    
    
    //metodo para agregar vagones (nodos) al comienzo de la lista
    public void agregarAlInicio(String color){                   //METODO 3
        Vagon v=new Vagon(color);  // v apunta a la direccion del cagon recien creado
        v.setSiguiente(this.primero); // hago que v apunte a donde esta apuntando el primer vagon (null)
        this.primero=v; //ahora hago que el primero apunte a la direccion donde esta donde apuntaba v
    }
    
    
    public void agregarAlFinal(String color){   //  METODO 4
      
        Vagon aux=this.primero; //creo una referencia aux para pasar de vagon a vagon hasta llegar al ultimo
            while(aux.getSiguiente()!=null){  //cuando la referencia apunte al nulo entonces es porque estamos al final de la lista
                aux=aux.getSiguiente();
            }    
        Vagon v=new Vagon(color); //creo una referencia a un vagon para colocarlo al final  (instancio un nuevo nodo)         
        aux.setSiguiente(v);
      
    
    }
    
    
    
    //metodos para mostrar los vagones
    public void recorrerNodos(){             //     METODO 5
        Vagon aux=this.primero;  //aux apunta en la direccion donde apunta el primero
        while(aux!=null){  // como aux está apuntando ahora al inicio de la lista entonce será distinto de nulo
            System.out.print("|"+aux.getColor()+"|->"); //obtengo los datos del objeto en la primera posicion apuntada
            aux=aux.getSiguiente(); //ahora aux apunta en la direccion del siguiente objeto en la lista 
            if(aux==null){System.out.println(" Fin de la lista");}
        }
        System.out.println("");
    }
    
    
    
    //metodo que muestra la cantidad de nodos en la lista
    public void cantidadNodos(){        // METODO 6
        Vagon aux=this.primero;
        int c=0; //contador
            while(aux!=null){
                c++;
                aux=aux.getSiguiente();
            }
        System.out.println("Cantidad de nodos encontrados: "+c);  
        System.out.println("");
    }

  
    
    // metodo para eliminar el primer vagon    METODO 7
    public void eliminarPrimero(){ 
           Vagon aux=this.primero; // aux apunta donde esta apuntado primero( primer vagon )
           this.primero=aux.getSiguiente(); //ahora primero apunta al siguiente del primer vagon
           System.out.println("El nuevo primer vagon es:"+this.primero.getColor());
           System.out.println("La nueva lista es:");
    }
    
    
    
    
    public void eliminarUltimo(){ // METODO 8
        // veamos primero el tamaño de la lista, luego boramos el vagon en la ultima posicion
        Vagon aux=this.primero;     //aux  lo utilizo para encontrar la cantidad de elementos en la lsita
        int contador=0;
            while(aux!=null){
                aux=aux.getSiguiente();
                contador++;
            }
        
        Vagon aux2=this.primero;  // aux2 servira para eliminar el ultimo vagon
            for(int i=1; i<(contador-1);i++){  // me posiciono en el anteultimo vagon
            aux2=aux2.getSiguiente();
         }   
       
      aux2.setSiguiente(null);// mando el anteultimo a null, luego el ultimo vagon desaparece
      System.out.println("El ultimo vagon ahora es: "+aux2.getColor());
      System.out.println("La nueva lista es:");      
    }
    
    
    
    // este metodo elimina los vagones contenidos en el valor ingresado  // METODO 9
    public void dadoUnValorEliminar(int valor){
       
        System.out.println("Eliminar vagones contenidos en:" +valor);
        Vagon aux=this.primero;
        
            for(int i=1; i<=valor; i++){ // me posiciono en el objeto de la posicion "valor"
                 aux=aux.getSiguiente();
            }     
        
        this.primero=aux; // ahora el primero empieza a apuntar al vagon  en la posicion "valor"
        System.out.println("El vagon de color "+this.primero.getColor()+" es el nuevo primer vagor de la fila");
    
    }
    
    
    // recibie la posicion y avisa que vagon esta en esa posicion    METODO 10
    public void mostrarContenido(int posicion){
        Vagon aux=this.primero;
        
            for(int i=1;i<posicion;i++){
                aux=aux.getSiguiente();
            }
        System.out.println("EL color del vagon de la posicion "+posicion+" es:"+aux.getColor());    
    }
    
    
    
    
    
    
    
}
