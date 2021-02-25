package com.mayab.desarrollo.patrones.creacion.simpleFactory;

public class Iso extends Triangle{

	public Iso(float f1,float f2,float f3) {
		this.side1=f1;
		this.side2=f2;
		this.side3=f3;
		this.type="Isoceles";
	}
}
