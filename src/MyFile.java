import java.io.*;
import java.util.ArrayList;

public class MyFile {

    // Method to read CSV file and return its contents as ArrayList of Strings
    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) { //throw some exceptions if the file is not found or if it's in unreadvle format
            System.err.println("Error: File not found - " + filename);
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file - " + filename);
        }
        return lines;
    }

    // Method to write ArrayList of Strings to a CSV file
    public static void writeFile(String filename, ArrayList<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) { //throw exception if writeFile fails!
            System.err.println("Error: Unable to write to the file - " + filename);
        }
    }
}
