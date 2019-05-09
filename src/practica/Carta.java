/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author HP
 */
public class Carta {
    
    private String palo;  //guardo el palo de la baraja de la carta
    private int valor;   //guardo el numero de la carta
    
    public Carta(String palo, int valor){
        
        this.palo=palo;
        this.valor=valor;
        
        
                
    }
    //métodos getters y setters
    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() { //muestra el palo y el valor de la carta
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }
    
}