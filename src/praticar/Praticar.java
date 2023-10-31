
package praticar;

import java.util.Scanner;


public class Praticar {


    public static void main(String[] args) {
        
        Double Respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, estoy empezando de cero");
        
        System.out.println("Mira");
        System.out.println("Cuantos años tienes?");
        
            Respuesta = entrada.nextDouble();
            
            if(Respuesta <18  ){
                System.out.println("Eres menor de edad");
            }
            else if(Respuesta >= 18){
                System.out.println("Puedes seguir");
            }
        
       
        System.out.println("Saludos papito");
    }
}
