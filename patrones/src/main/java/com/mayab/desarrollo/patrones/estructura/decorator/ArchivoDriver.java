package com.mayab.desarrollo.patrones.estructura.decorator;

public class ArchivoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo texto = new ArchivoTexto();
		
		System.out.println(texto.escribir());
		System.out.println(texto.leer());
		
		
		System.out.println("-------");
		texto= new DecoratorZip(texto);
		
		System.out.println(texto.escribir());
		System.out.println(texto.leer());
		
		
		System.out.println("-------");
		texto = new DecoratorEncriptar(texto);
		System.out.println(texto.escribir());
		System.out.println(texto.leer());
		
		
	}

}
