package com.mayab.desarrollo.parcial1.problema3;

public class TanqueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistroTanques t1 = new LoteAltaPresion();
		RegistroTanques t2 = new LoteLiquido();
		RegistroTanques t3 = new LoteAcetileno();
	
		
		t1.registro(190);
		System.out.println("----------");
		t2.registro(500);
		System.out.println("----------");
		t3.registro(15);
		
	}

}
