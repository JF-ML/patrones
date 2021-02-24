package com.mayab.desarrollo.parcial1.problema2;

public class IVAFrontera extends ProductoDecorator{
	Producto p;
	
	public IVAFrontera(Producto p) {
		this.p=p;
	}
	
	public String aplicarIVAFrontera() {
		setPrecio(p.getPrecio()-(p.getPrecio()*0.08));
		return p.descripcion()+"-"+(p.getPrecio()*0.08);
	}
}
