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
public class LETPAR_NUM extends Metodo {

    private String FORMATO = "function LETPAR_NUM(palabra){\n"
            + "    //RETORNA EL CODIGO ASCII DE LAS LETRAS PARES DE LA PALABRA\n"
            + "    var resultado='';\n"
            + "    for (let i = 0; i < palabra.length; i=i+2) {\n"
            + "        resultado=resultado+palabra.charCodeAt(i) ;\n"
            + "    }\n"
            + "    return resultado;\n"
            + "}\n";

    public LETPAR_NUM() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
