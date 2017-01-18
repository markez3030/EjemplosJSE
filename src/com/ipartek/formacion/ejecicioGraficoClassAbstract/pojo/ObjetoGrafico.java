package com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo;

/**
 * Clase abstracta porque tiene un metodo abstracto: Dibujar()<br/>
 * Este metodo será implementado por sus clases hijas o puede que no.<br/>
 * Si una clase hija es abstracta si no implementa el metodo del padre. No se
 * puede instanciar al igual que las clases
 * 
 * @author Curso
 *
 */
public abstract class ObjetoGrafico {

	private double x;
	private double y;

	/**
	 * geoPunto se compone de una latitud y longitud, mediante una clase interna
	 */
	private GeoPunto geoPunto;

	final class GeoPunto {// CREACION DE LA CLASE GEOPUNTO

		private double longitud;
		private double latitud;

		public GeoPunto(double longitud, double latitud) {
			super();
			this.setLongitud(longitud);
			this.setLatitud(latitud);
		}

		public double getLongitud() {
			return longitud;
		}

		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}

		public double getLatitud() {
			return latitud;
		}

		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}

	}// FINAL DE LA CLASE GEOPUNTO

	public ObjetoGrafico(double x, double y) {
		super();
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public GeoPunto getGeoPunto() {
		return geoPunto;
	}

	public void setGeoPunto(GeoPunto geoPunto) {
		this.geoPunto = geoPunto;
	}

	public void mover(double x, double y) {
		// TODO Auto-generated method stub
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		System.out.println("Objeto movido  a nueva posicion (" + x + "," + y + ")");
	}

	public abstract void dibujar();
}
