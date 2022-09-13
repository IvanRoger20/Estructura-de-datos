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
public class PracticaClase3 {
    public static void main(String[] args) {
        //Se instancia objeto
        Scanner entrada = new Scanner(System.in);
        //Se declaran variables para aplicar las operaciones
        //solicitadas a los datos introducidos por el usuario
        float promedio = 0;
        float suma = 0;
        int mayor = 0;
        int menor = 0;
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
        menor = mayor;
        //buscar el menor
        for (int i = 0; i < nums.length; i++) {
            if(menor > nums[i]) {
                menor = nums[i];
            }
        }
        //promedio
        promedio = suma / nums.length;
        System.out.println("------Salida------");
        //contar las veces que se repite cada numero
        int contar;
        for (int i = 0; i < nums.length; i++) {
            contar = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    contar++;
                }
            }
            System.out.println(String.format("El numero %d se repite %d veces", nums[i], contar));
        }
        System.out.println(String.format("La suma es %2f, el promedio es %2f, el mayor es %d, el menor es %d", suma, promedio, mayor, menor));
    }
}
