/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01ejecicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01ejecicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("");
        System.out.println("Ingrese una año");
        
        int año = input.nextInt();
        System.out.println("ingrese mes");
        String mes= input.next();
        
        
        boolean añoBisiesto =
                ((año%4) == 0)&&((año % 100 !=0))||(año % 400 == 0);
        
        //muestra el numero de dias en un mes Biciesto
        System.out.println("mes" + "" + año+ "tiene");
        
        boolean tiene31dias = mes.equals("ene")||
                               mes.equals("mar")||
                                mes.equals("may")||
                                mes.equals("jul")||
                                mes.equals("ago")||
                                mes.equals("oct");
         boolean tiene30dias = mes.equals("abr")||
                               mes.equals("jun")||
                                mes.equals("set")||
                                mes.equals("nov");
                
                            
        if (tiene31dias){
            System.out.println(31 + "dias");
        }
        else if (tiene30dias)
                {
                    System.out.println(30 +" dias");
                    
                }
        else
        {
            System.out.println(((añoBisiesto) ? 29 : 28) + "dias") ;
        }
        
                
        
    }
    
}
