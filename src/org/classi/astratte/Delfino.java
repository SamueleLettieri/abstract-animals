package org.classi.astratte;

public class Delfino extends Animale implements org.interfaccia.animals.INuotante{


	public void verso() {
		System.out.println("Il verso del delfino è: Verso");
	}


	public void mangia() {
		System.out.println("Il delfino mangia: acciughe, sardine, aringhe");
	}

	
	public void nuota() {
		System.out.println("Sto nuotando!!! delfino");
	}
}
