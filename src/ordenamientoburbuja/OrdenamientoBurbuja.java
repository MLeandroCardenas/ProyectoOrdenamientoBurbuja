
package ordenamientoburbuja;
import java.util.Scanner;
/**
 * 
 * @author MLeandroCardenas
 * @version 2017.26.02
 * 
 */
public class OrdenamientoBurbuja {
          short longitud=0; 
          short []array;
          Scanner teclado= new Scanner(System.in);//Creacion objeto de la clase Scanner 
          
    public OrdenamientoBurbuja() { //Constructor de la clase OrdenamientoBurbuja  
        System.out.println("Digite la longitud de su vector:");
         longitud=teclado.nextShort();
         array=new short [longitud]; // Crea el espacio en memoria para el vector
    } 
     /**
      * 
      * @param args, string[]
      * 
      */
    /*LA CLASE PRINCIPAL DONDE SE CREA EL OBJETO Y SE INVOCAN LOS
    METODOS DE LA CLASE*/
    public static void main(String[] args) { //CLASE PRINCIPAL MAIN.
       OrdenamientoBurbuja vector = new OrdenamientoBurbuja(); //Creacion del objeto vector
       vector.llenarArrayYImprimirlo();
       vector.OrdenarArrayYImprimirlo(); 
    }
    
    //Metodo para llenar el vector y lo imprime sin ordenar...
    public void llenarArrayYImprimirlo(){
      for(int i=0; i<longitud; i++){
          System.out.println("Digite el numero:");
          array[i]=teclado.nextShort();
      } 
      System.out.println("El vector digitado por usted es:\n");
      for(int i=0; i<longitud; i++){
        System.out.println( array[i]);
   }
  } 
    //Metodo donde esta la logica de ordenamiento y lo imprime ya ordenado...
    public void OrdenarArrayYImprimirlo(){
        short temporal=0;
        for (int i=0; i<array.length; i++){
   	  for (int j=i+1; j<array.length; j++){
            if(array[i]>array[j]){
     	       temporal = array[i];
     		array[i] = array[j];
     		 array[j] = temporal;
       }    
     }
   } 
        System.out.println("EL VECTOR ORDENADO ES:\n");
      for(int i=0; i<array.length; i++){  
       System.out.println(array[i]);
      }
  }    
}