/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.varargs;

/**
 *
 * @author Sergio
 */
public class EjemploVarArgs {

    public static void main(String[] args) {

        imprimirNumeros(1, 6, 5, 3, 2, 3, 4, 5, 6, 0);
        System.out.println("");
        imprimirNumerosForeach(2, 3, 4, 5, 6, 0);
        System.out.println("");
        variosParametros("Juan", true, 1, 2, 3, 4, 5);

    }

    public static void imprimirNumeros(int... numeros) {

        int numero;

        for (int i = 0; i < numeros.length; i++) {

            numero = numeros[i];
            System.out.println("El numero es: " + numero);
        }
    }

    public static void imprimirNumerosForeach(int... numeros) {

        for (int numero : numeros) {

            System.out.println("El numero es: " + numero);
        }
    }

    //varArgs debe ser el ultimo elemento en los parametros declarados
    public static void variosParametros(String nombre, boolean valido, int... numeros) {

        System.out.println("Nombre: " + nombre);
        System.out.println("Valido: " + valido);

        //usamos un foreach
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }

    }

}
