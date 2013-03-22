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
     * Ajoute un ville dans le pays
     * @param ville 
     */
    public void addVille(Ville ville){
        villes.add(ville);
    }
    
    /**
     * Supprime une ville du pays
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
     * Retourne la liste des villes du pays, de façon non modifiable
     * @return List<Ville>
     */
    public List<Ville> getVilles() {
        return Collections.unmodifiableList(villes);
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
    
    
}
