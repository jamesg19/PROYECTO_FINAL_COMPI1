/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HTML;

/**
 * 
 * @author James Gramajo 
 */
public class H1 extends Body {
    private String id="";
    private String size="";
    private String letra="";
    private String align="";
    private String color="";
    private String texto="";
    private String formato="";

    public H1(String id, String texto, String size, String letra, String align, String color) {
        this.id = id;
        this.texto=texto;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
    }

    public H1() {
    }
    public String genera_h1(){
        //c
        if (id.trim().isEmpty()) {
            id = "";
        }
        if (size.trim().isEmpty()) {
            size = " 10";
        }
        if (letra.trim().isEmpty()) {
            letra = "Verdana";
        }
        if (align.trim().isEmpty()) {
            align = "Centro";
        }
        if (color.trim().isEmpty()) {
            color = "";
        }else{
            ColorHexa c= new ColorHexa(color);
            color=c.determina_color();
            
        }
        //cadena_b = cadena_c.substring(5)
        formato="<h1 id=\""+id+"\"  style=\"COLOR:"+color+"; TEXT-ALIGN: "+align+"; FONT-SIZE:"+size+"; FONT-FAMILY: "+letra+"; \" >"+texto+"</h1>";
        return formato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.substring(1);
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
