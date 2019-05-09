/*Escribe un programa que genere una secuencia de 5 cartas de la baraja
española y que sume los puntos según el juego de la brisca. El valor de las
cartas se debe guardar en una estructura HashMap que debe contener parejas
(figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
4; el resto de cartas no vale nada.
 * 
 */
package practica;

        
import java.util.ArrayList;

import java.util.HashMap;

public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Carta> c = new ArrayList<Carta>();

        HashMap<String, Integer> h = new HashMap<String, Integer>();

        int puntos = 0;

        h.put("As", 11);

        h.put("dos", 0);

        h.put("Tres", 10);

        h.put("cuatro", 0);

        h.put("cinco", 0);

        h.put("seis", 0);

        h.put("siete", 0);

        h.put("Sota", 2);

        h.put("Caballo", 3);

        h.put("Rey", 4);

        String figura = "";
        int numero = 0;
        String valor = "";

        Carta naipe = new Carta(figura, numero);

        for (int i = 0; i < 5; i++) {

            numero = (int) (Math.random() * 12) + 1;
            int azar = (int) (Math.random() * 4) + 1;
            switch (azar) {
                case 1:
                    figura = "espadas";
                    break;
                case 2:
                    figura = "bastos";
                    break;
                case 3:
                    figura = "oros";
                    break;
                case 4:
                    figura = "copas";
                    break;
            }
            switch (numero) {
                case 1:
                    valor = "As";
                    break;
                case 2:
                    valor = "dos";
                    break;
                case 3:
                    valor = "Tres";
                    break;
                case 4:
                    valor = "cuatro";
                    break;
                case 5:
                    valor = "cinco";
                    break;
                case 6:
                    valor = "seis";
                    break;
                case 7:
                    valor = "siete";
                    break;
                case 10:
                    valor = "Sota";
                    break;
                case 11:
                    valor = "Caballo";
                    break;
                case 12:
                    valor = "Rey";
                    break;
            }
            System.out.print(figura);
            System.out.println(" "+valor);
            naipe = new Carta(figura, numero);

            c.add(naipe);

            for (HashMap.Entry pareja : h.entrySet()) {
               //si es igual el numero del naipe obtenido al key del hashmap
               if(valor.equals(pareja.getKey())){
                    puntos += (int)pareja.getValue();
                }
            }
            //puntos += h.get(valor);
        }

        for (Carta Carta : c) {

            System.out.println(Carta);

            //puntos += h.get(valor);
        }

        System.out.println("Tienes " + puntos + " puntos.");

    }

}
