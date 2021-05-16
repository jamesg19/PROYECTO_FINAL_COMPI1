/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HTML;

import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class DivC extends Body {
    private String id="";
    private String size="";
    private String letra="";
    private String align="";
    private String color="";
    private String background="";
    private String classs="";
    private String formato="";
    private ArrayList<Body> listDiv = new ArrayList();
    
    
    public DivC() {
    }

    public DivC(String id, String size, String letra, String align, String color, String background, String classs) {
        this.id = id;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.background = background;
        this.classs = classs;
    }
    
    
    public void genera_div(){
         if (size.isEmpty()) {
            size = "10";
        }
        if (letra.isEmpty()) {
            letra = "Verdana";
        }
        if (align.isEmpty()) {
            align = "center";
        }
        if (id.isEmpty()) {
            id = "";
        }
        
        if (background.isEmpty()) {
            background = "#ffffff";
        }else{
            ColorR c= new ColorR(background);
            background=c.determina_color();
            System.out.println("llega");
            System.out.println(background);
        }
        if (color.isEmpty()) {
            color = "COLOR:#3E3A39;";
        }else{
            ColorHexa c= new ColorHexa(color);
            color=c.determina_color();
            
        }
        if (classs.isEmpty()) {
            classs = "";
        } else{
            classs = "class=\""+classs+"\"";
        }
    }
    
    public String genera_abre_div(){
        formato="<div id=\""+id+"\" "+classs+" align=\""+align+"\" "+background+" style=\" "+color+" FONT-SIZE:"+size+"; FONT-FAMILY:"+letra+"; \" >\n";
        return formato;
    }
    public String genera_cierra_div(){
        formato="</div>\n";
        
        return formato;
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

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public ArrayList<Body> getListDiv() {
        return listDiv;
    }

    public void setListDiv(ArrayList<Body> listDiv) {
        this.listDiv = listDiv;
    }

    
    
    
    
}
