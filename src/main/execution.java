/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package main;

import java.util.ArrayList;

import Adresses.Pays;
import Financier.Conversion;
import Financier.Devise;
import Financier.Taux_de_conversion;

public class execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Pays> listePays = new ArrayList<Pays>();
		Taux_de_conversion tx = new Taux_de_conversion(3.25);
		Devise devise_arr = new Devise("livre", listePays);
		
		Devise devise = new Devise("euro", listePays);
		
		devise.convertir(tx, devise_arr, 10000);
		
		
	}

}
