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
public class DESC extends Metodo {

    private String FORMATO = "function DESC(palabra){\n"
            + "//metodo DESC\n"
            + "return palabra.split(\"\").sort().reverse().join(\"\");\n"
            + "}\n";

    public DESC() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
