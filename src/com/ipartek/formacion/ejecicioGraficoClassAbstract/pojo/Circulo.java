package com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo;

public class Circulo extends ObjetoGrafico {

	private double radio;
	
	public Circulo(double x, double y,double radio) {
		super(x, y);
		this.setRadio(radio);
		// TODO Auto-generated constructor stub
	}

	
	
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujar color de "+this.radio+" de radio");
	}


}
