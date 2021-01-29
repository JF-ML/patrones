package com.mayab.patrones.creacion.muebles;

public class MueblesOchenterosFactory implements MueblesFactory{

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaO();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaO();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaO();
	}

}
