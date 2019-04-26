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
public class act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //2
        String[] array = new String[5];

        array[0] = "Luis";
        array[1] = "Maria";
        array[2] = "Luisa";
        array[3] = "Ana";
        array[4] = "Carlos";

        System.out.println("Inserta frase como filtro");
        String filtro = s.nextLine();

        for (int i = 0; i < 5; i++) {
            if (array[i].startsWith(filtro) == true) {
                System.out.println(array[i]);
            }
        }
    }

}
