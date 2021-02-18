package com.mayab.desarrollo.patrones.dependency;

import java.io.IOException;

public class ProxyReporte implements Reporte {
	ReporteVentas reporte;
	Empleado empleado;
	IServicioDatosVentas servicio;
	
	public ProxyReporte(Empleado e, IServicioDatosVentas servicio){
		this.empleado=e;
		this.servicio=servicio;
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
			
		}else {
			System.out.println("No tiene permiso de escribir");
		}
	}

}
