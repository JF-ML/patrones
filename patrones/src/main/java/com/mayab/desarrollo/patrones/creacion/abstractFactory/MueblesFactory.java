package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public interface MueblesFactory {
	Silla createSilla();
	Mesa createMesa();
	Sofa createSofa();
}
