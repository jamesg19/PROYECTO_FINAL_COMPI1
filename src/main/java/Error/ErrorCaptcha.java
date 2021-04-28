/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Error;

/**
 * 
 * @author James Gramajo 
 */
public class ErrorCaptcha {
    private String TipoError;
    private String linea;
    private String Columna;
    private String Descripcion;
    private String Solucion;
    /**
     * CONSTRUCTOR DE LA CLASE
     */
    public ErrorCaptcha() {
    }

    
    
    
    /**
     * CONSTRUCTOR DE LA CLASE ERROR CAPTCHA
     * CON PARAMETROS
     * 
     * @param TipoError
     * @param linea
     * @param Columna
     * @param Descripcion
     * @param Solucion 
     */
    public ErrorCaptcha(String TipoError, String linea, String Columna, String Descripcion, String Solucion) {
        this.TipoError = TipoError;
        this.linea = linea;
        this.Columna = Columna;
        this.Descripcion = Descripcion;
        this.Solucion = Solucion;
    }

    
    
    
    public String getTipoError() {
        return TipoError;
    }

    public void setTipoError(String TipoError) {
        this.TipoError = TipoError;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColumna() {
        return Columna;
    }

    public void setColumna(String Columna) {
        this.Columna = Columna;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getSolucion() {
        return Solucion;
    }

    public void setSolucion(String Solucion) {
        this.Solucion = Solucion;
    }
    
    
    
    
    
    

}
