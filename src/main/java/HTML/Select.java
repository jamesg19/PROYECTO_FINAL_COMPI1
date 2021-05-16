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
public class Select extends Body {

    private String id = "";
    private String size = "";
    private String letra = "";
    private String align = "";
    private String color = "";
    private String formato = "";
    private String opciones = "";

    public Select() {
    }

    public Select(String id, String size, String letra, String align, String color, String opciones) {
        this.id = id;
        this.size = size;
        this.letra = letra;
        this.align = align;
        this.color = color;
        this.opciones = opciones;
    }

    public String generar_select() {
        if (size.isEmpty()) {
            size = "10";
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
        //determina la alineacion
        if (align.trim().equalsIgnoreCase("left")) {
            formato = select_left();
        } else if (align.trim().equalsIgnoreCase("center")) {
            formato = select_center();
        } else if (align.trim().equalsIgnoreCase("right")) {
            formato = select_rigth();
        } else if (align.trim().equalsIgnoreCase("justify")) {
            formato = select_justify();
        }

        return formato;
    }

// <option>1</option>
    private String select_left() {
        String a = "<div class=\"row\">\n"
                + "    <div class=\"col\"> \n"
                + "        <select class=\"form-control\" id=\"" + id + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n";

        a += separa_opciones();
        a += cierra_left();
        return a;
    }

    private String cierra_left() {
        String b = "        </select>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";

        return b;
    }

    private String select_rigth() {
        String a = "<div class=\"row\">\n"
                + "    <div class=\"col\"></div>\n"
                + "    <div class=\"col\"></div>\n"
                + "    <div class=\"col\"> \n"
                + "        <select class=\"form-control\" id=\"" + id + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n";

        a += separa_opciones();
        a += cierra_right();
        return a;
    }

    private String cierra_right() {
        String b = "        </select>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";

        return b;
    }

    private String select_center() {
        String a = "<div class=\"row\">\n"
                + "    <div class=\"col\"></div>"
                + "    <div class=\"col\"> \n"
                + "        <select class=\"form-control\" id=\"" + id + "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n";

        a += separa_opciones();
        a += cierra_center();
        return a;
    }

    private String cierra_center() {
        String b = "        </select>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";

        return b;
    }

    private String select_justify() {
        String a = "<div class=\"row\">\n"
                + "    <div class=\"col\"></div>"
                + "    <div class=\"col\"> \n"
                + "        <select class=\"form-control\" id=\"" + id+ "\" style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\" >\n";

        a += separa_opciones();
        a += cierra_justify();
        return a;
    }

    private String cierra_justify() {
        String b = "        </select>\n"
                + "    </div>\n"
                + "    <div class=\"col\"></div>\n"
                + "</div>\n";

        return b;
    }

    //separa las opciones por coma
    private String separa_opciones() {
        String opt = opciones;
        String texto;
        String[] parts = opt.split(",");
        texto = genera_opctiones(parts);
        return texto;
    }

    //genera e formato <option> en html
    private String genera_opctiones(String[] parts) {
        String c = "";
        for (int i = 0; i < parts.length; i++) {
            c += " <option style=\" COLOR:" + color + "; FONT-SIZE: " + size + "pt; FONT-FAMILY: " + letra + ";\"  >" + parts[i].toString() + "</option>\n";
        }
        return c;
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

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

}
