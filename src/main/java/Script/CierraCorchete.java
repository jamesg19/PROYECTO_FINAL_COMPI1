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
public class CierraCorchete {
    private String FORMATO="";
    private String nombre="";

    public CierraCorchete(String nombre) {
        this.nombre=nombre;
        
    }
    public String genera_cierre(){
        FORMATO="}";
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
