/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class Conversiones {

    public static void main(String[] args) {

       byte numeroByte = 56;
       // System.out.printf("El valor del byte es %d%n", numeroByte);
        long numeroLong = (long) numeroByte;
        //System.out.printf("El valor del long es %d%n", numeroLong);
        int numeroInt=5;
        double numeroDouble=(double)numeroInt;
       // System.out.printf("El valor del integer es %d%n",numeroInt);
       // System.out.printf("El valor del double es %.2f%n",numeroDouble);
        
        String palabra="1";
     //   System.out.printf("El valor de la palabra es %s%n",palabra);
        int numeroPalabra=Integer.parseInt(palabra);
      //  System.out.printf("El valor del numero es %d%n",numeroPalabra);
        
        int numeroPalabra2=123;
        boolean acierto=false;
        String palabraNumero=String.valueOf(acierto);
         System.out.printf("El valor de la palabra es %b%n",palabraNumero);
        
        
    }
}
