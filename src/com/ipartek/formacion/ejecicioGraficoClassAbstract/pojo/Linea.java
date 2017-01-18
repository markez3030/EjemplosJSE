package com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo;

public abstract class Linea extends ObjetoGrafico {

	private double longitud;

	public Linea(double x, double y, double longitud) {
		super(x, y);
		this.setLongitud(longitud);
		// TODO Auto-generated constructor stub
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public abstract void dibujar();

}
