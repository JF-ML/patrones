package com.mayab.desarrollo.patrones.estructura.adapter;

public class AdapterViejaNueva implements PersonaNueva {

	private PersonaVieja persona;
	
	public AdapterViejaNueva(PersonaVieja persona) {
		this.persona=persona;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String nombreCompleto=persona.getNombre()+" "+persona.getApellido();
		return nombreCompleto;
	}

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		String fecha=persona.getFechaNacimiento();
		String[] edades=fecha.split("-");
		int x=2021-Integer.parseInt(edades[2]);
		
		return Integer.toString(x);
	}

}
