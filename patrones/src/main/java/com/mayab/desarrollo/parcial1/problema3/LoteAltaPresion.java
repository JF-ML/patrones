package com.mayab.desarrollo.parcial1.problema3;

import java.util.Random;

public class LoteAltaPresion extends RegistroTanques{

	int temp;
	int presion;
	
	int tiempoBomba;
	Random rnd = new Random();
	@Override
	public void registroInicial(int materia) {
		// TODO Auto-generated method stub
		setNivelMateriaInicial(materia);
		tiempoBomba = (rnd.nextInt(4) + 1);
		
		System.out.println("Usando bomba para gas de alta presion");
		System.out.println("Materia prima inicial: "+materia+" Tiempo de bomba: "+this.tiempoBomba);
		
	}

	@Override
	public void registroFinal() {
		// TODO Auto-generated method stub
		setNivelMateriaFinal(getNivelMateriaInicial() - this.tiempoBomba); 
		temp = (rnd.nextInt(40) + 15);
		presion = (rnd.nextInt(40) + 5) * 10;
		
		System.out.println("Nivel de materia prima final: "+getNivelMateriaFinal()+" Temp: "+this.temp+" Presion: "+this.presion);
		
		
	}

	@Override
	public void calcularVolumen() {
		// TODO Auto-generated method stub
		setVolumen(temp*presion);
		
		System.out.println("Volumen: "+getVolumen());
	}

	@Override
	public void inspeccionSeguridad() {
		// TODO Auto-generated method stub
		System.out.println("Check list de seguridad");
	}

}
