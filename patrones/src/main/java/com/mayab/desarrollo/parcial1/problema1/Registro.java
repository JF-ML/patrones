package com.mayab.desarrollo.parcial1.problema1;

import java.util.ArrayList;

import com.mayab.desarrollo.patrones.comportamiento.observer.Observers;

public class Registro implements Subject{
	ArrayList observers;
	ArrayList compras;
	int gasto;
	
	public Registro() {
		observers = new ArrayList();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >=0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i =0; i< observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(gasto);
		}
	}
	
	public void notificacion() {
		notifyObservers();
	}
	
	public void pausarMensajes(Observer o) {
		System.out.println("Se han pausado los mensajes");
		removeObserver(o);
	}
	
	public void registrarCompra(int g) {
		this.gasto=g;
		System.out.println("Se realizo una compra de: $"+g);
		if(gasto>500) {
			notificacion();
		}
	}
}
