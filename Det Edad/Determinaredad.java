
package com.mycompany.determinaredad;
import java.util.Scanner;
public class Determinaredad {

    public static void main(String[] args) {
       
        Scanner Eddd = new Scanner(System.in);
        
        System.out.println("Ingresa la edad:");
        int edad = Eddd.nextInt();
        
        Persona persona = new Persona(edad);
        
        String resultado;
        if (persona.Mayordedad()) {
            resultado = "Mayor de edad";
        } else {
            resultado = "Menor de edad";
        }
        
        System.out.println(resultado);
        
        
    }
}
