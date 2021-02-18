package com.mayab.desarrollo.patrones.dependency;

import java.io.IOException;

public class ClienteDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("a");
		Empleado e2 = new Empleado("e");
		
		/*ProxyReporte p1 = new ProxyReporte(e1);
		ProxyReporte p2 = new ProxyReporte(e2);
		
		p1.escribir("Hola estoy escribiendo");
		p1.leer();
		
		p2.escribir("Hola estoy escribiendo");
		p2.leer();
		*/
		
	}

}
