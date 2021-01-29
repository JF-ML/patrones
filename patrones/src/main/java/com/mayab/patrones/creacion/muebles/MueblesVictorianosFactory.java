package com.mayab.patrones.creacion.muebles;

public class MueblesVictorianosFactory implements MueblesFactory{

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaV();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaV();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaV();
	}

}
