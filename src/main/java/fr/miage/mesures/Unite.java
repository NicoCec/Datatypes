/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package fr.miage.mesures;

/**
 * 
 * @author E12B336Z
 */
public class Unite {
	
	private String myNom;

    public Unite(String myNom) {
        this.myNom = myNom;
    }

    public String getMyNom() {
        return myNom;
    }

    public void setMyNom(String myNom) {
        this.myNom = myNom;
    }
	
    @Override
    public String toString(){
        return myNom;
    }
}
