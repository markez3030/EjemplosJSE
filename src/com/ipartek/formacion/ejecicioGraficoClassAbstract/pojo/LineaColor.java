package com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo;

public class LineaColor extends Linea {

	private String color;

	public LineaColor(double x, double y, double longitud, String color) {
		super(x, y, longitud);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Pintar linea de color "+this.color);
	}

	
	
}
