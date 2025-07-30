package Javacoursera.character_encoding;
import java.io.*;

public class Main {

    public static void writeUTF8() { // utf 8 can handle international letters

        try (OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("PatientRecords.txt"), "UTF-8")) {
                writer.write("Jose Alvarez\n");
                writer.write("Muller\n");
                writer.write("斯稻姆\n");
        }catch (IOException e) {
                e.printStackTrace();
        }
    }
    public static void readUTF8() {
        try (InputStreamReader reader = new InputStreamReader(
                    new FileInputStream("PatientRecords.txt"), "UTF-8")) {
                int data;
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        writeUTF8();
        readUTF8();
    }
}
