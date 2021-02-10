package com.mayab.desarrollo.patrones.comportamiento.startegy;

public class Articulo {
	String name;
	int precio;
	int cantidad;
	
	public Articulo(String n,int p,int c) {
		this.name=n;
		this.precio=p;
		this.cantidad=c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
