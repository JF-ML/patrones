package com.mayab.desarrollo.parcial1.problema2;

public class ImpuestoLocal extends ProductoDecorator{
	ProductoPrecio p;
	
	public ImpuestoLocal(ProductoPrecio p) {
		this.p=p;
	}
	
	@Override
	public String descripcion() {
		setPrecio(p.getPrecio()+(p.getPrecio()*0.02));
		return p.descripcion()+"+"+(p.getPrecio()*0.02);
	}
}
