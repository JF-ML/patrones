package com.mayab.desarrollo.parcial1.problema2;

public class IVAFrontera extends ProductoDecorator{
	ProductoPrecio p;
	
	public IVAFrontera(ProductoPrecio p) {
		this.p=p;
	}
	
	@Override
	public String descripcion() {
		setPrecio(p.getPrecio()+(p.getPrecio()*0.08));
		return p.descripcion()+"+"+(p.getPrecio()*0.08);
	}
}
