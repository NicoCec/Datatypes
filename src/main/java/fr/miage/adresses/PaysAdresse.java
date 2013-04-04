/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 04-04-2013
 */

package fr.miage.adresses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author E12B336Z
 */
public class PaysAdresse {
	
	private String nomP;
        private List<Ville> villes = new ArrayList<Ville>();

    public PaysAdresse(String nomP) {
        this.nomP = nomP;
    }

    /**
     * Add a town in the country
     * @param ville 
     */
    public void addVille(Ville ville){
        villes.add(ville);
    }
    
    /**
     * Delete a town in the country
     * @param ville 
     */
    public void delVille(Ville ville){
        villes.remove(ville);
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    /**
     * Return the unmodifiable list of towns in the country
     * @return List<Ville>
     */
    public List<Ville> getVilles() {
        return Collections.unmodifiableList(villes);
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
    
    
}
