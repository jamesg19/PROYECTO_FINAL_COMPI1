/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Obtejos;

/**
 * 
 * @author James Gramajo 
 */
public class InputO {
    private String tipo = "";
    private String size = "";
    private String letra = "";
    private String align = "";
    private String id = "";
    private String color = "";

    public InputO (String id, String tipo, String size, String letra, String align, String color) {
        this.id = id;
        this.tipo=tipo;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        
    }

    public InputO() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
