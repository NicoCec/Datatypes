/**
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 */

package fr.miage.mesures;

/**
 * 
 * @author E12B336Z
 */
public class Conversion {

	private double myQuantiteDep;
	private double myQuantiteArr;
	private Unite myUniteDep;
	private Unite myUniteArr;

    public Conversion(double myQuantiteDep, double myQuantiteArr, Unite myUniteDep, Unite myUniteArr) {
        this.myQuantiteDep = myQuantiteDep;
        this.myQuantiteArr = myQuantiteArr;
        this.myUniteDep = myUniteDep;
        this.myUniteArr = myUniteArr;
    }

    public double getMyQuantiteDep() {
        return myQuantiteDep;
    }

    public void setMyQuantiteDep(double myQuantiteDep) {
        this.myQuantiteDep = myQuantiteDep;
    }

    public double getMyQuantiteArr() {
        return myQuantiteArr;
    }

    public void setMyQuantiteArr(double myQuantiteArr) {
        this.myQuantiteArr = myQuantiteArr;
    }

    public Unite getMyUniteDep() {
        return myUniteDep;
    }

    public void setMyUniteDep(Unite myUniteDep) {
        this.myUniteDep = myUniteDep;
    }

    public Unite getMyUniteArr() {
        return myUniteArr;
    }

    public void setMyUniteArr(Unite myUniteArr) {
        this.myUniteArr = myUniteArr;
    }
	
	
}
