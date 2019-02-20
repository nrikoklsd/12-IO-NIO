package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/admin/Desktop/zxc/io/src/main/java/task3/Writer.java");
            Scanner scanner = new Scanner(file);
            System.out.println("**** Сomments **** ");
            while(scanner.hasNextLine()){
                String string = scanner.nextLine();
                if (string.trim().startsWith("//")){System.out.println(string);}}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

