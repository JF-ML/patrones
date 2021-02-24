package com.mayab.desarrollo.parcial1.problema2;

public class ProductoTeja extends Producto{
	
	
	public ProductoTeja() {
		setName("Tejas");
		setPrecio(1800);
		setPrecioOriginal(1800);
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
