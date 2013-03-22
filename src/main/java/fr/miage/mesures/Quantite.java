package fr.miage.mesures;

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
        
    public Conversion convertir(int quantiteDep, Unite uniteArr, FacteurConversion facteurConv){
        
        double quantiteArr = quantiteDep * facteurConv.getMyFacteur();
        
        return new Conversion(quantiteDep, quantiteArr, this.getUnite(), uniteArr);
    }
}
