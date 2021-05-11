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
public class Html {

    private String id="";
    private String name="";
    private String formato="";

    public Html() {
    }
    
    public String formato_html_ABRE(){
        if(id.isEmpty()&& !name.isEmpty()){
            formato="<html name=\""+name+"\" >\n";
        }else if(!id.isEmpty()&& !name.isEmpty()){
             formato="<html id=\""+id+"\" name=\""+name+"\" >\n";
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
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    

}
