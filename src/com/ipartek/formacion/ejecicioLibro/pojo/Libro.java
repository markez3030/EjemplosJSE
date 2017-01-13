package com.ipartek.formacion.ejecicioLibro.pojo;

/**
 * 
 * @author Egoitz
 * Class {@code Libro} respresenta un libro
 */
public class Libro {

	private int numeroPaginas;
	private String nombre;
	private String autor;
	
	public Libro() {
		// TODO Auto-generated constructor stub
		this.numeroPaginas=0;
		this.nombre="desconocido";
		this.autor="anonimo";
	}

	public Libro(int numeroPaginas, String nombre, String autor) {
		super();
		this.setNumeroPaginas(numeroPaginas);
		this.setNombre(nombre);
		this.setAutor(autor);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if(numeroPaginas<0)
			this.numeroPaginas=0;
		else
			this.numeroPaginas = numeroPaginas;
	}
	
	/**
	 * Metodo toString sobreescrito de String que imprime un {@code Libro} con todas
	 * sus caraceristicas
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre + "\n--------------------\nNúmero Paginas: " + this.numeroPaginas + "\nDimensiones: "
				+ "\nAutor: " + this.autor+ "\n";
	}
	
	/**
	 * Aumenta el numero de paginas que desees
	 * @param numero int el numero de paginas que quieres aumentar
	 */
	public void escribir(int numero)
	{
		this.numeroPaginas+=numero;
	}
	
	/**
	 * Aumenta en 1 el numero de paginas
	 */
	public void escribir()
	{
		this.numeroPaginas++;
	}
	
	
}
