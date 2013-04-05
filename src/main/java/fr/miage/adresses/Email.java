/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.adresses;

/**
 * 
 * @author E12B336Z
 */
public class Email {

	private NomDomaine myNomDomaine;
	private NomUtilisateur myNomUtilisateur;

    public Email( NomDomaine myNomDomaine, NomUtilisateur myNomUtilisateur) {
        this.myNomDomaine = myNomDomaine;
        this.myNomUtilisateur = myNomUtilisateur;
    }

    public NomDomaine getMyNomDomaine() {
        return myNomDomaine;
    }

    public void setMyNomDomaine(NomDomaine myNomDomaine) {
        this.myNomDomaine = myNomDomaine;
    }

    public NomUtilisateur getMyNomUtilisateur() {
        return myNomUtilisateur;
    }

    public void setMyNomUtilisateur(NomUtilisateur myNomUtilisateur) {
        this.myNomUtilisateur = myNomUtilisateur;
    }
    
}
