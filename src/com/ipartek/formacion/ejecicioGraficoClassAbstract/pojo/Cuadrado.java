package com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo;

public class Cuadrado extends ObjetoGrafico {

	private double lado;
	
	public Cuadrado(double x, double y,double lado) {
		super(x, y);
		this.setLado(lado);
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujar cuadrado de "+this.lado+" de lado");
	}


}
