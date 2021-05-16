/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 * 
 * @author James Gramajo 
 */
public class GestorArchivo {
    String PathFijo="C:\\Users\\james\\Desktop\\FInalCompi1\\src\\main\\webapp\\CaptchaPage\\";
    private String ContenidoArchivo;
    private boolean ExisteArchivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    /**
     * Genera un arhivo.jsp
     * recibe como parametros el texto que va a contener el archivo y el nombre
     * @param documento
     * @param nombre
     * @return 
     */
    public boolean GuardarJSP( String documento,String nombre) {
        String mensaje = null;
        boolean bandera=false;
        try {
            
            File fil= new File(PathFijo+nombre);
            salida = new FileOutputStream(fil);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            salida.close();
            bandera=true;
            salida.close();
            
        } catch (Exception e) {

        }
        return bandera;
    }
    
    public void eliminarCaptcha(String fichero) {
        File fichero_del = new File(PathFijo+fichero);
        fichero_del.delete();
        
    }


}
