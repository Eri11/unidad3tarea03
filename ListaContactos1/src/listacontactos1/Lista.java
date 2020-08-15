/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacontactos1;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if (inicio == null){
            return true;
        } else {
            return false;
        }
    }
    
    public void insertarLista(Contacto contacto){
        Nodo actual;
        if(estaVacia()){
            actual = new Nodo(contacto, null);
            inicio = actual;
            fin = actual;
        } else {
            actual = new Nodo(contacto, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
 
        while (recorrer != null){

            System.out.println("[ "+recorrer.getActual().toString()+" ]");
            recorrer = recorrer.getSiguiente();
        
        }
        
    }
    
    public void borrarLista() 
    { 
        inicio = null; 
    }
    
  
}
    
        