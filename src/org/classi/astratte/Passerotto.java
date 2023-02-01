package org.classi.astratte;

public class Passerotto extends Animale implements org.interfaccia.animals.IVolante{

	
	public void verso() {
		System.out.println("Il verso del passerotto è: Cip cip");
	}

	
	public void mangia() {
		System.out.println("Il passerotto mangia: Semi");
	}

	
	public void vola() {
		System.out.println("Sto volando!!! passerotto");
	}
	
	
}
