package com.mayab.desarrollo.patrones.dependency;

import java.util.List;

public interface IServicioDatosVentas {
	public List<Ventas>  getAllVentas();
	public List<Ventas> getVentasEmpleado(Empleado e);
	public void addVentas();
}
