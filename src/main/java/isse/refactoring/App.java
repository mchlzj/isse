package isse.refactoring;

import java.util.Scanner;

import isse.refactoring.programm.Programm;
import isse.refactoring.programm.tarife.Tarifrechner;

public class App {

	
	public static void main(String[] args) {
		Programm programm = new Programm();
		Scanner scanner = new Scanner(System.in);
		
		int tarifArt = 0;
		while(tarifArt == 0|| tarifArt > 3 ) {
			System.out.println("Wählen Sie den Tarif:");
			System.out.println("1 = Business Tarif");
			System.out.println("2 = Premium Tarif");
			System.out.println("3 = Firmenkunden Tarif");
			tarifArt = scanner.nextInt();
		}
		System.out.println("Geben Sie den Wert der Leistung ein:");
		Double leistung = scanner.nextDouble();
		
		Double preis = programm.berechneTarif(tarifArt, leistung);
		System.out.println("Der Endpreis inklusive Mwst. beträgt: " + preis);
	}
	
}
