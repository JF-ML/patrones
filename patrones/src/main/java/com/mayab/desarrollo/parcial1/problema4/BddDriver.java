package com.mayab.desarrollo.parcial1.problema4;

public class BddDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasesDeDatos bdd1 = new BddUno();
		BasesDeDatos bdd2 = new BddDos();
		BasesDeDatos bdd3 = new BddTres();
		
		bdd1.guardar();
		System.out.println("----------");
		bdd2.guardar();
		System.out.println("----------");
		bdd3.guardar();
		System.out.println("----------");
		bdd3.setCrear(new SentenciaUno());
		bdd3.guardar();
	}

}
