package com.mayab.desarrollo.parcial1.problema4;

public abstract class BasesDeDatos {
	public final void guardar() {
		abrirConexion();
		crearSentencia();
		ejecutarSentencia();
	}
	
	public void abrirConexion() {
		System.out.println("Abriendo conexion con la base de datos");
	}
	
	public abstract void crearSentencia();
	
	public void ejecutarSentencia() {
		System.out.println("Sentencia ejecutada");
	}
}
