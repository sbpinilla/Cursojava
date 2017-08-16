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
public class BloquesCodigo {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        int id1 = p1.getIdPersona();
        System.out.println("id Perosna 1: " + id1);
        
        System.out.println("");
        
        Persona p2 = new Persona();
        int id2 = p2.getIdPersona();
        System.out.println("id Perosna 2: " + id2);
    }

}
