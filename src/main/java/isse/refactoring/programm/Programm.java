package isse.refactoring.programm;

import java.util.Scanner;

import isse.refactoring.programm.tarife.TarifrechnerPremium;
import isse.refactoring.programm.tarife.Tarifrechner;
import isse.refactoring.programm.tarife.TarifrechnerFirmenkunden;

public class Programm {
	
	public Double berechneTarif(int tarifArt, Double leistung) {
		
		Tarifrechner tarifRechner;
		
		switch(tarifArt) {
			case 2:
				tarifRechner = new TarifrechnerPremium();
				break;
			case 3:
				tarifRechner = new TarifrechnerFirmenkunden();
				break;
			default: 
				tarifRechner = new Tarifrechner();
		}
		return tarifRechner.berechneTarif(leistung);
	}
}
