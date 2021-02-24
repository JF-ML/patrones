package com.mayab.desarrollo.parcial1.problema2;

public class Producto {
	String name;
	double precioOriginal;
	double precioActual;
	
	
	
	
	public String descripcion() {
		return this.name+" Precio:"+this.precioOriginal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrecio() {
		return precioActual;
	}
	public void setPrecio(double precio) {
		this.precioOriginal = precio;
		this.precioActual = precio;
	}
	
	
}
