package isse.refactoring.programm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgrammTest {

	
	@Test
	public void sollteBeiAuswahl1NormalenTarifBerechnen() {
		Programm programm = new Programm();
		Assertions.assertEquals(programm.berechneTarif(1,100.00), 119.00);
	}
	
	@Test
	public void sollteBeiAuswahl2PresmiumTarifBerechnen() {
		Programm programm = new Programm();
		Assertions.assertEquals(programm.berechneTarif(2, 100.00), 107.10);
	}
	
	@Test void sollteBeiAuswahl3FirmenkundenTarifBerechnen() {
		Programm programm = new Programm();
		Assertions.assertEquals(programm.berechneTarif(3, 100.00), 95.20);
	}
}
