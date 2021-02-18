package com.mayab.desarrollo.patrones.dependency;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReporteVentas implements Reporte {

	
	List<Ventas> ventas = new ArrayList<Ventas>();
	public ReporteVentas(List<Ventas> ventas)  {
		
		this.ventas=ventas;
	}


	@Override
	public void leer() throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader br = new BufferedReader(new FileReader(fin));
		 
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	 
		br.close();*/
		
		System.out.println("Estoy leyendo");
	}

	@Override
	public void escribir(String a) throws IOException {
		/*FileWriter fw = new FileWriter(fin);
		 
		
		fw.write(a);
		
	 
		fw.close();*/
		
		for(Ventas venta: ventas) {
			System.out.println();
		}
		
	}

}
