/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTML;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author James Gramajo
 */
public class Spam extends Body {

    private String formato="";
    private String alineacion="";
    private String letra="";
    private String size="";
    private String color="";
    private String id="";
    ArrayList<Body> lstBody = new ArrayList();

    private String texto="";

    public Spam() {
    }

    public Spam(String alineacion, String letra, String size, String color, String id, String texto) {
        this.alineacion = alineacion;
        this.letra = letra;
        this.size = size;
        this.color = color;
        this.id = id;
        this.texto = texto;
       
    }

    
    
    
    public void genera_spam() {
        //valores por defecto
        if (alineacion.isBlank()) {
            alineacion = "center";
        }  
        if (letra.isEmpty()) {
            letra = "Verdana";
        } 
        if (size.isEmpty()) {
            letra = "8";
        } 
        if (color.isEmpty()) {
            color = "#3E3A39";
        }
        if(!color.isEmpty()){
            ColorR cl= new ColorR(color);
            color= cl.determina_color();
        }
        
        //valores por defecto<>

        formato = "<div align=\""+alineacion+"\" >\n"
                + "<span id=\""+id+"\" ><font size =\""+size+"\" face=\""+letra+"\" color=\""+color+"\" >"+texto+"</font></span>\n"
                + "</div>\n";

    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.substring(1);
    }
    

}
