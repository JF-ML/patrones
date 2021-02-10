package com.mayab.desarrollo.patrones.comportamiento.startegy;

public class ReporteMes extends Reporte {

	public ReporteMes() {
		setExportB(new ExportXML());
	}
	
	@Override
	void agregarArticulos(Articulo art) {
		// TODO Auto-generated method stub
		list.add(art);
	}

	

}
