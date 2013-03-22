package fr.miage.temporel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author E12B336Z
 */
public class IntervalleHoraire {
	
	private DateTempo dateDebut;
	private DateTempo dateFin;
        private List<EvenementRecurrent> evenementsRec = new ArrayList<EvenementRecurrent>();

    /**
     * Retourne la liste des événements récurrents dans une liste non modifiable
     * @return 
     */
    public List<EvenementRecurrent> getEvenementsRec() {
        return Collections.unmodifiableList(evenementsRec);
    }

    public void setEvenementsRec(List<EvenementRecurrent> evenementsRec) {
        this.evenementsRec = evenementsRec;
    }

    public IntervalleHoraire(DateTempo dateDebut, DateTempo dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public DateTempo getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(DateTempo dateDebut) {
        this.dateDebut = dateDebut;
    }

    public DateTempo getDateFin() {
        return dateFin;
    }

    public void setDateFin(DateTempo dateFin) {
        this.dateFin = dateFin;
    }
	
    /**
     * Ajoute un événement récurrent à l'intervalle horaire
     * @param evtRec 
     */
    public void addEvenementRec(EvenementRecurrent evtRec){
        evenementsRec.add(evtRec);
    }
    
    /**
     * Supprime un événement récurrent de l'intervalle horaire
     * @param evtRec 
     */
    public void delEvenementRec(EvenementRecurrent evtRec){
        evenementsRec.remove(evtRec);
    }
}
