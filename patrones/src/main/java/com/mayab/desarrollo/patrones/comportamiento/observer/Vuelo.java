package com.mayab.desarrollo.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Vuelo implements Subject{
	ArrayList observer;
	private String fromTo;
	private String hora;
	private String status;
	private String sala;
	private String dia;
	
	public Vuelo() {
		
		observer = new ArrayList();
		
	}
	
	

	
	
	@Override
	public void registerObserver(Observers o) {
		// TODO Auto-generated method stub
		observer.add(o);
	}

	@Override
	public void removeObserver(Observers o) {
		// TODO Auto-generated method stub
		int i = observer.indexOf(o);
		if(i >=0) {
			observer.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i =0; i< observer.size(); i++) {
			Observers observers = (Observers)observer.get(i);
			observers.update(fromTo, hora, sala, dia, status);
		}
	}
	
	public void notificacion() {
		notifyObservers();
	}
	
	public void cambiosVuelo(String f, String h,String s, String d,String t) {
		this.fromTo=f;
		this.hora=h;
		this.sala=s;
		this.dia = d;
		this.status = t;
		notificacion();
	}
	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
}
