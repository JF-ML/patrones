package com.mayab.desarrollo.parcial1.problema2;

public class IVANormal extends ProductoDecorator{
		ProductoPrecio p;
		
		public IVANormal(ProductoPrecio p) {
			this.p=p;
		}
		@Override
		public String descripcion() {
			setPrecio(p.getPrecio()+(p.getPrecio()*0.16));
			return p.descripcion()+"+"+(p.getPrecio()*0.16);
		}
}
