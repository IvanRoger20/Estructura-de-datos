/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivossss;

/**
 *
 * @author 980035530
 */
public class Recursivossss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
     int division (int a, int b)
    {
	if(b > a) return 0;
	else
	    return division(a-b, b) + 1;
    }
    //
    //invertir un numero
     int invertir (int n)
    {
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
