package com.mayab.desarrollo.parcial1.problema4;

public abstract class BasesDeDatos {
	CrearSentencia c;
	
	public void setCrear(CrearSentencia c) {
		this.c=c;
	}
	
	public final void guardar() {
		abrirConexion();
		c.crear();
		ejecutarSentencia();
	}
	
	public void abrirConexion() {
		System.out.println("Abriendo conexion con la base de datos");
	}

	
	public void ejecutarSentencia() {
		System.out.println("Sentencia ejecutada");
	}
}
