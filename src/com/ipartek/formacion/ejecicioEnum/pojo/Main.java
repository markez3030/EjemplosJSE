/*
 *
 * @author francho - http://francho.org/lab/
 */
package com.ipartek.formacion.ejecicioEnum.pojo;

/*
 * Un tipo enumerado &quot;complejo&quot;, tiene sus propios m�todos y constructor
 */
 
enum Vaso {
    // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
    JARRA(500), TUBO(250), TERCIO(333), CA�A(200), QUINTO(220);
    private int cc; // Variable interna donde almacenaremos la capacidad
    // Nuestro constructor nos fuerza a pasar par�metros al definir un nuevo tipo
    Vaso(int cc) {
        this.cc = cc;
    }
    // Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
        return cc;
    }
}

/*
 * Definimos un tipo de bebida
 */
class BebidaCerveza {
    enum MarcaCerveza { AMBAR, GUINNESS, HEINEKEN,CA�A,QUINTO } // Tipos enumerados sencillos. Solo tenemos estas marcas
    private Vaso vaso;
    private MarcaCerveza marca;
    BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
        this.marca = marca;
        this.vaso = vaso;
    }
    public void servir() {
        System.out.println("Sirviendo " + vaso.getCentimetrosCubicos() + "cc de " + marca);
    }
}

/*
 * Clase p�blica que prueba todo esto
 */
public class Main {
    public static void main(String[] args) {
        BebidaCerveza birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.AMBAR, Vaso.JARRA);
        birra.servir();
        birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.GUINNESS, Vaso.CA�A);
        birra.servir();
        birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.QUINTO, Vaso.QUINTO);
        birra.servir();
        birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.AMBAR, Vaso.CA�A);
        birra.servir();

    }
}