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
public class ColorHexa {
/*
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    
    */
    private String formato;
    private String color;
    private String codigoColor;
    
    public ColorHexa(String color) {
        this.color = color;
    }
    //style="background-color:;"
    public String determina_color() {
        if(color.isEmpty()){
            //color negro por defecto
            formato="#3E3A39";
        }
        else if (isHexa(color)) {
            codigoColor=color;
        } else {
            if (color.trim().equalsIgnoreCase("black")) {
                codigoColor = "#3E3A39";
                

            } else if (color.trim().equalsIgnoreCase("olive")) {
                codigoColor = "#486B2E";


            } else if (color.trim().equalsIgnoreCase("teal")) {
                codigoColor = "#62FFF4";


            } else if (color.trim().equalsIgnoreCase("red")) {
                codigoColor = "#C45C4F";
                

            } else if (color.trim().equalsIgnoreCase("blue")) {
                codigoColor = "#2A8ACE";

            } else if (color.trim().equalsIgnoreCase("maroon")) {
                codigoColor = "#7A6555";

            } else if (color.trim().equalsIgnoreCase("navy")) {
                codigoColor = "#0E1176";

            } else if (color.trim().equalsIgnoreCase("gray")) {
                codigoColor = "#9798A9";

            } else if (color.trim().equalsIgnoreCase("lime")) {
                codigoColor = "#79D267";

            } else if (color.trim().equalsIgnoreCase("fuchsia")) {
                codigoColor = "#7B1BA9";

            } else if (color.trim().equalsIgnoreCase("green")) {
                codigoColor = "#4DA538";

            } else if (color.trim().equalsIgnoreCase("white")) {
                codigoColor = "#FBFCFB";

            } else if (color.trim().equalsIgnoreCase("puple")) {
                codigoColor = "#410EAF";

            } else if (color.trim().equalsIgnoreCase("yellow ")) {
                codigoColor = "#CEC017";
            } else if (color.trim().equalsIgnoreCase("aqua")) {
                codigoColor = "#86DD9F";
            }
        }

        return codigoColor;
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
