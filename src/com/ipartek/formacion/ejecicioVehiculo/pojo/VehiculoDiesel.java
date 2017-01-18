package com.ipartek.formacion.ejecicioVehiculo.pojo;

public class VehiculoDiesel extends Vehiculo {

	public final float MIN_CAPACIDAD_COMBUSTIBLE = 70;

	private float capacidadCombustible;

	public VehiculoDiesel() {
		super();
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public float getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(float capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [capacidadCombustible=" + capacidadCombustible + "] extends " + super.toString();
	}
	
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		super.arrancar();
		System.out.println("Diesel");
	}
}
