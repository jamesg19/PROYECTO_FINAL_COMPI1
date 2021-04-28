/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author James Gramajo 
 */
public class Tabla {
    private int Posicion;
    private String Identificador;
    private String Tipo;
    private String Modo;
    private String Procedimiento;
    private int NoEjecucion;

    public Tabla() {
    }

    public Tabla(int Posicion, String Identificador, String Tipo, String Modo, String Procedimiento, int NoEjecucion) {
        this.Posicion = Posicion;
        this.Identificador = Identificador;
        this.Tipo = Tipo;
        this.Modo = Modo;
        this.Procedimiento = Procedimiento;
        this.NoEjecucion = NoEjecucion;
    }

    
    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getModo() {
        return Modo;
    }

    public void setModo(String Modo) {
        this.Modo = Modo;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public int getNoEjecucion() {
        return NoEjecucion;
    }

    public void setNoEjecucion(int NoEjecucion) {
        this.NoEjecucion = NoEjecucion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
