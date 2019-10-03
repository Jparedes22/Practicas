
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
public class Conversor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double euros;
        final double DOLARES = 1.09;
        final double LIBRAS = 0.89;
        final double YENS = 117.89;
        euros = teclado.nextInt();
        double conDollar = euros * DOLARES;
        double conLibra = euros * LIBRAS;
        double conyen = euros * YENS;
        System.out.println("Introduce el numero de euros que quieres convertir");

        System.out.printf("%.2f euro(s) son %.2f dólar(es)%n", euros, conDollar);
        System.out.printf("%.2f euro(s) son %.2f yen(es)%n", euros, conLibra);
        System.out.printf("%.2f euro(s) son %.2f libra(s)%n", euros, conyen);

    }
}
