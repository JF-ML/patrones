package com.mayab.desarrollo.patrones.estructura.adapter;

public class EmpleadoViejo implements PersonaVieja{
	
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	
	public EmpleadoViejo(String n, String a,String fn) {
		this.nombre=n;
		this.apellido=a;
		this.fechaNacimiento=fn;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellido;
	}

	@Override
	public String getFechaNacimiento() {
		// TODO Auto-generated method stub
		return this.fechaNacimiento;
	}

}
