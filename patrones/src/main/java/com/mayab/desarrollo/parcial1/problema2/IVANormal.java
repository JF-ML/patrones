package com.mayab.desarrollo.parcial1.problema2;

public class IVANormal extends ProductoDecorator{
		Producto p;
		
		public IVANormal(Producto p) {
			this.p=p;
			setName(p.getName());
			setPrecio(p.getPrecio());
			setPrecioOriginal(p.getPrecioOriginal());
		}
		@Override
		public String descripcion() {
			
			return p.descripcion()+"+"+(p.getPrecioOriginal()*0.16);
		}
		
		@Override
		public double costo() {
			// TODO Auto-generated method stub
			double precio =p.getPrecio()+(p.getPrecioOriginal()*0.16);
			p.setPrecio(precio);
			return precio;
		}
}
