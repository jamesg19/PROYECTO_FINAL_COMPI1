package Logica;

import HTML.*;
import Script.Script;
import Script.Script2;

import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class GeneraHtml {
    ArrayList<Html> listaDatos = new ArrayList<>();
    ArrayList<String> listaID = new ArrayList<>();
    ArrayList<String> ID_duplicado = new ArrayList<>();
    private String FORMATO="";
    public GeneraHtml() {
    }
    
    public void generahtml(ArrayList<Html> listaDatos){
        for(int i=0;i<listaDatos.size();i++){
            if(listaDatos.get(i) instanceof Html2){
                Html2 html = (Html2) listaDatos.get(i);
                FORMATO+=html.formato_html_ABRE();
            }    
            
            if(listaDatos.get(i) instanceof Head){
                Head head = (Head) listaDatos.get(i);
                
                FORMATO+=head.formato_head_ABRE();
                imprime_dentro_head(head);
                FORMATO+=head.formato_head_CIERRA();
                
            }
            else if(listaDatos.get(i) instanceof Body){
                Body bod = (Body) listaDatos.get(i);
                
                FORMATO+=bod.formato_body_ABRE();
                imprimir_dentro_body(bod);
                FORMATO+=bod.formato_body_CIERRA();
            }
        }
        FORMATO+="\n</html>\n";
        System.out.println(FORMATO);
    }
    public void imprime_dentro_head(Head head){
        FORMATO+="<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n" +
                "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n"
                + "<link rel=\"stylesheet\" href=\"../CaptchaPage/alt/alt.css\">\n";
        for(int i=0; i<head.getListHead().size();i++){
            if(head.getListHead().get(i) instanceof Link){
                Link link = (Link) head.getListHead().get(i);
                FORMATO+=link.formato_link();
            } else if(head.getListHead().get(i) instanceof Title){
                Title title = (Title) head.getListHead().get(i);
                FORMATO+=title.formato_title();
            } 
            
        }
        
    }
    public void imprimir_dentro_body(Body listaDato){
        //FORMATO+=" <%@ include file = \"../alt/nav.jsp\" %>";
        for(int i=0;i<listaDato.getListBody().size();i++){
            // SPAM
            if(listaDato.getListBody().get(i) instanceof Spam){
                Spam spam = (Spam) listaDato.getListBody().get(i);
                spam.genera_spam();
                FORMATO+=spam.getFormato();
                validar_id(spam.getId(),"Spam");
            }
            // Div
            else if(listaDato.getListBody().get(i) instanceof Div){
                Div div = (Div) listaDato.getListBody().get(i);
                div.genera_div();
                FORMATO+=div.genera_abre_div();
                validar_id(div.getId(),"DIV");
            } 
            // Div
            else if(listaDato.getListBody().get(i) instanceof DivC){
                DivC div = (DivC) listaDato.getListBody().get(i);
                FORMATO+=div.genera_cierra_div();
                
            } 
            //BR
            else if(listaDato.getListBody().get(i) instanceof Br){
                Br br = (Br) listaDato.getListBody().get(i);
                FORMATO+=br.getFormato();
            } 
            //H1
            else  if(listaDato.getListBody().get(i) instanceof H1){
                H1 h1 = (H1) listaDato.getListBody().get(i);
                h1.genera_h1();
                FORMATO+=h1.getFormato();
                validar_id(h1.getId(),"H1");
            } 
            //P
            else  if(listaDato.getListBody().get(i) instanceof P){
                P p = (P) listaDato.getListBody().get(i);
                p.genera_p();
                FORMATO+=p.getFormato();
                validar_id(p.getId(),"P");
            }
            //input
            else  if(listaDato.getListBody().get(i) instanceof Input){
                
                Input in = (Input) listaDato.getListBody().get(i);
                in.determina_formato_input();
                FORMATO+=in.determina_formato_input();
                validar_id(in.getId(),"Input");
            }
            else  if(listaDato.getListBody().get(i) instanceof TextArea){
                
                TextArea area = (TextArea) listaDato.getListBody().get(i);
                //area.generatext();
                FORMATO+=area.generatext();
                validar_id(area.getId(),"TextArea");
            } else  if(listaDato.getListBody().get(i) instanceof Button){
                
                Button button= (Button) listaDato.getListBody().get(i);
                
                FORMATO+=button.genera_button();
                validar_id(button.getId(),"Button");
            }
            else  if(listaDato.getListBody().get(i) instanceof Img){
                
                Img img= (Img) listaDato.getListBody().get(i);
                
                FORMATO+=img.generar_img();
                validar_id(img.getId(),"Imagen");
            } 
            else if(listaDato.getListBody().get(i) instanceof Select){
                
                Select select= (Select) listaDato.getListBody().get(i);
                
                FORMATO+=select.generar_select();
                validar_id(select.getId(),"Select");
            }
            //abre script
            else if(listaDato.getListBody().get(i) instanceof Script){
                
                Script script= (Script) listaDato.getListBody().get(i);
                
                FORMATO+=script.getFORMATO();
            }
            //cierra Script
            else if(listaDato.getListBody().get(i) instanceof Script2){
                
                Script2 script= (Script2) listaDato.getListBody().get(i);
                
                FORMATO+=script.getFORMATO();
            }
        }
    }
    
    public void validar_id(String id, String seccion){
        if(!id.isEmpty()|| id.equalsIgnoreCase(" ")){
            if(listaID.contains(id.trim())){
            ID_duplicado.add("No se pueden tener ID DUPLICADOS el siguiente ID ( "+id+" ) ya esta definido en: "+seccion+"\n");
        }else{
            listaID.add(id.trim());
        }
        }
    }
    
    
    
    public void imprime_Script(){
        
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
