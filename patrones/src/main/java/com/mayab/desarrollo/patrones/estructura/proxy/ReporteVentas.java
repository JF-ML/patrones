package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReporteVentas implements Reporte {

	File fin;
	File dir;
	public ReporteVentas()  {
		dir = new File(".");
		try {
			fin = new File(dir.getCanonicalPath() + File.separator + "in.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void leer() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(fin));
		 
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	 
		br.close();
	}

	@Override
	public void escribir(String a) throws IOException {
		FileWriter fw = new FileWriter(fin);
		 
		
		fw.write(a);
		
	 
		fw.close();
		
	}

}
