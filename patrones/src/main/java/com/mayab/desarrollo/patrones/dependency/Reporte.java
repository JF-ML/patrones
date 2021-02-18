package com.mayab.desarrollo.patrones.dependency;

import java.io.IOException;

public interface Reporte {
	public void leer()throws IOException;
	public void escribir(String a)throws IOException;
}
