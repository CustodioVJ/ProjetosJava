/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Victt
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        float a = tec.nextFloat();
        float b = tec.nextFloat();
        float c = tec.nextFloat();
        float d = tec.nextFloat();
        float e = tec.nextFloat();
        float m = (a + b + c + d +e)/5;
        System.out.println("Sua média foi " + m);
       
       if(m > 10){
           System.out.println("Parabens, voce passou com " + m);
       } 
       else{
        System.out.println("Poxa, não foi dessa vez! Você foi reprovado com " + m);
    }
    }
    
}
