/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package fr.miage.adresses;

/**
 * 
 * @author E12B336Z
 */
public class NomUtilisateur {
	
	private String adresseU;

    public NomUtilisateur(String adresseU) {
        this.adresseU = adresseU;
    }    
        
    public String getAdresseU() {
        return adresseU;
    }

    public void setAdresseU(String adresseU) {
        this.adresseU = adresseU;
    }

     @Override
    public String toString(){
        return adresseU;
    }

}
