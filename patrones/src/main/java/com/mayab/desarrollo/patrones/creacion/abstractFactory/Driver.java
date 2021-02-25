package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MueblesStore store = new MueblesStore();
		
		store.crearSala("moderna");
		store.mostrarSala();
		store.crearSala("victoriana");
		store.mostrarSala();
		store.crearSala("ochentera");
		store.mostrarSala();
	}
	
}
