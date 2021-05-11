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
public class Variable {
    private String nombre;
    private String tipo;
    private boolean global;

    public Variable(String nombre, String tipo, boolean global) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.global = global;
    }
    
    /**
     * 
     */
    public Variable() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }
    

}
