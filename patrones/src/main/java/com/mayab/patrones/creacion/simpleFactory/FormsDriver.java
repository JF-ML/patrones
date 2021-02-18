package com.mayab.patrones.creacion.simpleFactory;

public class FormsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFactory f = new SimpleFactory();
		
		f.crearTriangulo(5, 5, 5);
		f.t.printT();
		
		f.crearTriangulo(5, 5, 8);
		f.t.printT();
		
		f.crearTriangulo(5, 2, 8);
		f.t.printT();
	}

}
