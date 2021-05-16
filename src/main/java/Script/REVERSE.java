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
public class REVERSE extends Script {

    private String FORMATO = "function REVERSE(b){\n"
            + "//metodo REVERSE\n"
            + " return b.split(\"\").reverse().join(\"\");\n"
            + "};\n";

    public REVERSE() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
