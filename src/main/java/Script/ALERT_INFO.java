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
public class ALERT_INFO extends Metodo {

    private String FORMATO = "function ALERT_INFO(mensaje){\n"
            + "    alert(mensaje);\n"
            + "}\n";

    public ALERT_INFO() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
