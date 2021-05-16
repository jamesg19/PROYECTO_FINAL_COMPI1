/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HTML;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class Body extends Html implements Serializable {
    private String formato="";
    private String background="";
    private ArrayList<Body> listBody = new ArrayList();
    
    public Body() {
    }
    
    
    public Body(String background) {
        this.background = background;
    }
    
    
    public String formato_body_ABRE(){
        ColorR col= new ColorR(background);
        if(background!=null){
            formato="<body "+col.determina_color()+">\n ";
        }else{
            formato="<body>";
        }
        
        return formato;
    }
    public String formato_body_CIERRA(){
        ColorR col= new ColorR(background);
        
            formato="</body>\n";
        
        
        return formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public ArrayList<Body> getListBody() {
        return listBody;
    }

    public void setListBody(ArrayList<Body> listBody) {
        this.listBody = listBody;
    }
    
    
    

}
