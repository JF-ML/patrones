package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class MueblesModernosFactory implements MueblesFactory{

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaM();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaM();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaM();
	}

}
