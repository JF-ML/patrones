package com.mayab.desarrollo.patrones.comportamiento.template;

public class ArchivoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesarArchivo json = new ProcesarJson();
		ProcesarArchivo excel = new ProcesarExcel();
		
		json.procesar();
		
		excel.procesar();
		
	}

}
