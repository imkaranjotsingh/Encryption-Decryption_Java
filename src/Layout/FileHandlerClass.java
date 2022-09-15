package Layout;
 
import static Layout.FileFrame.dirpath;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class FileHandlerClass {
 
    public static String filewriter(String dirPath,String output,File ff){
        try {
            /*PrintWriter writer = new PrintWriter(ff);
            writer.print(output);
            writer.close();
         
           */// dirPath=ff.getAbsolutePath();
              //FileWriter writer=new FileWriter(ff, true);
              BufferedWriter bw = new BufferedWriter(new FileWriter(ff,true));
               // bw.close();
           //BufferedWriter bw = new BufferedWriter(writer);
             bw.write(output);
            bw.newLine();
            bw.close();
 
    }
    catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
    }
      return null;
 
    }
    public static String fileReader(String filepath){
            StringBuilder contentBuilder = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
    {
 
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null)
        {
            contentBuilder.append(sCurrentLine);
        }
    }
    catch (IOException e)
    {
    }
    return contentBuilder.toString();
    }
       /*try {
            BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                
                System.out.println(line);
            
        }
            String s = sb.toString();
        return s;
    }
    catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandlerClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IOException ex) {
            Logger.getLogger(FileHandlerClass.class.getName()).log(Level.SEVERE, null, ex);
 
    }
    return null;
    }*/
   
 

public static File filecreater(String path , String Name){
File ff = new File(path,Name);
        try{
            if(!ff.exists()){
            ff.createNewFile();
            }
            else{
                ff.delete();
                ff.createNewFile();
                
            }
        } 
        catch(Exception e){
        }
        return ff;

}
}