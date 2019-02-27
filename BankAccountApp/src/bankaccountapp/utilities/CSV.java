/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HaiAu
 */
public class CSV {
    //this method will read data from a CSV file and return as a list
    public static List<String[]> read(String file) throws IOException{
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while((dataRow = br.readLine()) != null){
            String[] dataRecords = dataRow.split(",");
            data.add(dataRecords);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Cound not find file");
            ex.printStackTrace();
        } catch (IOException e){
            System.out.println("Cound not read file");
            e.printStackTrace();
        }
        return data;
    }
}
