package fr.miage.adresses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaysAdresse {
	
	private String nomP;
        private List<Ville> villes = new ArrayList<Ville>();

    public PaysAdresse(String nomP) {
        this.nomP = nomP;
    }

    public void addVille(Ville ville){
        villes.add(ville);
    }
    
    public void delVille(Ville ville){
        villes.remove(ville);
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public List<Ville> getVilles() {
        return Collections.unmodifiableList(villes);
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
    
    
}
