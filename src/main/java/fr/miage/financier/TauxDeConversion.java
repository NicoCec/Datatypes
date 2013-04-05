/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.financier;

/**
 * 
 * @author E12B336Z
 */
public class TauxDeConversion {
	
	private double taux;
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	
	public TauxDeConversion(double taux) {
		this.taux = taux;
	}
	
}
