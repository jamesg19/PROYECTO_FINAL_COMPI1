/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Variables;

import Script.Metodo;

/**
 * 
 * @author James Gramajo 
 */
public class Asignacion extends Metodo {
    private String constante;
    private String valor;

    public Asignacion(String constante, String valor) {
        this.constante = constante;
        this.valor = valor;
    }

    public Asignacion() {
    }
    
    public String getConstante() {
        return constante;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
    

}
