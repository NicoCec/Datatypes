/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 04-04-2013
 */

package fr.miage.adresses;

/**
 * 
 * @author E12B336Z
 */
public class Lieux {
	
	private TypeLieux type;
	private Ville myVille;

    public Lieux(TypeLieux type, Ville myVille) {
        this.type = type;
        this.myVille = myVille;
    }
        
    public TypeLieux getType() {
        return type;
    }

    public void setType(TypeLieux type) {
        this.type = type;
    }

    public Ville getMyVille() {
        return myVille;
    }

    public void setMyVille(Ville myVille) {
        this.myVille = myVille;
    }

}
