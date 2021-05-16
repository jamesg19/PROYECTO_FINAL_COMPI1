/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Variables;

/**
 * 
 * @author James Gramajo 
 */
public class BooleanV  extends Variable{
    private String constante="";
    private boolean global=false;
    private String valor="";

    public BooleanV() {
    }

    public BooleanV(String constante, boolean global, String valor) {
        this.constante = constante;
        this.global = global;
        this.valor = valor;
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
    
    
    
    
    

}
