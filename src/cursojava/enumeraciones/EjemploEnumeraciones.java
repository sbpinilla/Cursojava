/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.enumeraciones;

/**
 *
 * @author Sergio
 */
public class EjemploEnumeraciones {

    public static void main(String[] args) {

        System.out.println("Valor 1: " + Dias.LUNES);
        indicarDia(Dias.LUNES);

        System.out.println("Contenido no. 4:" + Continentes.AMERICA);
        System.out.println("Paises en america:" + Continentes.AMERICA.getPaises());

        System.out.println("");
        
        indicarContinente(Continentes.AFRICA);
        
        System.out.println("");
        
        imprimirContinentes();

    }

    public static void imprimirContinentes(){
        
        for(Continentes c: Continentes.values()){
            System.out.println(c +" tiene " + c.getPaises() + " paises");
        }
    }
    
    public static void indicarContinente(Continentes continente) {

        switch (continente) {

            case AFRICA:
                System.out.println(continente + " tiene " + continente.getPaises() + " paises");
                break;

        }

    }

    public static void indicarDia(Dias dia) {

        switch (dia) {

            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            default:
                System.out.println("Otro día");
        }

    }

}
