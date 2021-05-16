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
public class TextArea extends Body {

    private String id="";
    private String size="";
    private String letra="";
    private String align="";
    private String color="";
    private String formato;
    private String cols="";
    private String rows="";
    private String texto="";

    public TextArea() {
    }

    public TextArea(String id, String size, String letra, String align, String color, String cols, String rows) {
        this.id = id;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.cols = cols;
        this.rows = rows;
    }

    public String generatext() {
        if (size.isEmpty()) {
            size = "10px";
        }
        if (letra.isEmpty()) {
            letra = "Arial";
        }
        if (align.isEmpty()) {
            align = "center";
        }
        if (color.isEmpty()) {
            color = "#3E3A39";
        } else {
            ColorHexa c = new ColorHexa(color);
            color = c.determina_color();
        }

        if (align.trim().equalsIgnoreCase("left")) {
            formato = text_left();

            return formato;

        } else if (align.trim().equalsIgnoreCase("center")) {
            formato = text_center();

            return formato;

        } else if (align.trim().equalsIgnoreCase("right")) {
            formato = text_right();

            return formato;

        } else if (align.trim().equalsIgnoreCase("justify")) {
            formato = text_justify();

            return formato;

        }
        return formato;
    }

    /*
    
    <div class="row">
    <div class="col"></div>
    <div class="col"> 
    <textarea  class="form-control" id="exampleFormControlTextarea1" cols="5" rows="3" style=" COLOR:#9b590e; FONT-SIZE: 12pt; FONT-FAMILY: Arial;" >
    </textarea>
    </div>
    <div class="col"></div>
</div>
     */
    private String text_left() {
        String a;
        a = "<div class=\"row\">\n"
                + "    <div class=\"col\"> \n"
                + "    <textarea  class=\"form-control\" id=\"" + id + "\" cols=\"" + cols + "\" rows=\"" + rows + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "; FONT-FAMILY: " + letra + ";\" >\n"
                + "    </textarea>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";
        return a;
    }

    private String text_center() {
        String a;
        a = "<div class=\"row\">\n"
                + "    <div class=\"col\"></div>\n"
                + "    <div class=\"col\"> \n"
                + "    <textarea  class=\"form-control\" id=\"" + id+ "\" cols=\"" + cols + "\" rows=\"" + rows + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "; FONT-FAMILY: " + letra + ";\" >\n"
                + "    </textarea>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";
        return a;
    }

    private String text_right() {
        String a;
        a = "<div class=\"row\">\n"
                + "    <div class=\"col\"></div>\n"
                + "    <div class=\"col\"> \n"
                + "    <textarea  class=\"form-control\" id=\"" + id + "\" cols=\"" + cols + "\" rows=\"" + rows + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n"
                + "    </textarea>\n"
                + "    </div>\n"
                + "</div>\n";
        return a;
    }
    private String text_justify() {
        String a;
        a = "<div class=\"row\">\n"
                + "    <div class=\"col\"> \n"
                + "    <textarea  class=\"form-control\" id=\"" + id + "\" cols=\"" + cols + "\" rows=\"" + rows + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n"
                + "    </textarea>\n"
                + "    </div>\n"
                + "</div>\n";
        return a;
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

    public String getCols() {
        return cols;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
