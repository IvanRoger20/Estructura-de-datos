/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unidad_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Pila_Sin_Stack {
    Scanner teclado = new Scanner(System.in);
    int pila1[] = new int[4];
    int tope =-1;
    // se crean los metodos similares a los usados por STACK
    public int push(){
        if(tope >= pila1.length-1) {
            
        }else {
            tope =+1;
            System.out.println("La pila esta llena");
            pila1[tope] = teclado.nextInt();
            
        }
    return tope;
    }
    
    public int pop() {
        if(tope==-1) {
            System.out.println("La pila esta vacia");
        } else{
            System.out.println("Se elimino un elmento de la pila");
            pila1[tope]=0;
            tope=-1;
        }
        return tope;
    }
    
    public void ver() {
        for(int tope=3; tope >=0; tope--) {
            System.out.println("Datos de la pila: " + pila1[tope]);
        }
    }
}