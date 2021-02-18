package com.mayab.desarrollo.patrones.comportamiento.observer;



public class Pasajero implements Observers {

	Vuelo vuelo;
	
	public Pasajero(Vuelo v) {
		this.vuelo=v;
		v.registerObserver(this);
	}
	
	
	@Override
	public void update(String f, String h, String s, String d,String t) {
		// TODO Auto-generated method stub
		System.out.println("Pasajero:");
		System.out.println("Me llego un correo del estatus de mi vuelo");
		System.out.println("FromTo: "+f);
		System.out.println("Hora: "+h);
		System.out.println("Status: "+t);
		if(t=="Retrasado") {
			System.out.println("Pasajero:Tendre que esperar mucho");
		}
		if(t=="Cancelado") {
			System.out.println("Pasajero:Pues mejor me voy a mi casa");
		}
		
	}

	

	

}
