package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorZip extends ArchivoDecorator{
	Archivo a;
	public DecoratorZip(Archivo a) {
		this.a=a;
	}
	public String zip() {
		return", datos comprimidos ";
	}
	@Override
	public String leer() {
		// TODO Auto-generated method stub
		
		return a.leer()+zip();
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		
		return a.escribir()+zip();
	}

	
}
