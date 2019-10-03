
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario DAM 1
 */
public class Comparaciones {

    public static void main(String[] args) {
        /*  String palabra1="Hola";
        String palabra2="HolA";
       boolean comparacionMin=  palabra2.toLowerCase().equals(palabra1.toLowerCase());
       boolean comparacionDirecta= palabra1.equalsIgnoreCase(palabra2);
        boolean comparacion=palabra1.equals(palabra2);
        System.out.println(comparacion);
       int comparacion2= palabra1.compareTo(palabra2);
        System.out.println(comparacionMin);
        System.out.println(comparacionDirecta);
         
        int numero1 = 10;
        int numero2 = 100;
          boolean comparacion = numero1 > 0 && numero2 < 100;
        boolean comparacion2 = numero1 > 0 && numero2 <= 100;
        boolean comparacion3 = numero1 < 0 && numero2 > 100;
        boolean comparacion4 = numero1 < 0 && numero2 < 100;

        System.out.printf("La comparación entre números es: %b%n",
                comparacion);//true y false=false
        System.out.printf("La comparación entre números es: %b%n",
                comparacion2);//true y true=true
        System.out.printf("La comparación entre números es: %b%n",
                comparacion3);//false y true=false
        System.out.printf("La comparación entre números es: %b%n",
                comparacion4);//false y false=false

        boolean comparacionO = numero1 > 0 || numero2 > 100; //true y false
        boolean comparacionO2 = numero1 < 0 || numero2 == 100; //false y true
        boolean comparacionO3 = numero1 > 0 || numero2 == 100; //true y true
        boolean comparacionO4 = numero1 < 0 || numero2 > 100; //false y false
        System.out.println(comparacionO);
         */
 /* int numeroComparar1 = 10;
        int numeroComparar2 = 20;
        String palabra1 = "Ejemplo";
        String palabra2 = "Otro ejemplo";
        boolean comparacionMultiple = numeroComparar1 > numeroComparar2
                || palabra1.equals(palabra2);
        System.out.println(comparacionMultiple);
        boolean comparacionMultiple2 = numeroComparar1 < numeroComparar2
                || palabra1.equals(palabra2);
        System.out.println(comparacionMultiple2);
         */
        int n1 = 10, n2 = 20, n3 = 10;
        String p1 = "uno", p2 = "dos";
        boolean b1 = true, b2 = false;
        boolean salida = (((n1 > 0) && (n2 < 5) && (n3 != 10)) || p1.equals(p2) || b2) && b1;
        System.out.println(salida);

        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce un número");
        num1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce otro número");
        num2 = teclado.nextInt();
        teclado.nextLine();
        int suma = num1 + num2;
        int resta = num1 - num2;
        boolean sumaB = suma >= 0;
        boolean restaB = resta >= 0;
        int multiplo = n2 % n1;
        boolean multiploB = multiplo == 0;
        int multi = num1 * num2;
        boolean multiB = multi > 99;
        boolean comparacion=((suma > 0)&&(resta >= 0)&&(multiplo == 0)&&multi > 99);
        System.out.printf("La suma de los números es positiva: %b%n", sumaB);
        System.out.printf("La resta de los números es positiva: %b%n", restaB);
        System.out.printf("%d es múltiplo de %d: %b%n", num2,num1,multiploB);
        System.out.printf("La multiplicación de %d por %d tiene al menos tres"
                + " cifras:%b%n", num1, num2, multiB);
        System.out.printf("Todas las condiciones se han cumplido: %b%n ",comparacion);
        
        
    }
}
