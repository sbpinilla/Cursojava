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
public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributo de cada elemento de una enumeracion
    private final int paises;

    //Constructor de cada elemento de una enumeracion
    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
    
    
    
}
