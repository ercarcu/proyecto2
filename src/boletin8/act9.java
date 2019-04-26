/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8;

import java.util.Scanner;

/**
 *
 * @author Emilio Manuel Bernal
 */
public class act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //9
        System.out.println("Inserta una cadena");
        String palabra = s.nextLine();
        System.out.println("Inserta un número entre 1 y 25");
        int cara;
        int car;

        do {
            car = s.nextInt();
        } while (car <= 0 | car > 25);

        for (int i = 0; i < palabra.length(); i++) {

            cara = ((int) palabra.charAt(i) + car);
            System.out.print(cara + " ");
        }

    }
}
