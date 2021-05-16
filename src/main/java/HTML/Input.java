package HTML;

import javax.swing.JOptionPane;

/**
 *
 * @author James Gramajo
 */
public class Input extends Body {

    private String tipo = "";
    private String size = "";
    private String letra = "";
    private String align = "";
    private String id = "";
    private String color = "";
    private String formato = "";
    private String texto="";

    public Input() {
    }

    public Input(String tipo, String size, String letra, String align, String id, String color) {
        this.tipo = tipo;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.id = id;
        this.color = color;
    }

    public String determina_formato_input() {
        String a = "";
        //verificar nulabilidades
        //JOptionPane.showMessageDialog(null,tipo+" "+letra+" "+align+" "+id+" "+color);
        if (size.isEmpty()) {
            size = "10";
        }
        if (letra.isEmpty()) {
            letra = "Verdana";
        }
        if (align.isEmpty()) {
            align = "center";
        }
        if (color.isEmpty()) {
            color = "#3E3A39";
        }else{
            ColorHexa c= new ColorHexa(color);
            color=c.determina_color();
        }

        if (tipo.trim().equalsIgnoreCase("text")) {

            //determina alineacion
            if (align.trim().equalsIgnoreCase("left")) {
                a = genera_text_left();
                return a;
            } else if (align.trim().equalsIgnoreCase("center")) {
                a = genera_text_center();
                return a;
            } else if (align.trim().equalsIgnoreCase("right")) {
                a = genera_text_right();
                return a;
            } else if (align.trim().equalsIgnoreCase("justify")) {
                a = genera_text_justify();
                return a;
            }

        }
        else if (tipo.trim().equalsIgnoreCase("number")) {
            //determina alineacion
            if (align.trim().equalsIgnoreCase("left")) {
                a = genera_text_left();
                return a;
            } else if (align.trim().equalsIgnoreCase("center")) {
                a = genera_text_center();
                return a;
            } else if (align.trim().equalsIgnoreCase("right")) {
                a = genera_text_right();
                return a;
            } else if (align.trim().equalsIgnoreCase("justify")) {
                a = genera_text_justify();
                return a;
            }

        }
        else if(tipo.trim().equalsIgnoreCase("checkbox")|| tipo.trim().equalsIgnoreCase("radio")){
            a =genera_check();
            return a;
        }
        return a;
    }

    private String genera_text_left() {
        formato = "<div class=\"row\">\n"
                + "<div  class=\"col\">\n"
                + "<input id=\"" + id+ "\" type=\"" + tipo + "\" class=\"form-control\"  placeholder=\"" + tipo + "\" style=\"BORDER: " + color + " 1px solid; COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\">"+texto+" </input>\n"
                + "</div>\n"
                + "<div  class=\"col\"></div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "</div>";
        return formato;
    }

    private String genera_text_center() {
        formato = "<div class=\"row\">\n"
                + "<div  class=\"col\"></div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "<div  class=\"col\">\n"
                + "<input id=\"" + id+ "\" type=\"" + tipo + "\" class=\"form-control\"  placeholder=\"" + tipo + "\" style=\"BORDER: " + color + " 1px solid; COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\">"+texto+" </input>\n"
                + "</div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "</div>";
        return formato;
    }

    private String genera_text_right() {
        formato = "<div class=\"row\">\n"
                + "<div  class=\"col\"></div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "<div  class=\"col\">\n"
                + "<input id=\"" + id + "\" type=\"" + tipo + "\" class=\"form-control\"  placeholder=\"" + tipo + "\" style=\"BORDER: " + color + " 1px solid; COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\">"+texto+" </input>\n"
                + "</div>\n"
                + "<div  class=\"col\"> </div>\n"
                + "</div>";
        return formato;

    }

    private String genera_text_justify() {
        formato = "<input id=\"" + id + "\" type=\"" + tipo + "\" class=\"form-control\"  placeholder=\""+tipo+"\" style=\"BORDER: " + color + " 1px solid; COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\">"+texto+" </input>\n";
        return formato;

    }

    private String genera_check() {
        formato = "<div align=\""+align+"\" >\n"
                + "    <input class=\"form-check-input\" type=\""+tipo+"\" id=\""+id+"\" value=\"true\" style=\"BORDER: " + color + " 1px solid; COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >"+texto+" </input>\n"
                + "</div>\n";

        return formato;
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
        this.id = id.substring(1);
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
