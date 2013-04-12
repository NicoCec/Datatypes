/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package fr.miage.adresses;
/**
 * 
 * @author E12B336Z
 */
public class Telephone {

	private String num;

    public Telephone(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    /**
     * 
     * @return the number of phone
     */
     @Override
    public String toString(){
        return num;
    }
	
}
