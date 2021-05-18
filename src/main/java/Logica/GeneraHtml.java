package Logica;

import HTML.*;
import Script.*;
import Script.Script2;
import Variables.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author James Gramajo
 */
public class GeneraHtml {

    ArrayList<Html> listaDatos = new ArrayList<>();
    ArrayList<String> listaID = new ArrayList<>();
    ArrayList<String> variable_duplicada = new ArrayList<>();
    //para informacion al usuario
    ArrayList<String> ID_duplicado = new ArrayList<>();
    
    private String FORMATO = "";
    
    
    
    
    
    public GeneraHtml() {
    }

    public void generahtml(ArrayList<Html> listaDatos) {
        for (int i = 0; i < listaDatos.size(); i++) {
            if (listaDatos.get(i) instanceof Html2) {
                Html2 html = (Html2) listaDatos.get(i);
                FORMATO += html.formato_html_ABRE();
            }

            if (listaDatos.get(i) instanceof Head) {
                Head head = (Head) listaDatos.get(i);

                FORMATO += head.formato_head_ABRE();
                imprime_dentro_head(head);
                FORMATO += head.formato_head_CIERRA();

            } else if (listaDatos.get(i) instanceof Body) {
                Body bod = (Body) listaDatos.get(i);

                FORMATO += bod.formato_body_ABRE();
                imprimir_dentro_body(bod);
                FORMATO += bod.formato_body_CIERRA();
            }
        }
        FORMATO += "\n</html>\n";
        System.out.println(FORMATO);
    }

    public void imprime_dentro_head(Head head) {
        FORMATO += "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n"
                + "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n"
                + "<link rel=\"stylesheet\" href=\"../CaptchaPage/alt/alt.css\">\n";
        for (int i = 0; i < head.getListHead().size(); i++) {
            if (head.getListHead().get(i) instanceof Link) {
                Link link = (Link) head.getListHead().get(i);
                FORMATO += link.formato_link();
            } else if (head.getListHead().get(i) instanceof Title) {
                Title title = (Title) head.getListHead().get(i);
                FORMATO += title.formato_title();
            }

        }

    }

    public void imprimir_dentro_body(Body listaDato) {
        //FORMATO+=" <%@ include file = \"../alt/nav.jsp\" %>";
        for (int i = 0; i < listaDato.getListBody().size(); i++) {
            // SPAM
            if (listaDato.getListBody().get(i) instanceof Spam) {
                Spam spam = (Spam) listaDato.getListBody().get(i);
                spam.genera_spam();
                FORMATO += spam.getFormato();
                validar_id(spam.getId(), "Spam");
            } // Div
            else if (listaDato.getListBody().get(i) instanceof Div) {
                Div div = (Div) listaDato.getListBody().get(i);
                div.genera_div();
                FORMATO += div.genera_abre_div();
                validar_id(div.getId(), "DIV");
            } // Div
            else if (listaDato.getListBody().get(i) instanceof DivC) {
                DivC div = (DivC) listaDato.getListBody().get(i);
                FORMATO += div.genera_cierra_div();

            } //BR
            else if (listaDato.getListBody().get(i) instanceof Br) {
                Br br = (Br) listaDato.getListBody().get(i);
                FORMATO += br.getFormato();
            } //H1
            else if (listaDato.getListBody().get(i) instanceof H1) {
                H1 h1 = (H1) listaDato.getListBody().get(i);
                h1.genera_h1();
                FORMATO += h1.getFormato();
                validar_id(h1.getId(), "H1");
            } //P
            else if (listaDato.getListBody().get(i) instanceof P) {
                P p = (P) listaDato.getListBody().get(i);
                p.genera_p();
                FORMATO += p.getFormato();
                validar_id(p.getId(), "P");
            } //input
            else if (listaDato.getListBody().get(i) instanceof Input) {

                Input in = (Input) listaDato.getListBody().get(i);
                in.determina_formato_input();
                FORMATO += in.determina_formato_input();
                validar_id(in.getId(), "Input");
            } else if (listaDato.getListBody().get(i) instanceof TextArea) {

                TextArea area = (TextArea) listaDato.getListBody().get(i);
                //area.generatext();
                FORMATO += area.generatext();
                validar_id(area.getId(), "TextArea");
            } else if (listaDato.getListBody().get(i) instanceof Button) {

                Button button = (Button) listaDato.getListBody().get(i);

                FORMATO += button.genera_button();
                validar_id(button.getId(), "Button");
            } else if (listaDato.getListBody().get(i) instanceof Img) {

                Img img = (Img) listaDato.getListBody().get(i);

                FORMATO += img.generar_img();
                validar_id(img.getId(), "Imagen");
            } else if (listaDato.getListBody().get(i) instanceof Select) {

                Select select = (Select) listaDato.getListBody().get(i);

                FORMATO += select.generar_select();
                validar_id(select.getId(), "Select");
            } //abre script
            else if (listaDato.getListBody().get(i) instanceof Script) {

                Script script = (Script) listaDato.getListBody().get(i);

                FORMATO += script.getFORMATO();
                //crear un nuevo objeto para cada script
                analiza_script(script);

            } //cierra Script
            else if (listaDato.getListBody().get(i) instanceof Script2) {

                Script2 script = (Script2) listaDato.getListBody().get(i);

                FORMATO += script.getFORMATO();
            }
        }
    }

