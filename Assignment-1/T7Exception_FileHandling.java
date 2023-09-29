import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T7Exception_FileHandling{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException fne){
            System.out.println("File not found");
        }
        catch (IOException ioe){
            System.out.println("Error reading (inaccessible or incorrect data etc) in the file");
        }
        catch (Exception e){
            System.out.println("Other exceptions");
        }
    }
}
