package com.ipartek.formacion.ejecicioAnimales.pojo;

import com.ipartek.formacion.ejecicioAnimales.interfaz.IVendible;
import com.ipartek.formacion.ejecicioAnimales.interfaz.IVolador;

public class Pajaro extends Animal implements IVolador,IVendible {

	private boolean puedeVolar;
	
	
	public Pajaro(String raza, String familia, int precio,boolean puedeVolar) {
		super(raza, familia, precio);
		this.setPuedeVolar(puedeVolar);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("El animal ha despegado");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("El animal ha aterrizado");
	}

	@Override
	public void generarFactura() {
		// TODO Auto-generated method stub
		System.out.println("Factura "+super.getPrecio()+"€");
	}
	
	public String puedeVolar()
	{
		String mensaje="Puede volar: ";
		if(this.puedeVolar==true)
			mensaje+="Si";
		else
			mensaje+="No";
		return mensaje;
	}


	@Override
	public String toString() {
		String mensaje=super.toString();
		mensaje+="\nCocinable: No";
		mensaje+="\n"+this.puedeVolar()+"\n";
		return mensaje;
		
	}


	
	
	
}
