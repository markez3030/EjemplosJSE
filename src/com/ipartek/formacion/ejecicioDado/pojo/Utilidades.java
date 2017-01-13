package com.ipartek.formacion.ejecicioDado.pojo;

/**
 * 
 * @author Egoitz
 *Clase {@code Utilidades} con metodos estaticos y comunes<br>
 *Por ejemplo: generar numeros aleatorios,validaciones etc
 */
public class Utilidades {

	
	/**
	 * Genera un numero {@code int} aleatorio entre 0 y el <b>maximo valor</b>
	 * @param <b>maximoValor<b> maximo valor del numero aleatorio
	 * @return numero aleatorio
	 */
	public static int getnumeroAleatorio(int maximoValor)
	{
		return (int)(Math.random() * (maximoValor));
	}
	
	
	/**
	 * Suma muy rara que se inventa el jefe, no me digas para que
	 * @param num1 entero a sumar
	 * @param num2 entero a sumar
	 * @return sumar los dos parametros, pero:<br>
	 * si cualquiera de los dos es negativo, retun 0<br>
	 * Si la suma es superior a 100 return 0
	 */
	public static int sumaTonta(int num1,int num2)
	{
		if(num1>=0 && num2>=0)
		{
			int suma=num1+num2;
			if(suma<100)
				return suma;
		}
		return 0;
	}
}
