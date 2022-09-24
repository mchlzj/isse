package isse.refactoring.programm;

import java.util.Scanner;

import isse.refactoring.programm.tarife.Tarifrechner;
import isse.refactoring.programm.tarife.TarifrechnerFirmenkunden;
import isse.refactoring.programm.tarife.TarifrechnerPremium;

public class Programm {
	
	public Double berechneTarif(int tarifArt, Double leistung) {
		
		Tarifrechner tarifrechner;
		
		switch(tarifArt) {
			case 2:
				tarifrechner = new TarifrechnerPremium();
				break;
			case 3:
				tarifrechner = new TarifrechnerFirmenkunden();
				break;
			default: 
				tarifrechner = new Tarifrechner();
				break;
		}
		return tarifrechner.berechneTarif(leistung);
	}
}
