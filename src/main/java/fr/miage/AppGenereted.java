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
import fr.miage.adresses.TypeLieux;
import fr.miage.adresses.Ville;

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
        Email email = new Email("nicolas.dufour@etu.univ-nantes.fr", nomDomaine, nomUtilisateur);
        
        
        PaysAdresse france = new PaysAdresse("france");
        Ville nantes = new Ville("Nantes");
        
        
        Lieux lieux = new Lieux(TypeLieux.rue, "Michelet", 55);
        
    }
}
