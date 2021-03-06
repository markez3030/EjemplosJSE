package com.ipartek.formacion.ejecicioVehiculo.pojo;

public class VehiculoElectrico extends Vehiculo {

	public final float MIN_CAPACIDAD_BATERIA = 100;

	private float capacidadBaterias;

	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [capacidadBaterias=" + capacidadBaterias + "] extends " + super.toString();
	}
	
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		super.arrancar();
		System.out.println("Electrico");
	}

}
