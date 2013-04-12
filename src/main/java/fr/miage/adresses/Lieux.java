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
public class Lieux {
	
	private TypeLieux type;
        private String name;
        private int numero;
        
    public Lieux(TypeLieux type, String name, int num) {
        this.type = type;
        this.name = name;
        this.numero = num;
    }
        
    public TypeLieux getType() {
        return type;
    }

    public void setType(TypeLieux type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return numero+" "+type+" "+name;
    }
}
