package isse.refactoring.programm.tarife;

public class Tarifrechner {

	protected double MWST = 0.19;
	
	public Double berechneTarif(Double leistung) {
		return leistung+ (leistung*MWST);
	}
}
