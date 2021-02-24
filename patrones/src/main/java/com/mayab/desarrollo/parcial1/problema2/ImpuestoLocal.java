package com.mayab.desarrollo.parcial1.problema2;

public class ImpuestoLocal extends ProductoDecorator{
	Producto p;
	
	public ImpuestoLocal(Producto p) {
		this.p=p;
	}
	
	public String aplicarImpuesto() {
		setPrecio(p.getPrecio()-(p.getPrecio()*0.02));
		return p.descripcion()+"-"+(p.getPrecio()*0.02);
	}
}
