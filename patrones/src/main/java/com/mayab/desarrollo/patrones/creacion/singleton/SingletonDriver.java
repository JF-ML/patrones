package com.mayab.desarrollo.patrones.creacion.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordinador coord1 = new Coordinador("nombre1","escuela1");
		Coordinador coord2 = new Coordinador("nombre2","escuela2");
		Coordinador coord3 = new Coordinador("nombre3","escuela3");
		
		coord1.agregarClase("Lunes4pm", "clase1");
		coord2.agregarClase("Lunes4pm", "clase2");
		coord3.agregarClase("Lunes4pm", "clase3");
		
		System.out.println("Done");
		SingletonSchedule.getInstance().print();
		
	}

}
