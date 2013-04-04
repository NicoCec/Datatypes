/**
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 */

package fr.miage.mesures;

/**
 * 
 * @author E12B336Z
 */
public class Quantite {
	private int myValeur;
        private Unite unite;

    public Quantite(int myValeur, Unite unite) {
        this.myValeur = myValeur;
        this.unite = unite;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }
        
    public int getMyValeur() {
        return myValeur;
    }

    public void setMyValeur(int myValeur) {
        this.myValeur = myValeur;
    }
        
    /**
     * Convert an amount in a specific unit of measure to an other unit 
     * It returns a Conversion object, which contains all informations about this conversion
     * @param quantiteDep
     * @param uniteArr
     * @param facteurConv
     * @return 
     */
    public Conversion convertir(int quantiteDep, Unite uniteArr, FacteurConversion facteurConv){
        
        double quantiteArr = quantiteDep * facteurConv.getMyFacteur();
        
        return new Conversion(quantiteDep, quantiteArr, this.getUnite(), uniteArr);
    }
}
