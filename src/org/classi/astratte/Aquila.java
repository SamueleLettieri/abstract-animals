package org.classi.astratte;

public class Aquila extends Animale implements org.interfaccia.animals.IVolante{


	public void verso() {
		System.out.println("Il verso dell' aquila è: verso");
	}


	public void mangia() {
		System.out.println("L'aquila mangia: Pesci, uccelli e piccoli rettili");
	}
	
	
	public void vola() {
		System.out.println("Sto volando!!! aquila");
	}

}
