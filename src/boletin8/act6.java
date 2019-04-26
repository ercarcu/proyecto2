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
public class act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //6
        String parrafo = s.nextLine();

        String filtro = "";
        String filtro2 = "";
        int pos = 0;
        System.out.println(parrafo);
        do {
            System.out.print("Inserta palabra a reemplazar: ");
            filtro = s.nextLine();
            System.out.print("Inserta palabra para reemplazar: ");
            filtro2 = s.nextLine();
            if (filtro.equals("salir")) {
                break;
            }
            parrafo = parrafo.replace(filtro, filtro2);
            System.out.println(parrafo);
        } while (!parrafo.trim().equals(""));

    }
}