    public void validar_id(String id, String seccion) {
        if (!id.isEmpty() || id.equalsIgnoreCase(" ")) {
            if (listaID.contains(id.trim())) {
                ID_duplicado.add("No se pueden tener ID DUPLICADOS el siguiente ID ( " + id + " ) ya esta definido en: " + seccion + "\n");
            } else {
                listaID.add(id.trim());
            }
        }
    }

    /**
     * RECIBE UN OBJETO SCRIPT Y BUSCA SU CONTENIDO
     *
     * @param listaDatos
     */
    public void analiza_script(Script script) {

        for (int i = 0; i < script.getListScript().size(); i++) {
            //string
            if (script.getListScript().get(i) instanceof Onload) {

                Onload onload = (Onload) script.getListScript().get(i);
                variable_duplicada = new ArrayList<>();

                //validar_variables(onload.getId(),"String");
                //analiza_dentro_metodos(onload);
            } else if (script.getListScript().get(i) instanceof Proceso) {
                Proceso proceso = (Proceso) script.getListScript().get(i);

                variable_duplicada = new ArrayList<>();
                FORMATO+=proceso.genera_proces_A();
                analiza_dentro_metodos(proceso);

            } else if (script.getListScript().get(i) instanceof CierraCorchete) {
                CierraCorchete close = (CierraCorchete) script.getListScript().get(i);

                
                FORMATO+=close.getFORMATO();
                

            }
        }

    }

