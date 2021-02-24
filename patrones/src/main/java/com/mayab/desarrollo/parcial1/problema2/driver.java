package com.mayab.desarrollo.parcial1.problema2;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Con la cantidad de variaciones posibles 
		  creo que la forma mas sencillas es crear este decorator que permite ir
		  agregando las modificaciones al precio segun sean necesarias
		
		
		  Las funcionalidades de cada tipo de impuesto y descuento no son algo
		  obligatorio y al ser tantas creo resulta mas sencillo hacerlo asi	
		 */
		
		Producto p = new ProductoTeja();
		
		
		Producto p2 = new ProductoBloque();
		
		
		
		System.out.println(p.descripcion());
		System.out.println(p2.descripcion());
		
		
		p = new IVAFrontera(p);
		p2 = new IVANormal(p2);
		
		System.out.println("-------------");
		
		p.setPrecio(p.costo());
		p2.setPrecio(p2.costo());
		
		System.out.println(p.descripcion());
		System.out.println(p.getPrecio());
		
		
		
		System.out.println(p2.descripcion());
		System.out.println(p2.getPrecio());
		
		
		p = new ImpuestoLocal(p);
		p2 = new DescuentoTemporada(p2);
	
		System.out.println("-------------");
		
		System.out.println(p.descripcion());
		System.out.println(p.costo());
		
		System.out.println(p2.descripcion());
		System.out.println(p2.costo());
		
	}

}
