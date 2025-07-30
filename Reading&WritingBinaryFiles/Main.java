package Javacoursera.character_encoding.binaryfile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class Main {

    public static void binaryWrite() {
       int sensorId = 12345; // Example sensor ID
       Random rd = new Random();
       float sensorValue = rd.nextFloat();
       String timestamp = "2024-8-23 16:30:00";
       try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("sensorData.bin"))) {
           dos.writeInt(sensorId);  
           dos.writeFloat(sensorValue);
           dos.writeUTF(timestamp);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    public static void binaryRead() {
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("sensorData.bin"))) {
            while (true) {
                try {
                    int sensorId = dis.readInt(); float sensorValue = dis.readFloat();
                    String timestamp = dis.readUTF();
                    System.out.println("id" + sensorId + " value: " + sensorValue + " timestamp: " + timestamp);
                } catch (EOFException e) { break; }
                catch (IOException e) 
                { throw new RuntimeException(e);}
            }
        } catch (Exception e) 
        { e.printStackTrace(); }
    }
    public static void main(String[] args) {
        System.out.println("Binary File Example");
        binaryWrite();
        binaryRead();
    }   
}
