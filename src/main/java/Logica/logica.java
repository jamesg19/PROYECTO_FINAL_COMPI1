/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Analizadoress.LexerCup;
import Analizadoress.parser;
import Archivos.GestorArchivo;
import HTML.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James Gramajo
 */
public class logica {

    ArrayList<Html> listaDatos = new ArrayList<>();
    ArrayList<String> lexERROR = new ArrayList<String>();
    ArrayList<String> sintaxERROR = new ArrayList<String>();
    ArrayList<String> semantico = new ArrayList<String>();
    GeneraHtml gg;

    private String informe_error = "";

    public logica() {
    }

    public void analizar(String entrada) {
        //JOptionPane.showMessageDialog(null, ma);
        try {
            StringReader entradaa = new StringReader(entrada);
            System.out.println(entrada);
            System.out.println("\n\n\n\n\n");
            LexerCup lexer = new LexerCup(entradaa);
            //obtengo los errores lexicos
            lexERROR = lexer.getLexError();
            parser parse = new parser(lexer);
            parse.parse();
            sintaxERROR = parse.getSintaxError();

            //obtengo los datos recopilados y los guardo en la ArrayList <Html>
            listaDatos = parse.getLISTAHTML();
            try {
                GeneraHtml g = new GeneraHtml();
                g.generahtml(listaDatos);
                analisisSemantico(g);
                gg=g;
            } catch (Exception e) {
                System.out.println("Error en generar archivo .jsp" + e);

            }

            if (lexERROR.isEmpty() && sintaxERROR.isEmpty() && semantico.isEmpty()) {
                //analisis de semantica
                generarCaptcha(gg);
            } else {
                generar_informe_errores();
            }

            //obtengo los errores sintacticos
        } catch (Exception ex) {
            System.out.println("");
            Logger.getLogger(logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void analisisSemantico(GeneraHtml g) {

        semantico = g.getID_duplicado();

    }

    public void generarCaptcha(GeneraHtml g) {
        String formato = g.getFORMATO();
        generarArchivo(formato, "captcha.jsp");

    }

    public void generarArchivo(String formato, String nombre) {
        try {
            GestorArchivo gst = new GestorArchivo();
            gst.GuardarJSP(formato, nombre);
        } catch (Exception e) {
            System.out.println("Error en generar archivo .jsp" + e);

        }
    }

    public void generar_informe_errores() {
        //analisis semantico de errores lexicos
        for (int i = 0; i < lexERROR.size(); i++) {
            informe_error += lexERROR.get(i);
        }
        //analisis semantico de sintaxis
        for (int i = 0; i < sintaxERROR.size(); i++) {
            informe_error += sintaxERROR.get(i);
        }
        //analisis semantico de ID duplicados
        for (int i = 0; i < semantico.size(); i++) {
            informe_error += semantico.get(i);
        }
    }

    public ArrayList<Html> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(ArrayList<Html> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public ArrayList<String> getLexERROR() {
        return lexERROR;
    }

    public void setLexERROR(ArrayList<String> lexERROR) {
        this.lexERROR = lexERROR;
    }

    public ArrayList<String> getSintaxERROR() {
        return sintaxERROR;
    }

    public void setSintaxERROR(ArrayList<String> sintaxERROR) {
        this.sintaxERROR = sintaxERROR;
    }

    public String getInforme_error() {
        return informe_error;
    }

    public void setInforme_error(String informe_error) {
        this.informe_error = informe_error;
    }

    public ArrayList<String> getId_duplicado() {
        return semantico;
    }

    public void setId_duplicado(ArrayList<String> semantico) {
        this.semantico = semantico;
    }

}
