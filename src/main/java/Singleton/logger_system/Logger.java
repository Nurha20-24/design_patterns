package Singleton.logger_system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private String fileName;
    private FileWriter file;
    private BufferedWriter writer;



    private Logger(){
        this.fileName = "log.txt";
        try {
            file = new FileWriter(this.fileName, true);
            writer = new BufferedWriter(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String text){
        try {
            writer.append(text);
            writer.newLine();
            writer.flush();
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void setFileName(String fileName){
        this.fileName = fileName;
        try {
            if (writer !=null) {
                writer.close();
            }
            file = new FileWriter(fileName, true);  // Open in append mode
            writer = new BufferedWriter(file);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void close(){
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
