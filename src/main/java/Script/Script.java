
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
