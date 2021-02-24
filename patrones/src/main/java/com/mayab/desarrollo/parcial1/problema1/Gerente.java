package com.mayab.desarrollo.parcial1.problema1;

import java.util.ArrayList;

public class Gerente implements Observer{

	String name;
	Registro r;
	ArrayList log = new ArrayList();;
	
	public Gerente(Registro r,String n) {
		this.r=r;
		r.registerObserver(this);
		this.name=n;
	}
	@Override
	public void update(int compra) {
		// TODO Auto-generated method stub
		String mensaje="Notificacion para "+name+": Se ha detectado una compra excedendete de valor: "+compra;
		System.out.println(mensaje);
		log.add(mensaje);
	}
	
	public void printLog() {
		System.out.println("Gerente "+name);
		for(int i =0; i< log.size(); i++) {
			System.out.println(i+" "+log.get(i));
			
		}
	}
	public String getName() {
		return this.name;
	}
}
