package com.mayab.desarrollo.parcial1.problema2;

public abstract class Producto {
	public abstract String descripcion();
	public abstract double costo();
	
	String name;
	double precioOriginal;
	double precioActual;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrecio() {
		return precioActual;
	}
	public double getPrecioOriginal() {
		return precioOriginal;
	}
	public void setPrecio(double precio) {
		
		this.precioActual = precio;
	}
	public void setPrecioOriginal(double precio) {
		this.precioOriginal = precio;
		
	}
	
}
