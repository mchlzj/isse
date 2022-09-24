package isse.refactoring.programm.tarife;

public class TarifrechnerPremium extends Tarifrechner{

	@Override
	public Double berechneTarif(Double leistung) {
		Double leistungMitRabatt = leistung/100*90;
		return leistungMitRabatt + (leistungMitRabatt*MWST);
	}

}
