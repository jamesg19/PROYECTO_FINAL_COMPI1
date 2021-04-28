package Clases;

/**
 * 
 * @author James Gramajo 
 */
public class ReportUsosCaptcha {
    
    private String NombreCaptcha;
    private int CantidadUsos;
    private int CantidadAciertos;
    private int CantidadFallos;
    private String FechaUso;
    /**
     * CONSTRUCTOR SIN PARAMETROS
     */
    public ReportUsosCaptcha() {
    }
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param NombreCaptcha
     * @param CantidadUsos
     * @param CantidadAciertos
     * @param CantidadFallos
     * @param FechaUso 
     */
    public ReportUsosCaptcha(String NombreCaptcha, int CantidadUsos, int CantidadAciertos, int CantidadFallos, String FechaUso) {
        this.NombreCaptcha = NombreCaptcha;
        this.CantidadUsos = CantidadUsos;
        this.CantidadAciertos = CantidadAciertos;
        this.CantidadFallos = CantidadFallos;
        this.FechaUso = FechaUso;
    }

    
    
    
    
    
    public String getNombreCaptcha() {
        return NombreCaptcha;
    }

    public void setNombreCaptcha(String NombreCaptcha) {
        this.NombreCaptcha = NombreCaptcha;
    }

    public int getCantidadUsos() {
        return CantidadUsos;
    }

    public void setCantidadUsos(int CantidadUsos) {
        this.CantidadUsos = CantidadUsos;
    }

    public int getCantidadAciertos() {
        return CantidadAciertos;
    }

    public void setCantidadAciertos(int CantidadAciertos) {
        this.CantidadAciertos = CantidadAciertos;
    }

    public int getCantidadFallos() {
        return CantidadFallos;
    }

    public void setCantidadFallos(int CantidadFallos) {
        this.CantidadFallos = CantidadFallos;
    }

    public String getFechaUso() {
        return FechaUso;
    }

    public void setFechaUso(String FechaUso) {
        this.FechaUso = FechaUso;
    }
    
    
    
    
    
    
    
    

}
