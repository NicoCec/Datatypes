package fr.miage.temporel;

public class EvenementRecurrent {
	
	private TypeEvenementRecurrent myType;
	private String myNom;

    public EvenementRecurrent(TypeEvenementRecurrent myType, String myNom) {
        this.myType = myType;
        this.myNom = myNom;
    }

    public TypeEvenementRecurrent getMyType() {
        return myType;
    }

    public void setMyType(TypeEvenementRecurrent myType) {
        this.myType = myType;
    }

    public String getMyNom() {
        return myNom;
    }

    public void setMyNom(String myNom) {
        this.myNom = myNom;
    }
	
}
