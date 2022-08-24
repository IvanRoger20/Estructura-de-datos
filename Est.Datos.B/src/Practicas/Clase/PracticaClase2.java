/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practicas.Clase;

import java.util.Scanner;

/**
 *
 * @author invitado
 */

/*Se solicita al usuario el ingreso de 10 valores numericos
  se debera:

  *Sumar el total de numeros
  *Obtener el promedio de numeros
  *Mostrar el numero mayor
  *Mostrar el numero menor
  *Mostrar cuantas veces se repite un numero

*/
public class PracticaClase2 {
    public static void main(String[] args) {
        //Se instancia objeto
        Scanner entrada = new Scanner(System.in);
        //Se declaran variables para aplicar las operaciones
        //solicitadas a los datos introducidos por el usuario
        float promedio = 0;
        float suma = 0;
        float mayor = 0;
        float menor = 0;
        //Se declara el arreglo
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese el numero de la posicion " + i +": ");
            nums[i] = entrada.nextInt();
            
        }
        //Se realiza operaciones
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
            if(mayor < nums[i]) {
                mayor = nums[i];
            }
            System.out.println(String.format("Posicion[%d]Elemento:%d",i,nums[i]));
        }
        
    }
}
