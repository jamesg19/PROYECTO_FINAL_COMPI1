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
public class SelectO {
    
    private String id="";
    private String size="";
    private String letra="";
    private String align="";
    private String color="";
    private String opciones="";

    public SelectO(String id, String size, String letra, String align, String color, String opciones) {
        this.id = id;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.opciones = opciones;
    }

    public SelectO() {
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

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
    
    
    
    

}
