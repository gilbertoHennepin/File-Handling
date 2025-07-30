import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File myTest = new File(“src/myTestFile.txt”);
        try {
            FileInputStream inputStream = new FileInputStream(myTest);

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(“File Not Found!”);
        }
    }
}
//System.err.println() prints error messages to the console, typically in red,
//making them stand out from regular output produced by System.out.println(). \
//This distinction helps ensure errors receive the attention they need.
