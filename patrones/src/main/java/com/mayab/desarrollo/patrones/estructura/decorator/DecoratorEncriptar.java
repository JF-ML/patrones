package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorEncriptar extends ArchivoDecorator{
	Archivo a;
	public DecoratorEncriptar(Archivo a) {
		this.a=a;
	}
	public String encriptar() {
		return", datos encriptados" ;
	}
	@Override
	public String leer() {
		// TODO Auto-generated method stub
		
		return a.leer()+encriptar();
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		
		return a.escribir()+ encriptar();
	}

}
