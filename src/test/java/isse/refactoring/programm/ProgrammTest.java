package isse.refactoring.programm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgrammTest {

	@Test
	public void sollteBeiAuswahl1BusinessTarifBerechnen() {
		Programm programm = new Programm();
		
		//GIVEN
		Double leistungshoehe = 100.00;
		
		//WHEN
		Integer businessTarif = 1;
		
		//THEN
		Assertions.assertEquals(programm.berechneTarif(businessTarif,leistungshoehe), 119.00);
	}
	
	@Test
	public void sollteBeiAuswahl2PresmiumTarifBerechnen() {
		Programm programm = new Programm();
		
		//GIVEN
		Double leistungshoehe = 100.00;
		
		//WHEN
		Integer premiumTarif = 2;
		
		//THEN
		Assertions.assertEquals(programm.berechneTarif(premiumTarif, leistungshoehe), 107.10);
	}
	
	@Test void sollteBeiAuswahl3FirmenkundenTarifBerechnen() {
		Programm programm = new Programm();
		
		//GIVEN
		Double leistungshoehe = 100.00;
		
		//WHEN
		Integer firmenkundenTarif = 3;
		
		//THEN
		Assertions.assertEquals(programm.berechneTarif(firmenkundenTarif, leistungshoehe), 95.20);
	}
}
