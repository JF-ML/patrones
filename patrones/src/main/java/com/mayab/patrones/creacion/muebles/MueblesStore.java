package com.mayab.patrones.creacion.muebles;

public class MueblesStore {
	MueblesFactory factory;
	Mesa mesa;
	Silla silla;
	Sofa sofa;
	String tipo;
	void crearSala(String tipo) {
		if(tipo=="moderna") {
			factory= new MueblesModernosFactory();
		}
		else if(tipo=="ochentera") {
			factory = new MueblesOchenterosFactory();
		}
		else if(tipo=="victoriana") {
			factory = new MueblesVictorianosFactory();
		}
		else {
			System.out.println("No contamos con ese tipo de muebles");
		}
		
		mesa=factory.createMesa();
		silla=factory.createSilla();
		sofa=factory.createSofa();
		this.tipo=tipo;
	}
	
	void mostrarSala() {
		System.out.println("\nEsta es la sala "+tipo);
		System.out.println(mesa.ToString());
		System.out.println(silla.ToString());
		System.out.println(sofa.ToString());
	}
}
