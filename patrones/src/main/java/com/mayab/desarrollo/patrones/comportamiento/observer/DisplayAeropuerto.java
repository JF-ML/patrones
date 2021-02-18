package com.mayab.desarrollo.patrones.comportamiento.observer;

public class DisplayAeropuerto implements Observers,DisplayElement{
	Vuelo vuelo;
	private String fromTo;
	private String hora;
	private String status;
	private String sala;
	private String dia;
	
	public DisplayAeropuerto(Vuelo v) {
		this.vuelo=v;
		v.registerObserver(this);
	}
	@Override
	public void update(String f, String h, String s, String d, String t) {
		// TODO Auto-generated method stub
		this.fromTo=f;
		this.hora=h;
		this.sala=s;
		this.dia = d;
		this.status = t;
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Actualizacion en la pantalla");
		System.out.println("FromTo: "+fromTo);
		System.out.println("Hora: "+hora+" Sala: "+sala);
		System.out.println("Status: "+status);
	}

}
