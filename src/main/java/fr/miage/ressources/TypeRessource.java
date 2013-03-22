package fr.miage.ressources;

public class TypeRessource {
	
	private TypeTempo type;

    public TypeTempo getType() {
        return type;
    }

    public void setType(TypeTempo type) {
        this.type = type;
    }

    public TypeRessource(TypeTempo type) {
        this.type = type;
    }
	
}
