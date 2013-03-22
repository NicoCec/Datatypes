package fr.miage.financier;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import fr.miage.temporel.DateTempo;
import fr.miage.temporel.Heure;

import fr.miage.adresses.PaysAdresse;
import java.util.Collections;
import java.util.List;

public class Devise {

	private String nom;
	private List<PaysAdresse> myListePays = new ArrayList<PaysAdresse>();
	
	public Devise(String nom, List<PaysAdresse> myListePays) {
		this.nom = nom;
		this.myListePays = myListePays;
	}

	public void ajouterPays(PaysAdresse pays){
		myListePays.add(pays);
	}
	
	public void supprimerPays(PaysAdresse pays){
		myListePays.remove(pays);
	}
	
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

    public List<PaysAdresse> getMyListePays() {
        return Collections.unmodifiableList(myListePays);
    }

    public void setMyListePays(List<PaysAdresse> myListePays) {
        this.myListePays = myListePays;
    }
}
