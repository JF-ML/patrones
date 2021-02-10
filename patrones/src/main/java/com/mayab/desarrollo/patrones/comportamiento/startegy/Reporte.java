package com.mayab.desarrollo.patrones.comportamiento.startegy;

import java.util.ArrayList;


public abstract class Reporte {
	ExportB exportb;
	ArrayList<Articulo> list=new ArrayList<Articulo>();
	
	public void setExportB(ExportB exportb) {
		this.exportb=exportb;
	}
	public void performExport() {
		for(int i=0;i<list.size();i++) {
			System.out.println("Nombre: "+list.get(i).getName());
			System.out.println(" Precio: "+list.get(i).getPrecio());
			System.out.println(" Cantidad: "+list.get(i).getCantidad());
			System.out.println("---------------");
		}
		exportb.exportar();
	}
	abstract void agregarArticulos(Articulo art);
}
