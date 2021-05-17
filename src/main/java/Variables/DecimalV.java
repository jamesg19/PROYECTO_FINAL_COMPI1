/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Variables;

import Script.Metodo;
import Script.Script;

/**
 * 
 * @author James Gramajo 
 */
public class DecimalV  extends Metodo{
    private String constante="";
    private boolean global=false;
    private String valor="";

    public DecimalV() {
    }

    public String getConstante() {
        return constante;
    }

    public DecimalV(String constante, boolean global, String valor) {
        this.constante = constante;
        this.global = global;
        this.valor = valor;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
    
    

}
