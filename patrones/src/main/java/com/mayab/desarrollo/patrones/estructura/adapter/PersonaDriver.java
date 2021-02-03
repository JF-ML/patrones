package com.mayab.desarrollo.patrones.estructura.adapter;

import java.util.ArrayList;

public class PersonaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoNuevo empN= new EmpleadoNuevo("John Johnson","25");
		EmpleadoViejo empV = new EmpleadoViejo("Juan","Lopez","22-09-1980");
		AdapterViejaNueva adapter = new AdapterViejaNueva(empV);
		
		
		ArrayList<PersonaNueva> list=new ArrayList<PersonaNueva>();
		
		list.add(empN);
		list.add(adapter);
		
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getEdad());
			System.out.println("---------------");
		}
		
	}

}
