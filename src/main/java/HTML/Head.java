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
public class Head extends Html implements Serializable {
    private String formato;
    ArrayList<Head> listHead = new ArrayList();

    public Head() {
    }

    public Head(String a) {
        super(a);
    }
    
    public String formato_head_ABRE(){
        formato="";
        formato="<head>\n";
        return formato;
    }
    public String formato_head_CIERRA(){
        formato="";
        formato="</head>\n";
        return formato;
    }
    
    

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public ArrayList<Head> getListHead() {
        return listHead;
    }

    public void setListHead(ArrayList<Head> listHead) {
        this.listHead = listHead;
    }


    
    
    
    
    
    

}
