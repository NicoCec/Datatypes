package fr.miage.adresses;

/**
 * 
 * @author E12B336Z
 */
public class Lieux {
	
	private TypeLieux type;
	private Ville myVille;

    public Lieux(TypeLieux type, Ville myVille) {
        this.type = type;
        this.myVille = myVille;
    }
        
    public TypeLieux getType() {
        return type;
    }

    public void setType(TypeLieux type) {
        this.type = type;
    }

    public Ville getMyVille() {
        return myVille;
    }

    public void setMyVille(Ville myVille) {
        this.myVille = myVille;
    }

}
