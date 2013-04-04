/**
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 */

package fr.miage.ressources;

/**
 * 
 * @author E12B336Z
 */
public class TypeRessource {
	
	private TypeTempo type;

    public TypeTempo getType() {
        return type;
    }

    public void setType(TypeTempo type) {
        this.type = type;
    }

    public TypeRessource(TypeTempo type) {
        this.type = type;
    }
	
}
