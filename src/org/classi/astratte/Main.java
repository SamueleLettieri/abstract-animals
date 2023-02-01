package org.classi.astratte;

import org.interfaccia.animals.INuotante;
import org.interfaccia.animals.IVolante;

public class Main {
	
	public static void main(String[] args) {
		Cane c = new Cane();
		
		System.out.print("Cane: ");
		c.dormi();
		c.verso();
		c.mangia();
		
		faiNuotare(c);
		
		System.out.println();
		
		
		Passerotto p = new Passerotto();
		
		System.out.print("Passerotto: ");
		p.dormi();
		p.verso();
		p.mangia();
		
		faiVolare(p);
		
		System.out.println();

		
		Aquila a = new Aquila();
		
		System.out.print("Aquila: ");
		a.dormi();
		a.verso();
		a.mangia();
		
		faiVolare(a);
		
		System.out.println();
		
		
		Delfino d = new Delfino();
		
		System.out.print("Delfino: ");
		d.dormi();
		d.verso();
		d.mangia();
		
		faiNuotare(d);
	}
	
	public static void faiNuotare(INuotante  animaleNuota) {
		animaleNuota.nuota();
	}
	
	public static void faiVolare(IVolante  animaleVola) {
		animaleVola.vola();
	}
	
}
