
package ejercicioindividual;

import java.util.Scanner;


public class EjercicioIndividual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    float sueldo;
    Scanner sueldoM = new Scanner(System.in);
    System.out.println("");
    System.out.println("\t Ingrese su sueldo mensual ");
    sueldo=sueldoM.nextFloat();
        if(sueldo>0 && sueldo<=200){
            System.out.println("Su categoria es : 4");
            System.out.println("Su sueldo aumentara en un 7%");
            sueldo=(float) (sueldo+(sueldo*0.07));
            System.out.println("Su nuevo sueldo es: $"+sueldo);
        }else if(sueldo>200 && sueldo<=400){
            System.out.println("Su categoria es : 3");
            System.out.println("Su sueldo aumentara en un 8%");
            sueldo=(float) (sueldo+(sueldo*0.07));
            System.out.println("Su nuevo sueldo es: $"+sueldo);            
        }else if(sueldo>400 && sueldo<=600){
            System.out.println("Su categoria es : 2");
            System.out.println("Su sueldo aumentara en un 10%");
            sueldo=(float) (sueldo+(sueldo*0.10));
            System.out.println("Su nuevo sueldo es: $"+sueldo);            
        }else if(sueldo<600){
            System.out.println("Su categoria es : 1");
            System.out.println("Su sueldo aumentara en un 15%");
            sueldo=(float) (sueldo+(sueldo*0.15));
            System.out.println("Su nuevo sueldo es: $"+sueldo);            
        }

      

    
    
  

    }
    
}
