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
public class SpamO {
    private String alineacion="";
    private String letra="";
    private String size="";
    private String color="";
    private String id="";
    private String texto="";

    public SpamO(String alineacion, String letra, String size, String color, String id, String texto) {
        this.alineacion = alineacion;
        this.letra = letra;
        this.size = size;
        this.color = color;
        this.id = id;
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
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
