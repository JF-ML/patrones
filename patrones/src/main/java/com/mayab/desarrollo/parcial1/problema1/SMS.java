package com.mayab.desarrollo.parcial1.problema1;

public class SMS implements Observer{
	Registro r;
	Gerente g;
	
	public SMS(Registro r,Gerente g) {
		this.r=r;
		r.registerObserver(this);
		this.g=g;
	}
	@Override
	public void update(int compra) {
		// TODO Auto-generated method stub
		String mensaje="Notificacion para SMS: Se ha detectado una compra excedendete de valor: "+compra;
		g.log.add(mensaje);
		System.out.println(mensaje);
	}

}
