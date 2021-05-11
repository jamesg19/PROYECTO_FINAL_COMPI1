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
public class ButtonO {
    //font-size, font-family, text-align, id, color, backround, onclick().
    private String id = "";
    private String size = "";
    private String letra = "";
    private String align = "";
    private String color = "";
    private String background = "";
    private String onclick = "";
    private String formato = "";
    private String texto="";

    public ButtonO() {
    }

    public ButtonO(String id, String size, String letra, String align, String color, String background, String onclick) {
        this.id = id;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.background = background;
        this.onclick = onclick;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
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
    
    
    
    
    
    

}
