/**
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 */

package fr.miage.adresses;

/**
 * 
 * @author E12B336Z
 */
public class Email {

	private String mail;
	private NomDomaine myNomDomaine;
	private NomUtilisateur myNomUtilisateur;

    public Email(String mail, NomDomaine myNomDomaine, NomUtilisateur myNomUtilisateur) {
        this.mail = mail;
        this.myNomDomaine = myNomDomaine;
        this.myNomUtilisateur = myNomUtilisateur;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
