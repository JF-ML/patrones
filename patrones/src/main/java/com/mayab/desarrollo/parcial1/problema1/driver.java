package com.mayab.desarrollo.parcial1.problema1;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registro r = new Registro();
		Gerente g1 = new Gerente(r,"John");
		Gerente g2 = new Gerente(r,"Peter");
		
		
		r.registrarCompra(500);
		r.registrarCompra(550);
		
		System.out.println("---------");
		
		r.pausarMensajes(g2);
		r.registrarCompra(550);
		
		System.out.println("---------");
		
		g1.printLog();
	}

}
