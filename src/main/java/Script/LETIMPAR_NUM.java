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
public class LETIMPAR_NUM extends Script {

    private String FORMATO = "function LETIMPAR_NUM(palabra){\n"
            + "    //RETORNA EL CODIGO ASCII DE LAS LETRAS IMPARES DE LA PALABRA\n"
            + "    var resultado='';\n"
            + "    for (let i = 1; i < palabra.length; i=i+2) {\n"
            + "        resultado=resultado+palabra.charCodeAt(i) ;\n"
            + "    }\n"
            + "    return resultado;\n"
            + "}\n";

    public LETIMPAR_NUM() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
