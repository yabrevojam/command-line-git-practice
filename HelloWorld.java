// 
import java.io.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            if (new File("./inputs/").notExists()) {
                System.out.println("Please add a folder to your current directory called `inputs`");
            } else {
                File[] txtFiles = new File("./inputs").listFiles(new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                        return name.toLowerCase().endsWith(".txt");
                    }
                });
                if (txtFiles.length > 0) {
                    Scanner inputScanner = null;
                    for (File inputFile : txtFiles) {
                        inputScanner = new Scanner(inputFile);
                        String input = inputScanner.nextLine();
                        System.out.println("Hello " + input);
                    }
                }
            }
        } catch(FileNotFoundException e) {

        }
    }
}