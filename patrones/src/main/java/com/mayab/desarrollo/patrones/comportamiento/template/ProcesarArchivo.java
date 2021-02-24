package com.mayab.desarrollo.patrones.comportamiento.template;

public abstract class ProcesarArchivo {
	public final void procesar() {
		validar();
		abrir();
		leer();
		escribirBD();
	}
	
	public abstract void validar();
	
	public void abrir() {
		System.out.println("Abriendo el archivo...");
	}
	
	public abstract void leer();
	
	
	public void escribirBD() {
		System.out.println("Escribiendo datos del cliente");
	}
}
