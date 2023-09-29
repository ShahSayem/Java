
import java.io.*;

public class File_Exception {
    public static void main(String[] args) {
        try {
            File file = new File("abc.txt");

            if (!file.exists()){
                file.createNewFile();
                System.out.println("File Created "+file);
            }
            else {
                System.out.println("File already exist");
            }
        }
        catch (Exception e){
            System.out.println("Error "+e);
        }


        try {
            String names[] = {"Steve", "Musk", "Bill"};
            BufferedWriter writer = new BufferedWriter(new FileWriter("MidExam1.txt"));
            writer.write("Here I am testing my code");
            writer.write("\nHere is the second line");

            for (String name: names)
                writer.write("\n"+name);

            writer.close();
        }
        catch (IOException e){
            System.out.println("IO Exception occur");
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("MidExam1.txt"));
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