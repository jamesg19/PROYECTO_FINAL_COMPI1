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
public class S {

    private String FORMATO = "<script>\n"
            + "function ASC(palabra){\n"
            + "return palabra.split(\"\").sort().join(\"\");}\n"
            + "function DESC(palabra){\n"
            + "return palabra.split(\"\").sort().reverse().join(\"\");}\n"
            + "function LETPAR_NUM(palabra){\n"
            + "    var resultado='';\n"
            + "    for (let i = 0; i < palabra.length; i=i+2) {\n"
            + "        resultado=resultado+palabra.charCodeAt(i) ;\n"
            + "    }\n"
            + "    return resultado;}\n"
            + "function LETIMPAR_NUM(palabra){\n"
            + "    var resultado='';\n"
            + "    for (let i = 1; i < palabra.length; i=i+2) {\n"
            + "        resultado=resultado+palabra.charCodeAt(i) ;\n"
            + "    } return resultado;}\n"
            + "function REVERSE(b){\n"
            + "    return b.split(\"\").reverse().join(\"\");\n"
            + "};\n"
            + "function CARACTER_ALEATORIO(){\n"
            + "    var letras='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';\n"
            + "    var text = letras.charAt(Math.floor(Math.random() * letras.length));\n"
            + "    return text;}\n"
            + "function NUM_ALEATORIO(){\n"
            + "    //Math.floor(Math.random() * (max - min)) + min;\n"
            + "    var num=Math.floor(Math.random() * (9 - 0)) + 0;\n"
            + "    return num;}\n"
            + "</script>\n";

    public S() {
    }
    

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
