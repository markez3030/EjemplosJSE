package com.ipartek.formacion.ejecicioAnimales.pojo;


public class Animal {

	private String raza;
	private String familia;
	private float precio;
	
	
	public Animal(String raza, String familia, int precio) {
		super();
		this.setRaza(raza);
		this.setFamilia(familia);
		this.setPrecio(precio);
	}



	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}

	
	public void setPrecio(float precio) {
		// TODO Auto-generated method stub
		this.precio=precio;
	}

	
	public float getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}



	@Override
	public String toString() {
		String mensaje=this.raza;
		mensaje+="\n*******************";

		mensaje+="\nFamilia: "+this.familia;
		mensaje+="\nPrecio: "+this.precio+"€";
		return mensaje;
	}



	
	
	
}
