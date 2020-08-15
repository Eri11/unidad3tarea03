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
public class Contacto {
    private String nombre;
    private String apellido;
    private String numero;
    

    

    public Contacto(String apellido, String nombre, String numero) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numero = numero;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    @Override
    public String toString() {
        return "|| " +nombre+ "  " +apellido+ " || " +numero+ " ||";
    }
    
    
    
}