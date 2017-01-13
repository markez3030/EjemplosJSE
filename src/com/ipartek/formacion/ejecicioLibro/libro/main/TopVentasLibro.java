package com.ipartek.formacion.ejecicioLibro.libro.main;

import com.ipartek.formacion.ejecicioLibro.libro.pojo.ImprimirNombres;
import com.ipartek.formacion.ejecicioLibro.libro.pojo.Libro;

public class TopVentasLibro {

	public static void main(String[] args) {
		ImprimirNombres im= new ImprimirNombres();
		System.out.println("Socios: "+im.toString()+"\n***********************************");
		//Entrada de datos en la instancia libro mediante el constructor
				Libro c=new Libro(300,"C++", "Julio");
				
				//Entrada de datos en la instancia de libro mediante los metodos SET 
				Libro c2=new Libro();
				c2.setNombre("AMOR Y ASCO");
				c2.setNumeroPaginas(350);
				c2.setAutor("Montero");
				
				//Entrada de datos a una instancia libro mediante el constructor
				Libro c3=new Libro(729,"MySql","Ander");
				
				System.out.println("Libro1: "+c.toString());
				//Sumamos 10 paginas al libro
				c.escribir(10);
				System.out.println("Libro 1 con 1 pagina añadida: "+c.toString());
				
				System.out.println("Libro 2: "+c2.toString());
				
				
				System.out.println("Libro 3: "+c3.toString());
				//Hacemos un bucle en el que añadimos las paginas que deseemos
				for(int i=0;i < 10;i++)
				{
					c3.escribir();
				}
				System.out.println("Libro 3: "+c3.toString());
	
	}
	
}
