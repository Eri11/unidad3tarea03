/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacontactos1;

/**
 *
 * @author erika
 */
public class Nodo {
    
    public Contacto actual;
    public Nodo siguiente;
    
    
    public Nodo(Contacto actual, Nodo siguiente){
        this.siguiente = siguiente;
        this.actual = actual;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Contacto getActual() {
        return actual;
    }

    public void setActual(Contacto actual) {
        this.actual = actual;
    }
    
}
