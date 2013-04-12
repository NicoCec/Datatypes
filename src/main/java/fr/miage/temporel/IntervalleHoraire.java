/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

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
     * Return the unmodifiable list of events
     * @return list of events
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
     * Add an event to the current interval
     * @param evtRec 
     */
    public void addEvenementRec(EvenementRecurrent evtRec){
        evenementsRec.add(evtRec);
    }
    
    /**
     * Delete an event from the current interval
     * @param evtRec 
     */
    public void delEvenementRec(EvenementRecurrent evtRec){
        evenementsRec.remove(evtRec);
    }
    
    @Override
    public String toString(){
        return "date de début "+dateDebut.toString()
                +"date de fin "+dateFin.toString();
    }
}
