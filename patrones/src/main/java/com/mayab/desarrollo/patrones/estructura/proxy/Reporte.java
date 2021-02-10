package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.IOException;

public interface Reporte {
	public void leer()throws IOException;
	public void escribir(String a)throws IOException;
}
