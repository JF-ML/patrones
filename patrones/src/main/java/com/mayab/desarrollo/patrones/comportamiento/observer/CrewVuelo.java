package com.mayab.desarrollo.patrones.comportamiento.observer;

public class CrewVuelo implements Observers {
	Vuelo vuelo;
	public CrewVuelo(Vuelo v) {
		this.vuelo=v;
		v.registerObserver(this);
	}
	
	@Override
	public void update(String f, String h, String s, String d, String t) {
		// TODO Auto-generated method stub
		System.out.println("Crew:");
		System.out.println("Estimada tripulacion se detecto un cambio en el itirenario...");
		System.out.println("FromTo: "+f);
		System.out.println("Hora: "+h+"Sala: "+s);
		System.out.println("Status: "+t);
		
	}

	

}
