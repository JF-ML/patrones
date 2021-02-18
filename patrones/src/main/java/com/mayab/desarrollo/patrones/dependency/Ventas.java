package com.mayab.desarrollo.patrones.dependency;

public class Ventas {
	String producto;
	String precio;
	Empleado e;
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Empleado getE() {
		return e;
	}
	public void setE(Empleado e) {
		this.e = e;
	}
	
	
	public Ventas(String n, String p, Empleado e) {
		this.producto = n;
		this.precio= p;
		this.e=e;
	}
	
}
