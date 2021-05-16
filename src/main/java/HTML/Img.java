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
public class Img extends Body{
    private String id;
    private String src;
    private String width;
    private String height;
    private String alt;
    private String texto="";
    private String formato="";
    
    public Img() {
    }

    public Img(String id, String src, String width, String height, String alt) {
        this.id = id;
        this.src = src;
        this.width = width;
        this.height = height;
        this.alt = alt;
    }
    
    public String generar_img(){
        formato="<figure>\n"
                + "<img class=\"img-thumbnail\" id=\""+id.substring(1)+"\" alt=\""+alt+"\" src=\""+src+"\" width=\""+width+"\" height=\""+height+"\"  >"+"\n"
                + "<figcaption>"+alt+"</figcaption>"
                + "</figure>\n";

        return formato;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.substring(1);
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
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
