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
        private PaysAdresse pays;

    public Ville(String nomV, PaysAdresse pays) {
        this.nomV = nomV;
        this.pays = pays;
    }

    public PaysAdresse getPays() {
        return pays;
    }

    public void setPays(PaysAdresse pays) {
        this.pays = pays;
    }

        
    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    /**
     * Retourne la liste des lieux de façon non modifiable
     * @return List<Lieux>
     */
    public List<Lieux> getLieux() {
        return Collections.unmodifiableList(lieux);
    }

    public void setLieux(List<Lieux> lieux) {
        this.lieux = lieux;
    }
    
    /**
     * Ajoute un lieu dans la ville
     * @param lieu 
     */
    public void addLieu(Lieux lieu){
        lieux.add(lieu);
    }
    
    /**
     * Supprime un lieu de la ville
     * @param lieu 
     */
    public void delLieu(Lieux lieu){
        lieux.remove(lieu);
    }
}
