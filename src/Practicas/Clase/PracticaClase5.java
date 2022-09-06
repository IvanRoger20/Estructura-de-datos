/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas.Clase;

/**
 *
 * @author IvanTron
 */
public class PracticaClase5 {

    /**
     * @param args the command line arguments
        1.- Generar main class "PC_5" en el proyecto Java: Est_Datos_B 
        2.- Hacer uso de las diferentes notaciones matemáticas relacionadas con el Big O 
        3.- Generar código java que represente a cada una de estas al menos 5 preferentemente integrar arreglos para la demostración de la notación matemática, importante comentar código. 
        4.- Mostrar resultados en consola.  
     */
    public static void main(String[] args) {
        // Tarea instanciar objetos para mostrar
        // en pantalla los valores y permitir al usuario ingresar datos
        
        int[]Numeros = new int[10];
        //Numeros.printSumaYProducto(1,2,3,4);
        
    }
    //hacer uso de o(N) en un arreglo
    
    public void printSumaYProducto(int[]array) {
        int suma = 0;
        int producto = 1;
        for(int i = 0; i < array.length; i++) {
            suma += array[i];    
        }
        for (int i = 0; i<array.length; i++) {
            producto *= array[i];
            System.out.println(suma + "," + producto);
        }
    }
    //ahora aplicamos O(N*2) es decir hay un bucle, cliclo o laso
    //que itera N veces y otro interior que tambien itera
    
    public void printPares(int[]array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    //al mismo codigo del anterior, al ciclo interno se agrega
    // i+1
    public void printPares(int[]array, String num) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    
}
/*
mas o menos una salida serial
(1,2),(1,3),(1,4),(1,5)
   (2,3),(2,4),(2,5)
      (3,4),(3,5)
         (4,5)
Aunque el ciclo, lazo, de adentro sea mas pequeño
que el exterior no es importante entrar en los detalles
ni crear constantes
*/  
//pendiente desarrollar mas notaciones y editar las preguntas