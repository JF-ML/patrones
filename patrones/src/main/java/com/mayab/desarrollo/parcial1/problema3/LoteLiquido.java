package com.mayab.desarrollo.parcial1.problema3;

public class LoteLiquido extends RegistroTanques{

	@Override
	public void registroInicial(int materia) {
		// TODO Auto-generated method stub
		setNivelMateriaInicial(materia);
		System.out.println("Nivel de materia prima inicial: "+getNivelMateriaInicial());
	}

	@Override
	public void registroFinal() {
		// TODO Auto-generated method stub
		setNivelMateriaFinal(getNivelMateriaInicial()-25);
		System.out.println("Nivel de materia prima final: "+getNivelMateriaFinal());
	}

	@Override
	public void calcularVolumen() {
		// TODO Auto-generated method stub
		setVolumen(getNivelMateriaInicial()-getNivelMateriaFinal());
		System.out.println("Volumen: "+getVolumen());
	}

	@Override
	public void inspeccionSeguridad() {
		// TODO Auto-generated method stub
		System.out.println("Check list de seguridad menos riguroso");
	}

}
