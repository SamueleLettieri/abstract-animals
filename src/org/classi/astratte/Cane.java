package org.classi.astratte;

public class Cane extends Animale implements org.interfaccia.animals.INuotante{


	public void verso() {
		System.out.println("Il verso del cane è: Bauu");
	}


	public void mangia() {
		System.out.println("Il cane mangia: carne, Erba, Crocchette, ...");
	}
	
	
	public void nuota() {
		System.out.println("Sto nuotando!!! cane");
	}

}
