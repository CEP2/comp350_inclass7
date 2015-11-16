/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv_edit;

import com.opencsv.CSVReader;
import java.io.*;

/**
 *
 * @author clifp
 */
public class CSV_Edit {

    
    static String separator = ",";
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //CSV Reader setup
        CSVReader reader = new CSVReader(new FileReader("test.csv"));
        
        //Output file setup.
        File file = new File("outputTest.csv");
        PrintWriter writer = new PrintWriter (file);
        
        //Variables
        String nextLine[];
        
        while((nextLine = reader.readNext()) != null){
            int length = nextLine.length;
            for(int i = 0; i < length; i++ ){
                System.out.print(nextLine[i]);
                writer.print(nextLine[i]);
                if ( i < length-1 ){
                    System.out.print(separator);
                    writer.print(separator);
                }
            }
            System.out.println();
            writer.println(""); 
       }
       writer.close();
    }
    
    
}
