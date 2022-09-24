package isse.refactoring.programm;

public class Tarifrechner {

	double MWST = 0.19;
	
	public Double berechneBusinessTarif(Double leistung) {
		return leistung+ (leistung*MWST);
	}
	public Double berechnePremiumTarif(Double leistung)  {
		Double leistungMitRabatt = leistung/100*90;
		return leistungMitRabatt + (leistungMitRabatt*MWST);
	}

	public Double berechneFirmenkundenTarif(Double leistung) {
		Double leistungMitRabatt = leistung/100*80;
		return leistungMitRabatt+ (leistungMitRabatt*MWST);
	}
}
