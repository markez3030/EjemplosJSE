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

	/**
	 * Mira si la cantidad del {@code Ingrediente} tiene valor negativo.
	 * En caso de tener el valor negativo se pone a 0
	 * @param cantidad variable tiene la cantidad que hay que echar del {@code Ingrediente}
	 */
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
		String mensaje= "\n-->" + this.nombre+"\n";
		/*
		 * Se mira si la cantidad es disinta de 0
		 * Si no lo es se imprime, si lo es se pasa
		 */
		if(this.cantidad!=0)
		{
			mensaje+="Cantidad:" + this.cantidad+"\n";
		}
		//Mensaje que dice se el elemento contiene gluten o no
		if(this.gluten)
		{
			mensaje += "CUIDADO!!! CONTIENE GLUTEN\n";

		}
		
		return mensaje;
	}
	
	
	
}
