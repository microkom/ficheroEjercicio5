/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroejercicio5;


import static ficheroejercicio5.Methods.removeFileExtension;
import static ficheroejercicio5.Methods.readFileThenWriteIt;
import java.io.File;
public class FicheroEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName1 = "archivo_1.txt";
        String fileName2 = "archivo_2.txt";
        String fileRoute = "C:\\Users\\DAW\\Documents\\NetBeansProjects\\FicheroEjercicio5";
        
        //type File class is for specifying the location/name of the file
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);

        String fileName3 = removeFileExtension(file1.getName()) + "_" + removeFileExtension(file2.getName()) + ".txt";
        //System.out.println(fileName3);
        
        readFileThenWriteIt(file1, fileName3, fileRoute);
        readFileThenWriteIt(file2, fileName3, fileRoute);
    }

    

    

}
