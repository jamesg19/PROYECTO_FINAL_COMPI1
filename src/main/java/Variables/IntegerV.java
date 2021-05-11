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
public class IntegerV  extends Variable{
    private int valor;
    

    public IntegerV(String nombre, String tipo, boolean global) {
        super(nombre, tipo, global);
    }
    
    public IntegerV() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    

}
