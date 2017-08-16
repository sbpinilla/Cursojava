/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava.bloquescodigo;

/**
 *
 * @author Sergio
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
  
    
    /*
        Bloque estatico. 
        Es el primero que se ejecuta
    */
    static{
        
        System.out.println("Ejecutar bloque estatico");
        contadorPersonas=10;
    }
    
    /*
        Bloque anonimo inicializador. 
        se ejecutaantes que el constructor
    */
    {
        System.out.println("Ejecutar bloque inicializador");
        idPersona=++contadorPersonas;   
    }

    
    Persona() {
         System.out.println("Ejecutar constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
    
    
}
