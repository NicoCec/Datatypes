/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.financier;

import fr.miage.temporel.DateTempo;

/**
 * 
 * @author E12B336Z
 */
public class Conversion {

	private double montantDepart;
	private double montantArrivee;
        private Devise deviseDepart;
	private Devise deviseArrivee;
	private DateTempo dateConv;
        
    public double getMontantDepart() {
        return montantDepart;
    }

    public void setMontantDepart(double montantDepart) {
        this.montantDepart = montantDepart;
    }

    public double getMontantArrivee() {
        return montantArrivee;
    }

    public void setMontantArrivee(double montantArrivee) {
        this.montantArrivee = montantArrivee;
    }

    public Devise getDeviseDepart() {
        return deviseDepart;
    }

    public void setDeviseDepart(Devise deviseDepart) {
        this.deviseDepart = deviseDepart;
    }

    public Devise getDeviseArrivee() {
        return deviseArrivee;
    }

    public void setDeviseArrivee(Devise deviseArrivee) {
        this.deviseArrivee = deviseArrivee;
    }

    public DateTempo getDateConv() {
        return dateConv;
    }

    public void setDateConv(DateTempo dateConv) {
        this.dateConv = dateConv;
    }
	
	
    public Conversion(double montantDepart,
                    double montantArrivee, Devise deviseDepart, Devise deviseArrivee, DateTempo date) {
            this.montantDepart = montantDepart;
            this.montantArrivee = montantArrivee;
            this.deviseDepart = deviseDepart;
            this.deviseArrivee = deviseArrivee;
            this.dateConv = date;
    }
	
}
