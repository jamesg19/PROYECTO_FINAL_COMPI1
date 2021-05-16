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
public class P extends Body {
    //ont-size, font-family, text-align, id, color.
    private String id="";
    private String size="";
    private String letra="";
    private String align="";
    private String color="";
    private String texto="";
    private String formato="";

    /**
     * 
     * @param id
     * @param texto
     * @param size
     * @param letra
     * @param align
     * @param color 
     */
    public P(String id, String texto, String size, String letra, String align, String color) {
        this.id = id;
        this.size=size;
        this.texto=texto;
        this.letra = letra;
        this.align = align;
        this.color = color;
    }

    public P() {
    }
    
    public String genera_p(){
        if(id.trim().isEmpty()){
            id="";
        }
        if(letra.trim().isEmpty()){
            letra="Verdana";
        }
        if(size.trim().isEmpty()){
            size="12";
        }
        if(align.trim().isEmpty()){
            align="center";
        }
        if(texto.trim().isEmpty()){
            texto=" ";
        }
        if(color.trim().isEmpty()){
            color="#3E3A39";
        } else{
            ColorHexa c= new ColorHexa(color);
            color=c.determina_color();
        }
        
        
        
        formato="<p id=\""+id+"\" style=\" COLOR:"+color+"; TEXT-ALIGN: "+align+"; FONT-SIZE:"+size+"; FONT-FAMILY:"+letra+"; \" >"+texto+"</p>\n";
        
        
        return formato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.substring(1);
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
