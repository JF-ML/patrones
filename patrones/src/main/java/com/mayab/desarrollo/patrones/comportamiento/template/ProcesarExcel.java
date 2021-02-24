package com.mayab.desarrollo.patrones.comportamiento.template;

public class ProcesarExcel extends ProcesarArchivo{

	@Override
	public void validar() {
		// TODO Auto-generated method stub
		System.out.println("Excel detectado..");
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Leyendo filas de datos...");
	}

}
