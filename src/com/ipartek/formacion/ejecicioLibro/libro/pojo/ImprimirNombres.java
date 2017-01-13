package com.ipartek.formacion.ejecicioLibro.libro.pojo;
public class ImprimirNombres {
   

   private String [] nombres={"Egoitz","Iker","Julian","Sergio"};

   	/**
   	*
   	*  @return cadena Variable que devuelve todos los nombres
    * 
    */
     public String toString() {
		// TODO Auto-generated method stub
	   //Comentario de linea
	   String cadena="";
	      for(String n: this.nombres){
	        	cadena+=" "+n;
	        }
	      /*
	       * Comentario de bloque
	       */
		return cadena;
	}
   
}