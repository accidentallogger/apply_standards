package misc;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class read_files {
    // This method reads the content from the specified files and returns it in an
    // ArrayList
    public static ArrayList<String> arrreadFiles(String Indent, String MethodName, String Nests, String VarName) {
        ArrayList<String> ArrayMain = new ArrayList<>(); // Initialize an ArrayList to store the read content
        // Create File objects for the provided file paths
        File FIndent = new File(Indent);
        File FMethod = new File(MethodName);
        File FNests = new File(Nests);
        File FVar = new File(VarName);

        // Read content from the file associated with the indentation path
        try (Scanner sc = new Scanner(FIndent)) {
            while (sc.hasNextLine()) {
                ArrayMain.add(sc.nextLine()); // Add each line to the ArrayList
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }

        // Read content from the file associated with the method name path
        try (Scanner sc = new Scanner(FMethod)) {
            while (sc.hasNextLine()) {
                ArrayMain.add(sc.nextLine()); // Add each line to the ArrayList
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }

        // Read content from the file associated with the nests path
        try (Scanner sc = new Scanner(FNests)) {
            while (sc.hasNextLine()) {
                ArrayMain.add(sc.nextLine()); // Add each line to the ArrayList
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }

        // Read content from the file associated with the variable name path
        try (Scanner sc = new Scanner(FVar)) {
            while (sc.hasNextLine()) {
                ArrayMain.add(sc.nextLine()); // Add each line to the ArrayList
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }

        // Return the ArrayList containing the read content from the files
        return ArrayMain;
    }
}
