package com.ipartek.formacion.ejecicioReceta.pojo;

import java.util.ArrayList;

public class Receta {

	private String titulo;
	private ArrayList<Ingrediente> ingrediente;
	private int tiempo;
	private String dificultad;
	private String comensales;
	private String descripcion;
	private static String glutenFree;

	public Receta() {
		super();
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingrediente, int tiempo, String dificultad, String comensales,
			String descripcion) {
		super();
		this.setTitulo(titulo);
		this.setIngrediente(ingrediente);
		this.setTiempo(tiempo);
		this.setDificultad(dificultad);
		this.setComensales(comensales);
		this.setDescripcion(descripcion);
		glutenFree=null;
	}

	public Receta(String titulo, int tiempo, String dificultad, String comensales, String descripcion) {
		super();
		this.setTitulo(titulo);
		this.setIngrediente(null);
		this.setTiempo(tiempo);
		this.setDificultad(dificultad);
		this.setComensales(comensales);
		this.setDescripcion(descripcion);
		glutenFree=null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		if(0>tiempo)
			this.tiempo=0;
		else
		    this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getComensales() {
		return comensales;
	}

	public void setComensales(String comensales) {
		this.comensales = comensales;
	}

	@Override
	public String toString() {
		String mensaje = "RECETA: " + this.titulo.toUpperCase() + "\n***************************\n";
		mensaje += "\n---INGREDIENTES---\n";
		if (this.ingrediente != null) {
			Ingrediente i = null;
			for (int x = 0; x < this.ingrediente.size(); x++) {
				i = this.ingrediente.get(x);
				mensaje += i.toString();
			}
		}
		else
			mensaje+="ESTA RECETA NO TIENE INGREDIENTES A�ADIDOS";
		mensaje+="\n--------RESUMEN------\n";
		if(this.tiempo==0)
			mensaje += "Tiempo: no se ha introducido tiempo estimado"  ;
		else
			mensaje += "Tiempo: " + this.tiempo;
		mensaje+= "\nDificultad: " + this.dificultad;
		if(this.ingrediente!=null)
		{
			isglutenFree();
			mensaje+= "\nContiene gluten: " + glutenFree;
		}
		mensaje+= "\nComensales: " + this.comensales
				+ "\nDescripcion:\n" + this.descripcion;

		return mensaje;
	}

	
	public void isglutenFree() {
		for (Ingrediente i : this.ingrediente) {
			if (i.isGluten() == true) {
				glutenFree="Si";
				break;
			}
		}
		if(glutenFree==null)
		glutenFree="No";

	}

	public static String isGlutenFree() {
		return glutenFree;
	}

	public static void setGlutenFree(String glutenFree) {
		Receta.glutenFree = glutenFree;
	}

}
