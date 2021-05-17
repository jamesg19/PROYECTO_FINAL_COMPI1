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
public class NUM_ALEATORIO extends Metodo {

    private String FORMATO = "function NUM_ALEATORIO(){\n"
            + "    //Math.floor(Math.random() * (max - min)) + min;\n"
            + "    var num=Math.floor(Math.random() * (9 - 0)) + 0;\n"
            + "    return num;\n"
            + "}\n";

    public NUM_ALEATORIO() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
