/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unidad_3;

/**
 *
 * @author Ivan
 */
public class UsoExcepcion_Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            metodo1();
        }
        // atrapa la excepcion lanzada desde metodo1()
        catch(Exception excepcion) {
            System.err.printf("%s\n\n",excepcion.getMessage());
            // imprimir el rastero de la pila de la expcepcion
            excepcion.getStackTrace();
            // se obtiene informacion del rastreo de la pila
            StackTraceElement[] elementosRastreo = excepcion.getStackTrace();
            System.out.println("\n Rastreo de la pila de getStackTrace()");
            System.out.println("Clase\t\t\tArchivo\t\t\tLinea\tMetodo");
            // se interactura atraves del objeto elementosrastreo para
            // obtener la descripcion de la excepcion
            for(StackTraceElement elemento:elementosRastreo) {
              System.out.println("%s\t", elemento.getClassName());
              System.out.println("%s\t", elemento.getFileName());
              System.out.println("%s\t", elemento.getLineNumber());
              System.out.println("%s\t", elemento.getMethodName());
              
            } //Fin del for
          
        }//Fin del catch
      
    }//Fin del main
  // Se crea metodo1 y se llama a metodo2 para lanzar las excepciones devuelta a main
  public static void metodo1()throws Exception {
      metodo2();
    
  }
  
  public static void metodo2()throws Exception {
      metodo1();  
  }
  public static void metodo3()throws Exception {
      throw new Exception("La excepcion se lanza desde el metodo3"); 
  }
}
