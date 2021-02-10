package com.mayab.desarrollo.patrones.comportamiento.startegy;

public class ReporteDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo a1 = new Articulo("Refresco",5,3);
		Articulo a2 = new Articulo("Papas",10,7);
		Articulo a3 = new Articulo("Servilletas",12,4);
		
		ReporteVentas reporte = new ReporteVentas();
		ReporteMes reporte2= new ReporteMes();
		
		
		reporte.agregarArticulos(a1);
		reporte.agregarArticulos(a2);
		reporte.agregarArticulos(a3);
		
		reporte2.agregarArticulos(a2);
		
		
		reporte.performExport();
		reporte.setExportB(new ExportPDF());
		reporte.performExport();
		
		reporte2.performExport();
	}

}
