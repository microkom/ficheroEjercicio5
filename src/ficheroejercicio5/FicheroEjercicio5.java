/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName1 = "archivo_1.txt";
        String fileName2 = "archivo_2.txt";
        String fileName3 = "archivo_3.txt";

        File file1 = null;
        File file2 = null;
        File file3 = null;

        FileReader fr = null;
        BufferedReader bufferRead = null;

        FileWriter file = null;
        //BufferedWriter bufferWrote = null;
        
        leerArchivoEscribirLectura(fileName1,fileName3);
    }
    public static void leerArchivoEscribirLectura(String nombreOrigen, String nombreDestino){
        File file1 = null;
        
        FileReader fr = null;
        BufferedReader bufferRead = null;
        
        FileWriter file = null;
        try {
            
            //lectura de un archivo
            file1 = new File(nombreOrigen);
            fr = new FileReader(file1);
            bufferRead = new BufferedReader(fr);
            
            
            file = new FileWriter("archivo_3.txt",true);
            //bufferWrote = new BufferedWriter(file);
            try {
                String line;
                while ((line = bufferRead.readLine()) != null) {
                    file.write(line);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (file != null) {
                        file.close();
                    }
                } catch (Exception er) {
                    System.out.println(er.getMessage());
                }
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        } finally {
            try {
                if (fr != null) {
                    bufferRead.close();
                }
            } catch (Exception er) {
                System.out.println(er.getMessage());
            }
        }
    }

}
