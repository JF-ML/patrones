package com.mayab.desarrollo.patrones.estructura.adapter;

public class EmpleadoNuevo implements PersonaNueva {

	private String name;
	private String edad;
	
	public EmpleadoNuevo(String n,String e){
		this.name=n;
		this.edad=e;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

}
