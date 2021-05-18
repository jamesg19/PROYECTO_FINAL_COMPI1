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
public class IF extends Metodo {
    private String condicion;
    private String FORMATO;

    public IF(String condicion) {
        this.condicion=condicion;
    }

    public IF() {
    }
    
    public String generaIF(){
       
        return FORMATO="if("+condicion+"){";
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }
    
    
    
    

}
