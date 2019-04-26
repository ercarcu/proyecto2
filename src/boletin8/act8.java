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
public class act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //8
        System.out.println("Inserta una cadena");
        String palabra = s.nextLine();
        String palabra01 = palabra;
        System.out.println("Inserta otra cadena");
        String palabra2 = s.nextLine();
        String palabra02 = palabra2;
        palabra = palabra.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        palabra = palabra.trim();
        palabra2 = palabra2.trim();

        if (palabra.equals(palabra2)) {
            System.out.println("La cadena: \n" + palabra01 + "\n" + palabra02 + "\nSon iguales.");
        } else {
            System.out.println("La cadena: \n" + palabra01 + "\n" + palabra02 + "\nSon diferentes.");
        }

    }
}
