package isse.refactoring.programm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TarifrechnerTest {

	@Test
	public void sollteBusinessTarifBerechnen() {
		Tarifrechner tarifrechner = new Tarifrechner();
		Assertions.assertEquals(tarifrechner.berechneBusinessTarif(100.00), 119.00);
	}
	
	@Test
	public void solltePremiumTarifBerechnen() {
		Tarifrechner tarifrechner = new Tarifrechner();
		Assertions.assertEquals(tarifrechner.berechnePremiumTarif(100.00),107.10);
	}
	
	@Test
	public void sollteFirmenkundenTarifBerechnen() {
		Tarifrechner tarifrechner = new Tarifrechner();
		Assertions.assertEquals(tarifrechner.berechneFirmenkundenTarif(100.00), 95.20);
	}
}
