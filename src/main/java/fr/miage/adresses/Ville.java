/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package fr.miage.adresses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author E12B336Z
 */
public class Ville {
	
	private String nomV;
        private List<Lieux> lieux = new ArrayList<Lieux>();

    public Ville(String nomV) {
        this.nomV = nomV;
    }



        
    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    /**
     * Retourn the unmodifiable list of places 
     * @return List<Lieux>
     */
    public List<Lieux> getLieux() {
        return Collections.unmodifiableList(lieux);
    }

    public void setLieux(List<Lieux> lieux) {
        this.lieux = lieux;
    }
    
    /**
     * Add a places in the town
     * @param lieu 
     */
    public void addLieu(Lieux lieu){
        lieux.add(lieu);
    }
    
    /**
     * Delete a place in the town
     * @param lieu 
     */
    public void delLieu(Lieux lieu){
        lieux.remove(lieu);
    }
  
}
