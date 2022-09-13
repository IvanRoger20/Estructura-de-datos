/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.java.com.mycompany.recursivos;

/**
 * https://www.reddit.com/r/staryuuki/comments/v065ge/_/
 * https://www.reddit.com/r/arigameplays_morbo/
 * https://www.reddit.com/search/?q=amablitz
 * https://preview.redd.it/ko5i0718sv391.jpg?width=1125&format=pjpg&auto=webp&s=4abd148cc1a893104cb6fa3a7f7967277e10ce72
 * @author 980035530
 */
public class Recursivos {

    public static void main(String[] args) {
        System.out.println("Operaciones basicas con metodos recursivos");
        Recursivos Obj = new Recursivos();
        
    }
    // calcular el factorial
    int factorial(int n){
      if(n==0) return 1;   //AXIOMA
      else return n*factorial(n-1);  //FORMULA RECURSIVA
    }
    // encuentre la serie fibonacci
    int fibonaci(int n){
      if(n==1 || n==2) return 1;
      else return fibonaci(n-1)+fibonaci(n-2);
    }
     // restas sucesivas
     int division (int a, int b) {
	if(b > a) return 0;
	else
	    return division(a-b, b) + 1;
    }
    //
    //invertir un numero
    int invertir (int n) {
	if (n < 10)         //caso base
	    return n;
	else
	    return (n % 10) + invertir (n / 10) * 10;
    }
     //sumar los digitos de un numero
     int sumar_dig (int n)
    {
	if (n == 0)      //caso base
	    return n;
	else
	    return sumar_dig (n / 10) + (n % 10);
    }
     //maximo comun de dos numeros
     int sacar_mcd(int a, int b) {
        if(b==0)
            return a;
        else
            return sacar_mcd(b, a % b);
    }
}

