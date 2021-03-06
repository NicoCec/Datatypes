/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas, Cecile - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

/**
 * #Generated by Git-Commit-Id-Plugin
 * #Fri Apr 12 15:50:05 CEST 2013
 * git.commit.id.abbrev=1acfa21
 * git.commit.user.email=nicolas.dufour@etu.univ-nantes.fr
 * git.commit.message.full=Merge branch 'master' of https\://github.com/NicoCec/Datatypes\n
 * git.commit.id=1acfa2181849a6bc1b0f6b63e4955312bbd93d4e
 * git.commit.message.short=Merge branch 'master' of https\://github.com/NicoCec/Datatypes
 * git.commit.user.name=NicoCec
 * git.build.user.name=NicoCec
 * git.commit.id.describe=1acfa21-dirty
 * git.build.user.email=nicolas.dufour@etu.univ-nantes.fr
 * git.branch=master
 * git.commit.time=12.04.2013 @ 15\:42\:43 CEST
 * git.build.time=12.04.2013 @ 15\:50\:05 CEST
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
