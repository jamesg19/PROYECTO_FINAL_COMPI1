/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

/**
 * 
 * @author James Gramajo 
 */

import HTML.Html;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LectorArchivoss {
    
    private final String EXTENSION_A_BUSCAR = ".jsp";
    ArrayList<String> listaJSP = new ArrayList<>();

    private String directorioCarpetaAExaminar = "C:\\Users\\james\\Desktop\\FInalCompi1\\src\\main\\webapp\\CaptchaPage\\";


    public LectorArchivoss() {

    }

    public void leer() {

        File dir = new File(directorioCarpetaAExaminar);

        File[] files = dir.listFiles(new FilenameFilter() {
            
            public boolean accept(File dir, String name) {
                
                return name.toString().endsWith(".jsp");
            }
            
        });

        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            listaJSP.add(file.getName());
            
        }
        if (files.length == 0) {
            
        }
        System.out.println("--");

    }

    public void setDirectorioABuscar(String dir) {

        this.directorioCarpetaAExaminar = dir;
    }

    public ArrayList<String> getListaJSP() {
        return listaJSP;
    }

    public void setListaJSP(ArrayList<String> listaJSP) {
        this.listaJSP = listaJSP;
    }
    

}

