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
     * Cette fonction convertit une quantité de départ ayant une unité spécifiée en une quantité d'arrivée ayant une unité spécifiée.
     * Elle retourne un objet Conversion contenant toutes les informations de la conversion.
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
