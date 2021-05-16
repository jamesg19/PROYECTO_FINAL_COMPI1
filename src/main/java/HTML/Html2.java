/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTML;

import java.io.Serializable;

/**
 *
 * @author James Gramajo
 */
public class Html2 extends Html implements Serializable{

    private String id="";
    private String name="";
    private String formato="";
    String a;
    public Html2() {
    }

    public Html2(String a) {
        this.a = a;
    }
    
    public String formato_html_ABRE(){
        if(id.isEmpty()&& !name.isEmpty()){
            formato="<html name=\""+name+"\" >\n";
        } 
        else if(!id.isEmpty()&& name.isEmpty()){
             formato="<html id=\""+id.substring(1)+"\" >\n";
        }
        else if(!id.isEmpty()&& !name.isEmpty()){
             formato="<html id=\""+id.substring(1)+"\" name=\""+name+"\" >\n";
        } else if(id.isEmpty()&& name.isEmpty()){
             formato="<html >\n";
        }
        
                
        return formato;
    }
    public String formato_html_CIERRA(){
        String format="</html>\n";
        return format;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.substring(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    

}
