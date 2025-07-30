import java.io.File; 
import java.io.FileOutputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.Scanner; 

public class CreateAndWriteFileExample {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Sample description for the file";
            byte[] fileContentsBytes = fileContents.getBytes();
            outputStream.write(fileContentsBytes);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
