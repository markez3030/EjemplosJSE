package com.ipartek.formacion.ejecicioReceta.pojo;

public class Ingrediente {

	private String nombre;
	private int cantidad;
	private boolean gluten;
	
	
	public Ingrediente() {
		super();
	}


	public Ingrediente(String nombre, int cantidad, boolean gluten) {
		super();
		this.setNombre(nombre);
		this.setCantidad(cantidad);
		this.setGluten(gluten);
	}
	
	public Ingrediente(String nombre, boolean gluten) {
		super();
		this.setNombre(nombre);
		this.setCantidad(0);
		this.setGluten(gluten);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		if(cantidad<0)
			this.cantidad=0;
		else
			this.cantidad = cantidad;
	}


	public boolean isGluten() {
		return gluten;
	}


	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}


	@Override
	public String toString() {
		String mensaje= "\n-->Nombre: " + this.nombre+"\n";
		if(this.cantidad!=0)
		{
			mensaje+="Cantidad:" + this.cantidad+"\n";
		}
		if(this.gluten)
		{
			mensaje += "Gluten: Si contiene\n";

		}
		
		return mensaje;
	}
	
	
	
}
