/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.v2trifiiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerar
 */
public class V2trifivv {

      public static void main(String[] args) throws IOException {
        
        BufferedReader buffEntrada = new BufferedReader(new InputStreamReader(System.in));
        
       int numero =0;
       int mult3;
       int mult5;
       
       System.out.println("Dame el numero:");
       numero = Integer.parseInt(buffEntrada.readLine());
       
       mult3= numero % 3;
       mult5= numero % 5;
       
       
       if(mult3 ==0 && mult5==0){
           System.out.println("TRIFIV");
       }else if (mult3 == 0){
            System.out.println("TRI");
       }else if (mult5==0){
            System.out.println("FIV");
       }
    
       
    }
}
