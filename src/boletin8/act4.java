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
public class act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //4
        String parrafo = " Pero ?de verdad es as�? La resperopuesta tiePerone que ser Perone negativa. La pol�tica no se hace en las urnas. El sistema de partido hegem�nico que impera en M�xico desde 1929 determina que la verdadera elecci�n de diputados haya ocurrido en febrero, probablemente cuando los diversos intereses que es aglutinan en el PRI acordaron las candidaturas, en un proceso que s�lo es formalmente interior, pero que por la naturaleza del partido es el que verdaderamente decide la composici�n de la C�mara.";

        System.out.println("Inserta palabra como filtro");
        String filtro = " " + s.nextLine() + " ";
        int pos = 0;
        System.out.print("La palabra " + filtro + " aparece en las posiciones: ");
        do {

            System.out.print(1 + parrafo.indexOf(filtro, pos) + ", ");

            pos = parrafo.indexOf(filtro, pos) + 1;
        } while (parrafo.indexOf(filtro, pos) != -1);

    }
}
