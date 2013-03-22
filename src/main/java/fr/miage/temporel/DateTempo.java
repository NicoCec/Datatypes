package fr.miage.temporel;

public class DateTempo {
	
	private int jour;
	private int mois;
	private int annee;
	private Heure myHeure;
	
	public DateTempo(int jour, int mois, int annee, Heure myHeure) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.myHeure = myHeure;
	}

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Heure getMyHeure() {
        return myHeure;
    }

    public void setMyHeure(Heure myHeure) {
        this.myHeure = myHeure;
    }
	
}
