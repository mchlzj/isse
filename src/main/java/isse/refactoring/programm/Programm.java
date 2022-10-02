package isse.refactoring.programm;

import java.util.Scanner;

public class Programm {
	
	public Double berechneTarif(Integer tarifArt, Double leistung) {
		
		Tarifrechner tarifRechner = new Tarifrechner();
		
		switch(tarifArt) {
			case 2:
				return tarifRechner.berechnePremiumTarif(leistung);
			case 3:
				return tarifRechner.berechneFirmenkundenTarif(leistung);
			default: 
				return tarifRechner.berechneBusinessTarif(leistung);
		}
	}
}
