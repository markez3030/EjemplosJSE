package com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.pojo;

import java.util.Comparator;

import com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.interfaz.IVendible;
import com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.interfaz.IVolador;
import com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz.InterfazEstupida;

public class Pajaro extends Animal implements IVolador, IVendible, InterfazEstupida {

	private boolean puedeVolar;
	private int huevosSemana;

	public Pajaro(String raza, String familia, float precio, boolean puedeVolar) {
		super(raza, familia, precio);
		this.setPuedeVolar(puedeVolar);
		// TODO Auto-generated constructor stub
	}
	
	public Pajaro(String raza) {
		super(raza, "", 0f);
		this.setPuedeVolar(false);
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
		System.out.println("Factura " + super.getPrecio() + "€");
	}

	public String puedeVolar() {
		String mensaje = "Puede volar: ";
		if (this.puedeVolar == true)
			mensaje += "Si";
		else
			mensaje += "No";
		return mensaje;
	}

	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += "\nCocinable: No";
		mensaje += "\n" + this.puedeVolar() + "\n";
		return mensaje;

	}

	public int getHuevosSemana() {
		return huevosSemana;
	}

	public void setHuevosSemana(int huevosSemana) {
		this.huevosSemana = huevosSemana;
	}
	
	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return this.getHuevosSemana();
	}
	

		

}
