/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
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
        System.out.println("adresse mail : "+email.toString());
        
        Telephone tel = new Telephone("0666666666");
        System.out.println("numéro de téléphone : "+tel.toString());
        
        PaysAdresse france = new PaysAdresse("france");
        Ville nantes = new Ville("Nantes");
        Lieux rueMichelet = new Lieux(TypeLieux.rue, "Michelet", 55);
        Lieux avenueDuMonde = new Lieux(TypeLieux.avenue, "du monde", 652);
        france.addVille(nantes);
        nantes.addLieu(rueMichelet);
        nantes.addLieu(avenueDuMonde);
        
        PaysAdresse etatUnis = new PaysAdresse("Etats Unis d'Amérique");
        Ville sanf = new Ville("San Fransisco");
        Lieux rueSf = new Lieux(TypeLieux.rue, "San Fransisco", 12);
        Lieux impasseNoWhere = new Lieux(TypeLieux.impasse, "Nowhere", 986);
        france.addVille(sanf);
        nantes.addLieu(rueSf);
        nantes.addLieu(impasseNoWhere);
        
        
        Devise euro = new Devise("Euro");
        euro.ajouterPays(france);
        
        Devise dollar = new Devise("Dollar");
        dollar.ajouterPays(etatUnis);
        
        TauxDeConversion tauxEuroDollar = new TauxDeConversion(0.4564883);
        
        Conversion convEuroDollar =null;
        convEuroDollar = euro.convertir(tauxEuroDollar, dollar, 10000);
        System.out.println(convEuroDollar.toString());
        
        Unite metre = new Unite("mètre");
        Unite kmetre = new Unite("kilomètre");
        System.out.println("kilomètre : "+kmetre.getMyNom());
        
        FacteurConversion facteurMKm = new FacteurConversion(0.001);
        Quantite quantite = new Quantite(100, metre);
        fr.miage.mesures.Conversion convMKm = quantite.convertir(kmetre, facteurMKm);
        System.out.println("nombre de kilomètres: " + convMKm.getMyQuantiteArr() );
        System.out.println("nombre de kilomètres: " + convMKm.toString());
        
        TypeRessource ressMaterielle = new TypeRessource(TypeTempo.materielle);
        Allocation allocation = new Allocation("ordinateur", ressMaterielle);
        System.out.println("type de l'allocation : "+allocation.toString());
        
        
        Heure heureReveil = new Heure(7, 0, 0);
        DateTempo dateRentree = new DateTempo(1, 9, 2012, heureReveil);
        DateTempo dateVacances = new DateTempo(30, 6, 2013, heureReveil);
        EvenementRecurrent evtRecur = new EvenementRecurrent(TypeEvenementRecurrent.quotidien, "réveil");
        IntervalleHoraire periodeScolaire = new IntervalleHoraire(dateRentree, dateVacances);
        System.out.println("Récurrence de l'évenement : "+evtRecur.toString());
        System.out.println("Rentrée des classes le : "+periodeScolaire.getDateDebut().toString());
        
     }
}
