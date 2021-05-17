/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Script;

import HTML.Body;
import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class Onload extends Metodo {
    private String FORMATO="";
    private String nombre="";
    private ArrayList<Metodo> lstOnload = new ArrayList();

    public Onload() {
        
    }
    public String genera_proces_A(){
        FORMATO="function "+nombre+"{ ";
        return FORMATO;
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Metodo> getLstOnload() {
        return lstOnload;
    }

    public void setLstOnload(ArrayList<Metodo> lstOnload) {
        this.lstOnload = lstOnload;
    }
    
    
    
    

}
