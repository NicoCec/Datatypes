package fr.miage.ressources;

/**
 * 
 * @author E12B336Z
 */
public class Allocation {
	private String myName; 
        private TypeRessource type;

    public TypeRessource getType() {
        return type;
    }

    public void setType(TypeRessource type) {
        this.type = type;
    }

    public Allocation(String myName, TypeRessource type) {
        this.myName = myName;
        this.type = type;
    }
        
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
