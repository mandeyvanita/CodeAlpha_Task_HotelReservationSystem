package util;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    // Save data to file
    public static void saveData(String fileName, ArrayList<String> data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    // Read data from file
    public static ArrayList<String> readData(String fileName) {

        ArrayList<String> data = new ArrayList<>();

        File file = new File(fileName);

        if (!file.exists()) {
            return data;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return data;
    }

    // Append one line
    public static void appendData(String fileName, String text) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

            writer.write(text);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Clear file
    public static void clearFile(String fileName) {

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.print("");
        } catch (FileNotFoundException e) {
            System.out.println("Error clearing file.");
        }
    }
}
