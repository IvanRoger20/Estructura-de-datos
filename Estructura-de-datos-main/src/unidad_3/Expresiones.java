/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Se solicita al usuario el ingreso de valores tal forma 
que se obtenga una expresion y esta sera evaluada de acuerdo 
a las siguientes clasificaciones:
    a) Prefija(Primero tel operador, constantes y variables)
    b) Postfija (Primero constantes, variables y operador)
 */

package unidad_3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author invitado
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea objeto para informacion de la expresion 
        
        System.out.println("Escriba una expresion algebraica: ");
        Scanner leer = new Scanner(System.in);
        // Depurar la expresion algebraica 
        
        String expresion = depurar(leer.nextLine());
        String[]arrayInfix = expresion.split("");
        //Declaracion de las pilas
        Stack<String>PE = new Stack<>();// Pila de entrada 
        Stack<String>PT = new Stack<>();// Pila temporal para los operadores de la expresion
        Stack<String>PS = new Stack<>();// Pila de Salida 
        
        
    }
    
}
