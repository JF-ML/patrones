package com.mayab.desarrollo.parcial1.problema2;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Con la cantidad de variaciones posibles 
		  creo que la forma mas sencillas es crear este decorator que permite ir
		  agregando las modificaciones al precio segun sean necesarias
		
		 */
		
		ProductoPrecio p = new ProductoPrecio();
		p.setName("Tejas");
		p.setPrecio(1800);
		
		
		
		System.out.println(p.descripcion());
		
		p = new IVANormal(p);
	
		System.out.println(p.descripcion());
		System.out.println(p.getPrecio());
		
		p = new ImpuestoLocal(p);
		System.out.println(p.descripcion());
		System.out.println(p.getPrecio());
	}

}
