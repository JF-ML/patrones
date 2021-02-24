package com.mayab.desarrollo.parcial1.problema3;

public class LoteAcetileno extends RegistroTanques{

	@Override
	public void registroInicial(int materia) {
		// TODO Auto-generated method stub
		setNivelMateriaInicial(materia);
		System.out.println("Numero de tambores inicial: "+getNivelMateriaInicial());
	}

	@Override
	public void registroFinal() {
		// TODO Auto-generated method stub
		setNivelMateriaFinal(getNivelMateriaInicial()-3);
		System.out.println("Numero de tambores final: "+getNivelMateriaFinal());
	}

	@Override
	public void calcularVolumen() {
		// TODO Auto-generated method stub
		setVolumen((getNivelMateriaInicial()-getNivelMateriaFinal())*8);
		System.out.println("Volumen: "+getVolumen());
	}

	@Override
	public void inspeccionSeguridad() {
		// TODO Auto-generated method stub
		System.out.println("Check list de seguridad MUCHO MAS rigurosa");
	}

}
