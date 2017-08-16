/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.foreach;

/**
 *
 * @author Sergio
 */
public class ForEach {

    public static void main(String[] args) {

        int[] ededes = {15, 20, 25, 30, 40};

        Persona[] personas = {new Persona("Sergio"), new Persona("Camilo"), new Persona("Juan")};

        for (int edad : ededes) {

            System.out.println("Edad: " + edad);
        }
        
        System.out.println("");
        
        for (Persona persona : personas) {
            System.out.println("Nombre Persona: " + persona.getNombre());
        }

    }

}
