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
public class ASC extends Metodo {

    private String FORMATO = "function ASC(palabra){\n"
            + "//metodo ASC\n"
            + "return palabra.split(\"\").sort().join(\"\");\n"
            + "}\n";

    public ASC() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }
    
    
    
    

}
