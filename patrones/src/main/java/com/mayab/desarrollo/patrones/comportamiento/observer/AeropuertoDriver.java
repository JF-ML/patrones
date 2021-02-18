package com.mayab.desarrollo.patrones.comportamiento.observer;

public class AeropuertoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vuelo v = new Vuelo();
		Pasajero p = new Pasajero(v);
		CrewVuelo c = new CrewVuelo(v);
		DisplayAeropuerto da = new DisplayAeropuerto(v);
		
		v.cambiosVuelo("MEX-MID","18:00","2A","10/02/21","A Tiempo");
		System.out.println("---------------------");
		v.cambiosVuelo("MEX-MID","19:30","5A","10/02/21","Retrasado");
		System.out.println("---------------------");
		v.cambiosVuelo("MEX-MTY","6:00","1B","12/02/21","Cancelado");
	}

}
