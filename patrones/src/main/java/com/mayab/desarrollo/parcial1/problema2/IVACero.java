package com.mayab.desarrollo.parcial1.problema2;

public class IVACero extends ProductoDecorator{

	Producto p;
	
	public IVACero(Producto p) {
		this.p=p;
	}
	
	@Override
	public String descripcion() {
		
		return p.descripcion()+"+ 0.0";
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return p.getPrecio();
	}
	
	
	
}
