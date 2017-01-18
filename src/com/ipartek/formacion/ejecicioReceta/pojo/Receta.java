package com.ipartek.formacion.ejecicioReceta.pojo;

import java.util.ArrayList;

public class Receta {

	public String IMG_DEFAULT="https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiq65u6y8bRAhWCWBQKHQclAYYQjRwIBw&url=http%3A%2F%2Fapps.enyojs.com%2F&psig=AFQjCNFDYwHY512orEOasGhk5iiAZVIyMg&ust=1484653483552680";
	
	private String titulo;
	private ArrayList<Ingrediente> ingrediente;
	private int tiempo;
	private String dificultad;
	private String comensales;
	private String descripcion;
	private String contieneGluten;
	private String imagen;

	public Receta() {
		super();
	}

	/**
	 * Constructor de la clase {@code Receta}.
	 * 
	 * @param titulo
	 * @param ingrediente
	 * @param tiempo
	 * @param dificultad
	 * @param comensales
	 * @param descripcion
	 */
	public Receta(String titulo, ArrayList<Ingrediente> ingrediente, int tiempo, String dificultad, String comensales,
			String descripcion) {
		super();
		this.setTitulo(titulo);
		this.setIngrediente(ingrediente);
		this.setTiempo(tiempo);
		this.setDificultad(dificultad);
		this.setComensales(comensales);
		this.setDescripcion(descripcion);
		this.setContieneGluten("No");
		this.imagen=IMG_DEFAULT;
	}
	
	public Receta(String titulo) {
		super();
		this.setTitulo(titulo);
		this.setIngrediente(null);
		this.setTiempo(0);
		this.setDificultad("sencilla");
		this.setComensales("2");
		this.setDescripcion("");
		this.setContieneGluten("No");
		this.imagen=IMG_DEFAULT;
		
	}
	
	

	public Receta(String titulo, int tiempo, String dificultad, String comensales, String descripcion) {
		super();
		this.setTitulo(titulo);
		this.setIngrediente(null);
		this.setTiempo(tiempo);
		this.setDificultad(dificultad);
		this.setComensales(comensales);
		this.setContieneGluten("No");
		this.setDescripcion(descripcion);
		this.imagen=IMG_DEFAULT;


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
		if (ingrediente == null) {
			this.ingrediente = new ArrayList<Ingrediente>();
		} else {
			this.ingrediente = ingrediente;
		}

	}

	public int getTiempo() {
		return tiempo;
	}

	/**
	 * Mira si el tiempo de la {@code Receta} tiene valor negativo. En caso de
	 * tener el valor negativo se pone a 0
	 * 
	 * @param tiempo
	 *            variable que calcula el tiempo que se tarda en hacer la comida
	 */
	public void setTiempo(int tiempo) {
		if (0 > tiempo)
			this.tiempo = 0;
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

	public String getContieneGluten() {
		contieneGluten();
		return contieneGluten;
	}

	public void setContieneGluten(String contieneGluten) {
		this.contieneGluten = contieneGluten;
	}

	/**
	 * Método que recorre todo la coleccion de ingredientes y mira si algun
	 * elemento tiene gluten En caso de tenerlo se pone el valor en positivo.
	 * Valor por defecto de la variable: NO
	 */
	public void contieneGluten() {
		for (Ingrediente i : this.ingrediente) {
			if (i.isGluten() == true) {
				this.setContieneGluten("Si");
				break;
			}
		}
	}

	/**
	 * Metodo que añade un ingrediente a la lista de ingredientes
	 * Si es nulo devuelve false
	 * @param i Ingrediente que se quiere añadir a la lista
	 * @return
	 */
	public boolean addIngrediente(Ingrediente i) {
		// TODO Auto-generated method stub
		if (i != null) {
			this.ingrediente.add(i);
			return true;
		}
		return false;
	}

	/**
	 * Metodo que borra un ingrediente pasandole un {@code Ingrediente}
	 * @param i Ingrediente que se quiere borrar
	 * @return true si borra el ingrediente. False si no lo encuentra
	 */
	public boolean removeIngrediente(Ingrediente i) {
		Ingrediente i2 = null;
		if(i!=null){
			for (int x = 0; x < this.ingrediente.size(); x++) {
				i2 = this.ingrediente.get(x);
				if (i2.getNombre().equalsIgnoreCase(i.getNombre())) {
					this.ingrediente.remove(x);
					return true;
				}
			}
		}
		
		return false;
	}
	/**
	 * Metodo que borra un ingrediente pasandole el nombre del ingediente
	 * @param i Ingrediente que se quiere borrar
	 * @return true si borra el ingrediente. False si no lo encuentra
	 */
	public boolean removeIngrediente(String nombre) {
		Ingrediente i2 = null;
		if(nombre!=null){
			for (int x = 0; x < this.ingrediente.size(); x++) {
				i2 = this.ingrediente.get(x);
				if (i2.getNombre().equalsIgnoreCase(nombre)) {
					this.ingrediente.remove(x);
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Compueba si contiene el ingrediente pasado como parametro
	 * @param ingrediente a buscar
	 * @return true si contiene ingrediente
	 * 		   false en caso contrario
	 */
	public boolean contiene(Ingrediente ingrediente)
	{
		Ingrediente i2 = null;
		boolean isIngrediente=false;
		if(ingrediente!=null){
			for (int x = 0; x < this.ingrediente.size(); x++) {
				i2 = this.ingrediente.get(x);
				if (i2.getNombre().equalsIgnoreCase(ingrediente.getNombre())) {
					isIngrediente= true;
					break;
				}
			}
		}
		return isIngrediente;
	}
	

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
	@Override
	public String toString() {
		String mensaje = "RECETA: " + this.titulo.toUpperCase()
				+ "\n***************************\n\n---INGREDIENTES---\n";
		/*
		 * For que va recorriendo todos los ingredientes en caso de que a receta
		 * tenga alguno Si no tiene ingredientes imprime un mensaje informando
		 * de ello
		 */
		if (this.ingrediente != null) {
			Ingrediente i = null;
			for (int x = 0; x < this.ingrediente.size(); x++) {
				i = this.ingrediente.get(x);
				mensaje += i.toString();
			}
		} else
			mensaje += "ESTA RECETA NO TIENE INGREDIENTES AÑADIDOS";

		// IMPRESION DE LOS DEMAS DATOS
		mensaje += "\n--------RESUMEN------\n";
		/*
		 * SE COMPRUEBA SI EL TIEMPO ES 0-->ESTO ES QUE SE HA INTRODUCIDO MAL(EN
		 * NEGATIVO) SI ES POSITIVO EL TIEMPO ESTA BIEN INTRODUCIDO
		 */
		if (this.tiempo == 0)
			mensaje += "Tiempo: no se ha introducido tiempo estimado";
		else
			mensaje += "Tiempo: " + this.tiempo;
		mensaje += "\nDificultad: " + this.dificultad;
		/*
		 * COMPROBACION DE SI ALGUN ELEMENTO TIENE GLUTEN SI NO TIENE
		 * INGEDIENTES LO SALTA SI TIENE INGREDIENTES SE MIRA QUE CONTIENE LA
		 * VARIALBE
		 */
		if (this.ingrediente != null) {
			mensaje += "\nContiene gluten: " + getContieneGluten();
		}
		mensaje += "\nComensales: " + this.comensales + "\nDescripcion:\n" + this.descripcion;
		mensaje+="\n"+this.imagen;
		return mensaje;
	}

}
