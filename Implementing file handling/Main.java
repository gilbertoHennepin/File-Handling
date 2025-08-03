import java.io.File;

public class Main {
    public static void main(String[] args) {
        // First create the directory and sample files (run this once)
        createSampleFiles();
        
        // Now uncomment ONE test case at a time:
        
        // TEST CASE 1: List files (currently active)
        String directoryPath = "./myBooks";
        DirectoryManager.listFilesAndDirectories(directoryPath);
        
        /*
        // TEST CASE 2: Create directory
        String backupPath = "./myBooksBackup";
        DirectoryManager.createDirectory(backupPath);
        */
        
        // ... other test cases remain commented ...
    }

    private static void createSampleFiles() {
        // Create directory if it doesn't exist
        new File("./myBooks").mkdirs();
        
        // Create sample book files
        String[] titles = {"The Great Gatsby", "1984", "To Kill a Mockingbird"};
        String[] authors = {"F. Scott Fitzgerald", "George Orwell", "Harper Lee"};
        
        for (int i = 0; i < titles.length; i++) {
            String fileName = "./myBooks/" + titles[i].replace(" ", "_") + ".txt";
            String content = "Title: " + titles[i] + "\nAuthor: " + authors[i];
            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write(content);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
