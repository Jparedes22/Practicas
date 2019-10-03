
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
public class BarAvanzado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bebidas;
        System.out.println("Introduce un número de bebidas entre 0 y 20");
        bebidas = teclado.nextInt();
        double precioBe;
        System.out.println("Introduce el precio de las bebidas entre 0,00 y 3,00");
        precioBe = teclado.nextDouble();
        int bocadillos;
        System.out.println("Introduce un número de bocadillos entre 0 y 20");
        bocadillos = teclado.nextInt();
        double precioBo;
        System.out.println("Introduce el precio de las bebidas entre 0,00 y 3,00");
        precioBo = teclado.nextDouble();
        double costeBe = bebidas * precioBe;
        double costeBo = bocadillos * precioBo;
        int alumnos;
        double total = costeBe + costeBo;
        System.out.println("Introduce el número de alumnos entre 1 y 10");
        alumnos = teclado.nextInt();
        double cantidad = total / alumnos;
        System.out.println("ARTICULO     CANTIDAD PRECIO  COSTE");
        System.out.printf("Bebidas        %d       %.2f      %.2f%n", bebidas, precioBe, costeBe);
        System.out.printf("Bocadillos     %d       %.2f      %.2f%n", bocadillos, precioBo, costeBo);
        System.out.println("--------------------------------------------------");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Cantidad por alumno:%.2f%n", cantidad);

    }
}
