package no_nests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class no_of_nests {

    // This method checks if the number of nests in a file is less than or equal to
    // a specified value
    public Boolean boolnestNum(String Filename, int EndP) {
        // Initialize an ArrayList to store lines from the file
        ArrayList<String> list = new ArrayList<String>();
        int Count = 0, CountLargest = 0; // Initialize variables to count the nests
        File file = new File(Filename); // Create a File object using the provided filename
        try (Scanner sc = new Scanner(file)) {
            // Read each line from the file and add it to the list
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            // Iterate through each line in the list
            for (int i = 0; i < list.size(); i++) {
                // Check if the line contains "{", which indicates the beginning of a nest
                if ((list.get(i)).contains("{")) {
                    Count++; // Increment the count of nests
                }
                // Check if the current count of nests is larger than the previous largest count
                if (Count > CountLargest) {
                    CountLargest = Count; // Update the largest count of nests
                }
                // Check if the line contains "}", which indicates the end of a nest
                if ((list.get(i)).contains("}")) {
                    Count--; // Decrement the count of nests
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }
        // Check if the largest count of nests is less than or equal to the specified
        // value
        if (CountLargest <= EndP) {
            return true; // If the condition is true, return true
        } else {
            return false; // If the condition is false, return false
        }
    }
}
