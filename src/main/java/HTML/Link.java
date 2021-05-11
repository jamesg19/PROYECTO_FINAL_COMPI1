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
public class Link extends Html {
    private String href="";
    private String formato="";

    
    public Link(String href) {
        this.href=href;

    }
    
    public String formato_link(){
        
        formato="<link href="+href+"> \n";
        return formato;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
    
    

}
