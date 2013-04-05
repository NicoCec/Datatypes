/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.financier;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import fr.miage.temporel.DateTempo;
import fr.miage.temporel.Heure;

import fr.miage.adresses.PaysAdresse;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author E12B336Z
 */
public class Devise {

	private String nom;
	private List<PaysAdresse> myListePays = new ArrayList<PaysAdresse>();
	
	public Devise(String nom) {
		this.nom = nom;
	}

        /**
         * Add the country where is the currency
         * @param pays 
         */
	public void ajouterPays(PaysAdresse pays){
		myListePays.add(pays);
	}
	
        /**
         * Delete a country where was a currency
         * @param pays 
         */
	public void supprimerPays(PaysAdresse pays){
		myListePays.remove(pays);
	}
	
        /**
         * Convert an amount in a specific currency to an other currency.
         * This function return a Conversion object, which contains all informations about this conversion

         * @param taux
         * @param deviseArr
         * @param montantDep
         * @return Conversion
         */
	public Conversion convertir(TauxDeConversion taux, Devise deviseArr, double montantDep){
		
                double montantArr = montantDep*taux.getTaux();
		
		Calendar calendar = new GregorianCalendar();
		int annee = calendar.get(Calendar.YEAR);
		int mois = calendar.get(Calendar.MONTH);
		mois +=1;
		int jour = calendar.get(Calendar.DAY_OF_MONTH);
		
		int heure = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int seconde = calendar.get(Calendar.SECOND);
		
		//System.out.println("a : "+annee+", m : "+mois+", j : "+jour+", h : "+heure+", m : "+minute+", s : "+seconde);
		
		Heure heureConv = new Heure(heure, minute, seconde);
		DateTempo dateConv = new DateTempo(jour, mois, annee, heureConv);
		
		return new Conversion(montantDep, montantArr, this, deviseArr, dateConv); 
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Return the list of country where is the currency.
     * La liste n'est pas modifiable
     * @return List<PaysAdresse>
     */
    public List<PaysAdresse> getMyListePays() {
        return Collections.unmodifiableList(myListePays);
    }

    public void setMyListePays(List<PaysAdresse> myListePays) {
        this.myListePays = myListePays;
    }

    @Override
    public String toString(){
        return nom;
    }
}
