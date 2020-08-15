/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacontactos1;

import java.util.Scanner;



/**
 *
 * @author erika: La verdad es que tenia esperanzas de hacer esto más complejo, 
 * pero aún me falta camino por recorrer...
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Lista listaContactos = new Lista();
        
        String opcion = "";
        String nombre = null, apellido = null, numero = null;
        
        menu();
        
        do{
          
            opcion = input.next();
            
            try{
                switch(opcion) {
                    case "n": 
                        try{
                           
                            System.out.print("NOMBRE: ");
                            apellido = input.next();
                            
                            System.out.print("APELLIDO: ");
                            nombre = input.next();
                            
                            System.out.print("TELEFONO: ");
                            numero = input.next();
                            
                            
                            listaContactos.insertarLista(new Contacto(nombre, apellido, numero));
                            
                        }catch(NumberFormatException n){
                            System.out.println("Error " + n.getMessage());
                        
                        }
                        
                    break;
                    
                    case "l": 
                        
                        listaContactos.mostrarLista();
                        
                        break;
                        
                    case "b": 
                                               
                        listaContactos.borrarLista();
                        
                    break;
                        
                                            
                    case "q": 
                        System.exit(-1);        
                        
                        break;
                    
                    default:
                        System.out.println("Opción no válida. Por favor elija entre las isguientes opciones disponibles");
                        break;
                }
                
            }catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
            
            menu();
            
        }while (input.hasNext());
        
    
        
    }
    
    private static void menu() {
        System.out.println("\nDirectorio telefónico:\n\n" +
                        "          n     Agregar contacto\n" +
                        "          l     Listar contactos\n" +                 
                        "          b     Borrar lista de contactos\n" +
                        "          q     Salir\n");
       
            System.out.print("Selecciona la opción deseada: ");
    }
    
    
}


