package com.mayab.desarrollo.patrones.estructura.decorator;

public class ArchivoTexto extends Archivo {

	@Override
	public String leer() {
		// TODO Auto-generated method stub
		return "Estoy leyendo";
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return"Estoy Escribiendo";
	}

}
