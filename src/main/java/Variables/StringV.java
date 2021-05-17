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
public class StringV  extends Metodo{
    private String constante="";
    private boolean global=false;
    private String valor="";
    private String element="";
    //document.getElementById("intro");

    public StringV(String constante, boolean global, String valor, String element) {
        this.constante = constante;
        this.global = global;
        this.valor = valor;
        this.element = element;
    }

    public StringV() {
    }

    

    public String getConstante() {
        return constante;
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

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }
    
    
    
    
    

}
