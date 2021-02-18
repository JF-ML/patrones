package com.mayab.patrones.creacion.simpleFactory;

public abstract class Triangle {
	String type;
	float side1,side2,side3;
	
	public void printT() {
		System.out.println("Triangulo: "+type);
		System.out.println("Lado 1: "+side1);
		System.out.println("Lado 2: "+side2);
		System.out.println("Lado 3: "+side3);
	}
}
