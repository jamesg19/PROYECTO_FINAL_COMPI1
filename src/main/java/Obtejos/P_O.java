/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Obtejos;

import HTML.*;

/**
 * 
 * @author James Gramajo 
 */
public class P_O {
    //ont-size, font-family, text-align, id, color.
    private String id="";
    private String letra="";
    private String size="";
    private String align="";
    private String color="";
    private String texto="";
    private String formato="";

    public P_O(String id, String texto, String letra, String align, String color) {
        this.id = id;
        this.texto=texto;
        this.letra = letra;
        this.align = align;
        this.color = color;
    }

    

    public P_O() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
    
}
