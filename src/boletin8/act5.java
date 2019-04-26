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
public class act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //5
        String parrafo = " a b c d e ";

        String filtro = "";

        int pos = 0;
        System.out.println(parrafo);
        do {
            System.out.print("Inserta palabra (salir).... para salir : ");
            filtro = s.nextLine();
            if (filtro.equals("salir")) {
                break;
            }
            String filtro2 = parrafo.replace(filtro, "");
            System.out.println(filtro2);
            parrafo = filtro2;
        } while (!parrafo.trim().equals(""));

    }
}
