package com.mayab.desarrollo.parcial1.problema2;

public class ProductoBloque extends Producto{

	
	public ProductoBloque() {
		setName("Bloque");
		setPrecio(1000);
		setPrecioOriginal(1000);
	}
	@Override
	public String descripcion() {
		return this.name+" Precio:"+this.precioOriginal;
	}
	
	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return precioActual;
	}
}
