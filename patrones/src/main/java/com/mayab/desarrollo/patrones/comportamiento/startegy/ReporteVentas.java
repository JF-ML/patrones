package com.mayab.desarrollo.patrones.comportamiento.startegy;

public class ReporteVentas extends Reporte {
	public ReporteVentas() {
		setExportB(new ExportJson());
	}

	@Override
	void agregarArticulos(Articulo art) {
		// TODO Auto-generated method stub
		list.add(art);
	}
}
