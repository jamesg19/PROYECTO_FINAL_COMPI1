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
public class CARACTER_ALEATORIO extends Script {

    private String FORMATO = "function CARACTER_ALEATORIO(){\n"
            + "    //RETORNA UN CARACTER ALEATORIO A-Z Y a-z\n"
            + "    var letras='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';\n"
            + "    var text = letras.charAt(Math.floor(Math.random() * letras.length));\n"
            + "    return text;\n"
            + "}\n";

    public CARACTER_ALEATORIO() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
