/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDo.cl;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class TextFileIO {

    private String file;

    public TextFileIO(String file) {
        this.file = file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    /**
     *
     * @param data
     * @throws IOException
     */
    public void setData(String data) throws java.io.IOException {
        try {
            FileWriter writer = new FileWriter(this.file, true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.write(data);
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            throw e;
        }
    }
    
    public ArrayList<String> getData() throws java.io.IOException {
        ArrayList<String> data = new ArrayList<>();
        
        try{
            FileReader reader = new FileReader(this.file);
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            
            while((datos = buffer.readLine())!= null){
                data.add(datos);
            }
            reader.close();
            return data;
        }
        catch(IOException e){
            throw e;
        }
        
    }
}
