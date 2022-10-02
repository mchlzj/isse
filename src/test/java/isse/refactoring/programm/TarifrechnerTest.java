package isse.refactoring.programm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TarifrechnerTest {

	@Test
	public void sollteBusinessTarifBerechnen() {
		//GIVEN
		Tarifrechner tarifrechner = new Tarifrechner();
		Double leistungshoehe = 100.00;
		//WHEN
		Double businessTarif = tarifrechner.berechneBusinessTarif(leistungshoehe);
		//THEN
		Assertions.assertEquals(businessTarif, 119.00);
	}
	
	@Test
	public void solltePremiumTarifBerechnen() {
		//GIVEN
		Tarifrechner tarifrechner = new Tarifrechner();
		Double leistungshoehe = 100.00;
		//WHEN
		Double premiumTarif = tarifrechner.berechnePremiumTarif(leistungshoehe);
		//THEN
		Assertions.assertEquals(premiumTarif,107.10);
	}
	
	@Test
	public void sollteFirmenkundenTarifBerechnen() {
		//GIVEN
		Tarifrechner tarifrechner = new Tarifrechner();
		Double leistungshoehe = 100.00;
		//WHEN
		Double firmenkundenTarif = tarifrechner.berechneFirmenkundenTarif(leistungshoehe);
		//THEN
		Assertions.assertEquals(firmenkundenTarif, 95.20);
	}
}
