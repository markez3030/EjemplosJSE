package com.ipartek.formacion.ejecicioAnimales.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.ejecicioAnimales.interfaz.ICocinable;
import com.ipartek.formacion.ejecicioAnimales.interfaz.IConducible;
import com.ipartek.formacion.ejecicioAnimales.interfaz.IVendible;
import com.ipartek.formacion.ejecicioReceta.pojo.Ingrediente;

public class Burro extends Animal implements IConducible, ICocinable,IVendible {

	private String nombre;
	
	

	public Burro(String raza, String familia, int precio, String nombre) {
		super(raza, familia, precio);
		this.setNombre(nombre);
	}
	
	public Burro(String raza, String familia, int precio) {
		super(raza, familia, precio);

	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Arre burro");
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("Soooooo");
	}

	@Override
	public void girar(String direccion) {
		// TODO Auto-generated method stub
		System.out.println("El burro gira a la "+direccion);
	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		ArrayList<Ingrediente> listIngrediente= new ArrayList<Ingrediente>();
		listIngrediente.add(new Ingrediente("Sal", true));
		listIngrediente.add(new Ingrediente("Pimienta", true));
		return listIngrediente;
	}

	@Override
	public String getDescripcionReceta() {
		// TODO Auto-generated method stub
		return "Sal pimentar y a la cacuela";
	}

	@Override
	public void generarFactura() {
		// TODO Auto-generated method stub
		System.out.println("Factura: "+super.getPrecio()+"€");
	}
	
	
	@Override
	public String toString() {
		String mensaje=super.toString();
		mensaje+="\nNombre:" +this.nombre;
		if(this instanceof ICocinable)
			mensaje+="\nComestibe: Si\n";
		else
			mensaje+="\nComestibe: No\n";

	
		return mensaje;
	}
		
	

}
