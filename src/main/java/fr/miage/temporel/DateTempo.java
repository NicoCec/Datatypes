/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 04-04-2013
 */

package fr.miage.temporel;

/**
 * 
 * @author E12B336Z
 */
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
