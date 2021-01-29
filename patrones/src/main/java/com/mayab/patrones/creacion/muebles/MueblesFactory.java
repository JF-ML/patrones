package com.mayab.patrones.creacion.muebles;

public interface MueblesFactory {
	Silla createSilla();
	Mesa createMesa();
	Sofa createSofa();
}
