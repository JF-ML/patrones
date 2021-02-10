package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.IOException;

public class ProxyReporte implements Reporte {
	ReporteVentas reporte = new ReporteVentas();
	Empleado empleado;
	
	public ProxyReporte(Empleado e){
		this.empleado=e;
	}
	
	@Override
	public void leer() throws IOException {
		// TODO Auto-generated method stub
		reporte.leer();
	}

	@Override
	public void escribir(String a) throws IOException {
		// TODO Auto-generated method stub
		if(empleado.getTipo()=="a") {
			reporte.escribir(a);
		}else {
			System.out.println("No tiene permiso de escribir");
		}
	}

}
