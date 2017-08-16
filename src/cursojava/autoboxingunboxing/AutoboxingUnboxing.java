/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.autoboxingunboxing;

/**
 *
 * @author Sergio
 */
public class AutoboxingUnboxing {

    public static void main(String[] args) {


        //Autoboxing(se convierten de tipos primitivos a tipos Object)
        Integer enteroObj = 10;
        Float floatObj = 10.2f;
        Double doubleObj = 40.1;

        System.out.println("Autoboxing");
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Float Obj: " + floatObj.floatValue());
        System.out.println("Double Obj: " + doubleObj.doubleValue());
        
        //Autounboxing(se convierten de objetos a tipos primitivos)
        int entero = enteroObj;
        float flotante = floatObj;
        double doble = doubleObj;
        
        System.out.println("\nAutoboxing");
        System.out.println("Entero : " + entero);
        System.out.println("Float : " + flotante);
        System.out.println("Double : " + doble);
        
       
    }

}
