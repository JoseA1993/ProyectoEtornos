/*
 * Ejer23:Hacer un programa que pida una cantidad por teclado y te muestre el 
 * total de dicha cantidad + el 21% de iva.Utilizar los siguientes métodos;
 * float pideFloat(String mensaje)
 * float calculoIva(floatcantidad)àCalcula el 21%sobre cantidad.

 */
package ejer23;

import java.util.Scanner;

/**
 *
 * @author Cherlycan
 */
public class Ejer23 {

    static public float pideFloat (String texto) {
        Scanner teclado=new Scanner(System.in);
        System.out.println(texto);
        return teclado.nextFloat();
        
    }
    static public float calculoIva (float cantidad) {
        cantidad=cantidad*0.21f;
        return cantidad;
    }
    public static void main(String[] args) {
        float cantidad, iva;
        cantidad = pideFloat("introduce importe: ");
        iva = calculoIva(cantidad);
        System.out.println("Importe: " + cantidad);
        System.out.println("IVA: " + iva);
        System.out.println("TOTAL: " + (cantidad+iva));
        
    }
    
}
