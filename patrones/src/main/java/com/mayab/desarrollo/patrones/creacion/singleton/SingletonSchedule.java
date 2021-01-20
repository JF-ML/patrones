package com.mayab.desarrollo.patrones.creacion.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonSchedule {

	
	
	private HashMap<String,String> schedule = new HashMap<String,String>();
	
	private static SingletonSchedule instance;
	
	private SingletonSchedule() {
		
	}
	
	public static SingletonSchedule getInstance() {
		if(instance == null) {
			instance = new SingletonSchedule();
		}
		return instance;
	}
	
	public void agregarClase(String hora, String clase) {
		schedule.put(hora, clase);
	}
	
	public void print() {
		for(Map.Entry me : schedule.entrySet()) {
			System.out.print("Key"+me.getKey()+"& Value"+me.getValue());
		}
	}
	
}


