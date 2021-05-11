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
public class ColorR {
/*
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    
    */
    private String formato="";
    private String color="";
    private String codigoColor="";
    
    public ColorR(String color) {
        this.color = color;
    }
    //style="background-color:;"
    public String determina_color() {
        if(color.isEmpty()){
            formato=" ";
        }
        
        else if (isHexa(color)) {
            formato = "style=\"background-color:"+color+";\"";
        } 
        else {
            if (color.trim().equalsIgnoreCase("black")) {
                codigoColor = "#3E3A39";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("olive")) {
                codigoColor = "#486B2E";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("teal")) {
                codigoColor = "#62FFF4";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("red")) {
                codigoColor = "#C45C4F";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("blue")) {
                codigoColor = "#2A8ACE";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("maroon")) {
                codigoColor = "#7A6555";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("navy")) {
                codigoColor = "#0E1176";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("gray")) {
                codigoColor = "#9798A9";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("lime")) {
                codigoColor = "#79D267";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("fuchsia")) {
                codigoColor = "#7B1BA9";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("green")) {
                codigoColor = "#4DA538";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("white")) {
                codigoColor = "#FBFCFB";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("puple")) {
                codigoColor = "#410EAF";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("yellow")) {
                codigoColor = "#CEC017";
                formato = "style=\"background-color:"+codigoColor+";\"";

            } else if (color.trim().equalsIgnoreCase("aqua")) {
                codigoColor = "#86DD9F";
                formato = "style=\"background-color:"+codigoColor+";\"";

            }
        }

        return formato;
    }

    //determina si el color es hexadecimal
    public boolean isHexa(String h) {
        return h.matches("[#][A-Fa-f0-9]{1,6}");
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
