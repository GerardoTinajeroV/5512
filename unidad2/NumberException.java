/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;
import javax.swing.JOptionPane;

public class Excepciones1 {

  
    public static void main(String[] args) {
       int x,y;
    try{
       x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:","Solicite datos",3));
       y= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2:","Solicite datos",3));
       JOptionPane.showMessageDialog(null,"La division de " + x + "/" + y + "es " + (x/y), "Mostrando resultado",1);
    }catch (NumberFormatException n){
    System.out.println(n.getMessage() + " No es un Numero Entero");
   
    }catch (ArithmeticException a){
    System.out.println(a.getMessage() + " No se puede dividir entre 0");
    }
    
}
}
