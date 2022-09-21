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

//Mostrar menu y resultados en joption
public class Principal {
    
    public static void main(String[] args) {
        Pila_Sin_Stack mets = new Pila_Sin_Stack();
        Scanner opcion = new Scanner(System.in);
        int seleccion;
        
        do{
            System.out.println("Menu de la Pila: ");
            System.out.println("1.- Push");//Se llama al metodo para insertar elemento en la pila
            System.out.println("2.- Pop");//Se llama al metodo PoP para sacar al elemento de la pila
            System.out.println("3.- Mostrar Pila");//Ver la pila
            System.out.println("4.- Salir");//Ver la pila
            
            System.out.println("Teclee la opcion: ");
            seleccion = opcion.nextInt();
            
            switch(seleccion){
                case 1: mets.push();
                    break;
                case 2: mets.pop();
                    break;
                case 3: mets.ver();
                    break;
                default:
                    System.err.println("ERROR");
            }
            
        }while(seleccion!=4);
    }
}
