package com.mayab.desarrollo.parcial1.problema2;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setName("Tejas");
		p.setPrecio(1800);
		
		
		
		System.out.println(p.descripcion());
		
		p = new IVANormal(p);
		System.out.println();
		System.out.println(p.descripcion());
	}

}
