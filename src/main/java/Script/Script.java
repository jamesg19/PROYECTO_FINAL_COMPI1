/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Script;

import HTML.*;

/**
 * 
 * @author James Gramajo 
 */
public class Script extends Body {
    private String FORMATO="<script>\n";

    public Script() {
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }
    
}