    /**
     * ANALIZACOMPONENTES DENTRO DE UN METODO
     *
     * @param onload
     */
    public void analiza_dentro_metodos(Proceso onload) {

        for (int i = 0; i < onload.getLstProcess().size(); i++) {

            //string
            if (onload.getLstProcess().get(i) instanceof StringV) {

                StringV string = (StringV) onload.getLstProcess().get(i);
                validar_variables(string.getConstante(), " string ", onload.getNombre());
                //JOptionPane.showMessageDialog(null, " aaaaa "+string.getConstante()+" d "+string.getValor());
                if(string.getElement()!=null){
                    FORMATO+=generaGetElement(string.getConstante(),string.getElement(),onload.getNombre());
                } else if(string.getMETODO()!=null){
                    FORMATO+=genera_formato_variableM(string.getConstante(),string.getMETODO());
                }
                
                else {
                    FORMATO+=genera_formato_variable(string.getConstante(),string.getValor());
                }
                
                
            } else if (onload.getLstProcess().get(i) instanceof IntegerV) {

                IntegerV integ = (IntegerV) onload.getLstProcess().get(i);
                validar_variables(integ.getConstante(), " integer ", onload.getNombre());
                FORMATO+=genera_formato_variable(integ.getConstante(),integ.getValor());

            } else if (onload.getLstProcess().get(i) instanceof BooleanV) {

                BooleanV bool = (BooleanV) onload.getLstProcess().get(i);
                //JOptionPane.showMessageDialog(null, bool.getConstante());
                validar_variables(bool.getConstante(), " boolean ", onload.getNombre());
                FORMATO+=genera_formato_variable(bool.getConstante(),bool.getValor());

            } else if (onload.getLstProcess().get(i) instanceof CharV) {

                CharV chart = (CharV) onload.getLstProcess().get(i);
                validar_variables(chart.getConstante(), " char ", onload.getNombre());
                FORMATO+=genera_formato_variable(chart.getConstante(),chart.getValor());

            } else if (onload.getLstProcess().get(i) instanceof DecimalV) {

                DecimalV decimal = (DecimalV) onload.getLstProcess().get(i);
                validar_variables(decimal.getConstante(), " decimal ", onload.getNombre());
                FORMATO+=genera_formato_variable(decimal.getConstante(),decimal.getValor());

            }

        }

    }

    public void validar_variables(String var, String tipoVar, String seccion) {

        String[] parts = var.split(",");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] != null) {
                //JOptionPane.showMessageDialog(null, parts[i].trim());
                if (variable_duplicada.contains(parts[i].trim())) {
                    ID_duplicado.add("Variables duplicadas:( " + parts[i].trim() + " )  TIPO: " + tipoVar + " en el METODO: " + seccion + "\n");
                } else {
                    variable_duplicada.add(parts[i].trim());
                }
            }
        }
    }

    private String genera_formato_variable(String constante, String valor) {
        String a="";
        String[] parts = constante.split(",");
        for (int i = 0; i < parts.length; i++) {
            //que la constante  no sea nula
            
            if (parts[i] != null) {
                if(valor!=null){
                     a+="var "+parts[i]+" = "+valor+";\n";
                     
                } else{
                    a+="var "+parts[i]+";\n";
                }
            }
        }
        return a;

    }
    private String genera_formato_variableM(String constante, String metodo) {
        String a="";
        String[] parts = constante.split(",");
        for (int i = 0; i < parts.length; i++) {
            //que la constante  no sea nula
            
            if (parts[i] != null) {
                if(metodo!=null){
                     a+="var "+parts[i]+" = "+metodo+"\n";
                     
                } else{
                    a+="var "+parts[i]+";\n";
                }
            }
        }
        return a;

    }
    private String generaGetElement(String constante, String VAR, String metodo){
        String a="";
        String[] parts = constante.split(",");
        for (int i = 0; i < parts.length; i++) {
            if(parts[i] != null){
                if(listaID.contains(VAR.substring(1).trim()) ){
                    a+="var "+parts[i]+" = document.getElementById('"+VAR.substring(1)+"');\n"; 
                }else{
                    ID_duplicado.add("EL ID ESPECIFICADO: \""+VAR.substring(1)+"\" dentro de getElementById No Existe en una etiqueta G_CIC en metodo"+metodo+"\n");
                    return a;
                }
                
            }
            
        }
        
        return a;
    }

    public ArrayList<Html> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(ArrayList<Html> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

    public ArrayList<String> getListaID() {
        return listaID;
    }

    public void setListaID(ArrayList<String> listaID) {
        this.listaID = listaID;
    }

    public ArrayList<String> getID_duplicado() {
        return ID_duplicado;
    }

    public void setID_duplicado(ArrayList<String> ID_duplicado) {
        this.ID_duplicado = ID_duplicado;
    }

}
