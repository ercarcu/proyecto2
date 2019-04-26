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
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //1
        System.out.println("Inserta cadena 1");
        String uno = s.nextLine();
        System.out.println("Inserta cadena 2");
        String dos = s.nextLine();

        int nuno = uno.length();
        int ndos = dos.length();

        if (nuno > ndos) {
            System.out.println("La cadena 1 es mayor que la 2");
            System.out.println(uno);
            System.out.println("Y tiene " + nuno + " caracteres");
        }
        if (nuno < ndos) {
            System.out.println("La cadena 2 es mayor que la 1");
            System.out.println(dos);
            System.out.println("Y tiene " + ndos + " caracteres");
        }
        if (nuno == ndos) {
            System.out.println("La cadena 1 es igual que la 2");
            System.out.println(dos);
            System.out.println(uno);
            System.out.println("La 1 y 2 tiene " + ndos + " caracteres");
        }

    }

}
