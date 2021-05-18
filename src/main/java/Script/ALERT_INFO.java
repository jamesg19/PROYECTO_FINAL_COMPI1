/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Script;

/**
 *
 * @author James Gramajo
 */
public class ALERT_INFO extends Metodo {
    private String mensaje="";
    private String FORMATO =" ";

    public ALERT_INFO(String mensaje) {
        this.mensaje=mensaje;
    }

    public ALERT_INFO() {
    }
    
    public String generar_alert(){
        FORMATO="alert("+mensaje+");\n";
        return FORMATO;
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
