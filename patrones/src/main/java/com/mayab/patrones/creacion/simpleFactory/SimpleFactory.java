package com.mayab.patrones.creacion.simpleFactory;

public class SimpleFactory {
	Triangle t;
	
	
	public void crearTriangulo(float f1, float f2, float f3) {
		if(f1==f2&f2==f3) {
			 t = new Equi(f1,f2,f3);
		}
		else if(f1==f2||f1==f3||f2==f3) {
			t = new Iso(f1,f2,f3);
		}else {
			t = new Esc(f1,f2,f3);
		}
	}
}
