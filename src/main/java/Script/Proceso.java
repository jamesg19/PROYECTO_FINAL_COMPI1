/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Script;

/**
 * 
 * @author James Gramajo 
 */
public class Proceso extends Script {
    private String FORMATO="";
    private String nombre="";

    public Proceso() {
        
    }
    
    public String genera_proces_A(){
        FORMATO="function "+nombre+"{ ";
        return FORMATO;
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    

}
