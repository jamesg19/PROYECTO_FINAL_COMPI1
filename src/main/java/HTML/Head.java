/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HTML;

/**
 * 
 * @author James Gramajo 
 */
public class Head extends Html {
    private String formato;

    public Head() {
    }
    public String formato_head_ABRE(){
        formato="";
        formato="<head>\n";
        return formato;
    }
    public String formato_head_CIERRA(){
        formato="";
        formato="</head>\n";
        return formato;
    }
    
    

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
    
    
    

}
