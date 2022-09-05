/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practicas.Clase;

/**
 *
 * @author invitado
 */
public class PracticaClase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 20, b=10;
        String x = "Programacion", y = "Objetos";
        
        int ar[]={1,2,3};
        int br[]={1,2,3};
        
        boolean condicion = true;
        
        //uso de operadores condicionales
        System.out.println("a==b: " + (a==b));
        System.out.println("a<b: " + (a<b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println("a>b: " + (a>b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a!=b: " + (a!=b));
        
        System.out.println("x==y: " + (ar==br));
        System.out.println("Condicion==true: " + (condicion==true));
        
        
        
        // ¿Los arreglos se pueden comparar con operadores relacionales?
        // si o no y ¿porque?
        // Si se puede pero para poder comparar los datos se necesita especificar
        // que dato se quiere comparar
        // Tambien se puede comparar el tamaño del arreglo pero no se pueden
        // comparar todos los datos juntos del arreglo
    }
    
}
