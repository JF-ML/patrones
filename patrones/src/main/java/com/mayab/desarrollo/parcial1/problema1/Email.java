package com.mayab.desarrollo.parcial1.problema1;

public class Email implements Observer{

	Registro r;
	Gerente g;
	String email;
	public Email(Registro r,Gerente g) {
		this.r=r;
		this.g=g;
		r.registerObserver(this);
		email=g.name+"@mail.com";
	}
	@Override
	public void update(int compra) {
		// TODO Auto-generated method stub
		String mensaje="Notificacion para Email: "+email+": Se ha detectado una compra excedendete de valor: "+compra;
		g.log.add(mensaje);
		System.out.println(mensaje);
	}

}
