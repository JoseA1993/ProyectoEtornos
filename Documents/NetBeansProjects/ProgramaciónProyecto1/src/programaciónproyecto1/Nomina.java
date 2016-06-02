/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciónproyecto1;

/**
 *
 * @author JoseAntonio
 */
public class Nomina {
    static final double SALARIO_MINIMO=600, AYUDA=100;
    
    static final float IRPF_MAX=24f, IRPF_MIN=9f;
    
    public static void muestraNomina() {
        double extra=0;
        double Hijos=0;
        float irpf;
        double irpfFinal;
        
        System.out.printf("%40s", "NOMINA\n");
        System.out.print("Fecha: ");
        Pantalla.miFecha.muestraFecha();
        System.out.println("");
        
        System.out.println("Empleado: " + nombre + "Numero: ");
        System.out.println(""); 
    }
}
