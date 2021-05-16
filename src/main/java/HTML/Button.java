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
public class Button extends Body {

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

    public Button() {
    }

    public Button(String id,String texto, String size, String letra, String align, String color, String background, String onclick) {
        this.id = id;
        this.texto=texto;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.background = background;
        this.onclick = onclick;
    }

    public String genera_button() {
        //determina parametros nulos
        if (id.trim().isEmpty()) {
            id = "";
        }
        if (size.trim().isEmpty()) {
            size = "";
        }
        if (letra.trim().isEmpty()) {
            letra = "";
        }
        if (align.trim().isEmpty()) {
            align = "";
        }
        if (onclick.trim().isEmpty()) {
            onclick = "";
        }
        if (background.trim().isEmpty()) {
            background = "";
        } else{
            ColorR c= new ColorR(background);
            background=c.determina_color();
        }
        if (color.trim().isEmpty()) {
            color = "";
        } else{
            ColorHexa c= new ColorHexa(color);
            color=c.determina_color();
        }
        
        formato = "<div align=\""+align+"\" >\n"
                + "<button id=\""+id+"\" onclick=\""+onclick+"\"  class=\"btn\" type=\"button\" "+background+" style=\" COLOR:"+color+"; TEXT-ALIGN: left; FONT-SIZE:"+size+"; FONT-FAMILY:"+letra+"; \"> "+texto+"</button>\n"
                + "</div>\n";

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
