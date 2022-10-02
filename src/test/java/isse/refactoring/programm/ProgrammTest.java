package isse.refactoring.programm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgrammTest {
	@Test
	public void sollteBeiAuswahl1BusinessTarifBerechnen() {
		//GIVEN
		Programm programm = new Programm();		
		Double leistungshoehe = 100.00;
		Integer businessTarif = 1;
		//WHEN
		Double preisBusinessTarif = programm.berechneTarif(businessTarif, leistungshoehe);
		//THEN
		Assertions.assertEquals(preisBusinessTarif, 119.00);
	}
	
	@Test
	public void sollteBeiAuswahl2PresmiumTarifBerechnen() {
		//GIVEN
		Programm programm = new Programm();
		Double leistungshoehe = 100.00;
		Integer premiumTarif = 2;
		//WHEN
		Double preisPremiumTarif = programm.berechneTarif(premiumTarif, leistungshoehe);
		//THEN
		Assertions.assertEquals(preisPremiumTarif, 107.10);
	}
	
	@Test 
	public void sollteBeiAuswahl3FirmenkundenTarifBerechnen() {
		//GIVEN
		Programm programm = new Programm();
		Double leistungshoehe = 100.00;
		Integer firmenkundenTarif = 3;
		//WHEN
		Double preisFirmenkundenTarif = programm.berechneTarif(firmenkundenTarif, leistungshoehe);
		//THEN
		Assertions.assertEquals(preisFirmenkundenTarif, 95.20);		
	}
}
