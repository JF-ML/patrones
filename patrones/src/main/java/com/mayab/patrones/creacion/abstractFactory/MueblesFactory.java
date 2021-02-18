package com.mayab.patrones.creacion.abstractFactory;

public interface MueblesFactory {
	Silla createSilla();
	Mesa createMesa();
	Sofa createSofa();
}
