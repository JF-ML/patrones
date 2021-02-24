package com.mayab.desarrollo.parcial1.problema2;

public class IVANormal extends ProductoDecorator{
		Producto p;
		
		public IVANormal(Producto p) {
			this.p=p;
		}
		
		public String aplicarIVANormal() {
			setPrecio(p.getPrecio()-(p.getPrecio()*0.16));
			return p.descripcion()+"-"+(p.getPrecio()*0.16);
		}
}
