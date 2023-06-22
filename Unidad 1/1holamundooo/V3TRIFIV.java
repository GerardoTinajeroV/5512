
package com.mycompany.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V2TRIFIV {

    public static void main(String[] args) throws IOException {
        
        BufferedReader buffEntrada = new BufferedReader(new InputStreamReader(System.in));
        
       int numero =0;
       int mult3;
       int mult5;
       
       System.out.println("Dame el numero:");
       numero = Integer.parseInt(buffEntrada.readLine());
       
       mult3= numero % 3;
       mult5= numero % 5;
        
       
       retornaMultiplo(numero);
    }
    public static String retornaMultiplo(int num){
       int mult3;
       int mult5;
       
       mult3= num % 3;
       mult5= num % 5;
       
       
       if(mult3 ==0 && mult5==0){
           return "TRIFIV";
       }else if (mult3 == 0){
             return "TRI";
       }else if (mult5==0){
             return "FIV";
       }
    return "No es multiplo de 3,5";
       
    }
  
}  
    
            
            
            
            
    

