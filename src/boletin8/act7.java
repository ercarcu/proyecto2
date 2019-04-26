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
public class act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //7
        System.out.println("Inserta unas palabras");
        String palabra = s.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
        System.out.println(palabra);
    }
}
