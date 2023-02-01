package org.classi.astratte;


public class Main {

	public static void main(String[] args) {
		Cane c = new Cane();
		
		System.out.print("Cane: ");
		c.dormi();
		c.verso();
		c.mangia();
		
		
		Passerotto p = new Passerotto();
		
		System.out.print("Passerotto: ");
		p.dormi();
		p.verso();
		p.mangia();

		
		Aquila a = new Aquila();
		
		System.out.print("Aquila: ");
		a.dormi();
		a.verso();
		a.mangia();
		
		
		Delfino d = new Delfino();
		
		System.out.print("Delfino: ");
		d.dormi();
		d.verso();
		d.mangia();
	}
	
	
}
