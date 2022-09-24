package isse.refactoring.programm.tarife;

public class TarifrechnerFirmenkunden extends Tarifrechner{

	@Override
	public Double berechneTarif(Double leistung) {
		Double leistungMitRabatt = leistung/100*80;
		return leistungMitRabatt+ (leistungMitRabatt*MWST);
	}

}
