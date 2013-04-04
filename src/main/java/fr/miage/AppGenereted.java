/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 04-04-2013
 */

package fr.miage;

import fr.miage.adresses.Email;
import fr.miage.adresses.Lieux;
import fr.miage.adresses.NomDomaine;
import fr.miage.adresses.NomUtilisateur;
import fr.miage.adresses.PaysAdresse;
import fr.miage.adresses.Telephone;
import fr.miage.adresses.TypeLieux;
import fr.miage.adresses.Ville;
import fr.miage.financier.Devise;
import fr.miage.financier.TauxDeConversion;
import fr.miage.financier.Conversion;
import fr.miage.mesures.FacteurConversion;
import fr.miage.mesures.Quantite;
import fr.miage.mesures.Unite;
import fr.miage.ressources.Allocation;
import fr.miage.ressources.TypeRessource;
import fr.miage.ressources.TypeTempo;
import fr.miage.temporel.DateTempo;
import fr.miage.temporel.EvenementRecurrent;
import fr.miage.temporel.Heure;
import fr.miage.temporel.IntervalleHoraire;
import fr.miage.temporel.TypeEvenementRecurrent;
import java.text.DateFormat;


/**
 * Hello world!
 *
 */
public class AppGenereted 
{
    public static void main( String[] args )
    {
        NomDomaine nomDomaine = new NomDomaine("etu.univ-nantes.fr");
        NomUtilisateur nomUtilisateur = new NomUtilisateur("nicolas.dufour");
        Email email = new Email(nomDomaine, nomUtilisateur);
        
        Telephone tel = new Telephone("0666666666");
        
        PaysAdresse france = new PaysAdresse("france");
        Ville nantes = new Ville("Nantes");
        Lieux rueMichelet = new Lieux(TypeLieux.rue, "Michelet", 55);
        Lieux avenueDuBoutDuMonde = new Lieux(TypeLieux.avenue, "du bout du monde", 652);
        france.addVille(nantes);
        nantes.addLieu(rueMichelet);
        nantes.addLieu(avenueDuBoutDuMonde);
        
        PaysAdresse etatUnis = new PaysAdresse("Etats Unis d'Amérique");
        Ville sf = new Ville("San Fransisco");
        Lieux rueSf = new Lieux(TypeLieux.rue, "San Fransisco", 12);
        Lieux impasseNoWhere = new Lieux(TypeLieux.impasse, "Nowhere", 986);
        france.addVille(sf);
        nantes.addLieu(rueSf);
        nantes.addLieu(impasseNoWhere);
        
        
        Devise euro = new Devise("Euro");
        euro.ajouterPays(france);
        
        Devise dollar = new Devise("Dollar");
        dollar.ajouterPays(etatUnis);
        
        TauxDeConversion tauxEuroDollar = new TauxDeConversion(0.4564883);
        
        Conversion conversionEuroDollar = euro.convertir(tauxEuroDollar, dollar, 10000);
        System.out.println("montant de la conversion de "+conversionEuroDollar.getDeviseDepart().getNom()+" en "+ conversionEuroDollar.getDeviseArrivee().getNom() +" :" + conversionEuroDollar.getMontantArrivee() );
        
        Unite metre = new Unite("mètre");
        Unite km = new Unite("kilomètre");
        FacteurConversion facteurMetreKilometre = new FacteurConversion(0.001);
        Quantite quantite = new Quantite(100, metre);
        fr.miage.mesures.Conversion conversionMetreKilometre = quantite.convertir(metre, facteurMetreKilometre);
        System.out.println("nombre de kilomètres: " + conversionMetreKilometre.getMyQuantiteArr() );
        
        TypeRessource ressourceMaterielle = new TypeRessource(TypeTempo.materielle);
        Allocation allocation = new Allocation("ordinateur", ressourceMaterielle);
        
        Heure heureReveil = new Heure(7, 0, 0);
        DateTempo dateRentree = new DateTempo(1, 9, 2012, heureReveil);
        DateTempo dateVacances = new DateTempo(30, 6, 2013, heureReveil);
        EvenementRecurrent evtRecur = new EvenementRecurrent(TypeEvenementRecurrent.quotidien, "réveil");
        IntervalleHoraire periodeScolaire = new IntervalleHoraire(dateRentree, dateVacances);
        
        
        
    }
}
