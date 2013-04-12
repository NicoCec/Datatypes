/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

package fr.miage.ressources;

/**
 * 
 * @author E12B336Z
 */
public class Allocation {
	private String myName; 
        private TypeRessource type;

    public TypeRessource getType() {
        return type;
    }

    public void setType(TypeRessource type) {
        this.type = type;
    }

    public Allocation(String myName, TypeRessource type) {
        this.myName = myName;
        this.type = type;
    }
        
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    
    public String toString(){
        return type.getType().name();
    }
}
