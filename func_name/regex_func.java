package func_name;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;

public class regex_func {

    // This method takes in a file name and a regular expression pattern as input
    public ArrayList<String> arrfunctionName(String Filename, String regxw) {
        // Create a file object using the provided filename
        File file = new File(Filename);
        // Initialize three ArrayLists to store different types of strings
        ArrayList<String> ListFileLines = new ArrayList<String>(); // to store lines read from the file
        ArrayList<String> ListFuncNames = new ArrayList<String>(); // to store extracted function names
        ArrayList<String> CorrectList = new ArrayList<String>(); // to store function names that match the regular
                                                                 // expression

        try (Scanner sc = new Scanner(file)) {
            // Read each line from the file and add it to the list
            while (sc.hasNextLine()) {
                ListFileLines.add(sc.nextLine());
            }
            // varRegxString stores the user-provided regular expression
            String VarRegxString = regxw; // user input

            // Call the compare_func_names.arrfunceNames method to populate ListFuncNames
            // with extracted function names
            ListFuncNames = misc.compare_func_names.arrfunceNames(ListFileLines, ListFuncNames);

            // Iterate through each element in ListFuncNames
            for (int j = 0; j < ListFuncNames.size(); j++) {
                // If the current element matches the user-provided regular expression, add it
                // to CorrectList
                if ((ListFuncNames.get(j)).matches(VarRegxString)) {
                    CorrectList.add(ListFuncNames.get(j));
                }
            }
        } catch (FileNotFoundException e) {
            // If the file is not found, print the stack trace
            e.printStackTrace();
        }
        // Return the list of function names that match the regular expression
        return CorrectList;
    }

}
