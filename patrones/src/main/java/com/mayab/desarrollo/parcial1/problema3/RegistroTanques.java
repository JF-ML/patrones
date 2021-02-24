package com.mayab.desarrollo.parcial1.problema3;

public abstract class RegistroTanques {
	
	int nivelMateriaInicial;
	int nivelMateriaFinal;
	int volumen;
	
	public final void registro(int materia) {
		registroInicial(materia);
		registroFinal();
		calcularVolumen();
		inspeccionSeguridad();
		reporte();
	}
	
	public abstract void registroInicial(int materia);
	
	public abstract void registroFinal();
	
	public abstract void calcularVolumen();
	
	public abstract void inspeccionSeguridad();
	
	public void reporte() {
		System.out.println("Fecha: 25/02/21");
		System.out.println("Volumen envasado: "+this.volumen);
		System.out.println("Material consumido: "+(this.nivelMateriaInicial-this.nivelMateriaFinal));
		System.out.println("Firmas:____________________");
	}

	public int getNivelMateriaInicial() {
		return nivelMateriaInicial;
	}

	public void setNivelMateriaInicial(int nivelMateriaInicial) {
		this.nivelMateriaInicial = nivelMateriaInicial;
	}

	public int getNivelMateriaFinal() {
		return nivelMateriaFinal;
	}

	public void setNivelMateriaFinal(int nivelMateriaFinal) {
		this.nivelMateriaFinal = nivelMateriaFinal;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
}
