/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Script;

import HTML.*;
import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class Script extends Body {
    private String FORMATO="<script>\n";
    private ArrayList<Body> listScript = new ArrayList();

    public Script() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

    public ArrayList<Body> getListScript() {
        return listScript;
    }

    public void setListScript(ArrayList<Body> listScript) {
        this.listScript = listScript;
    }
    
}
