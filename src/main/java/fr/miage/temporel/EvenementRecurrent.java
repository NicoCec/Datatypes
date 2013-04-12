/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

package fr.miage.temporel;
/**
 * 
 * @author E12B336Z
 */
public class EvenementRecurrent {
	
	private TypeEvenementRecurrent myType;
	private String myNom;

    public EvenementRecurrent(TypeEvenementRecurrent myType, String myNom) {
        this.myType = myType;
        this.myNom = myNom;
    }

    public TypeEvenementRecurrent getMyType() {
        return myType;
    }

    public void setMyType(TypeEvenementRecurrent myType) {
        this.myType = myType;
    }

    public String getMyNom() {
        return myNom;
    }

    public void setMyNom(String myNom) {
        this.myNom = myNom;
    }

    @Override
    public String toString(){
        return myNom+" de type "+myType.name();
    }
}
