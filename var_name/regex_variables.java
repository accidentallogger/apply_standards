package var_name;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class regex_variables {

    // This method extracts variable names from the provided file using the
    // specified regular expression pattern
    public ArrayList<String> arrvariableName(String Filename, String regxw) {
        // Create a file object using the provided filename
        File file = new File(Filename);
        // Initialize ArrayLists to store different types of strings
        ArrayList<String> ListFileLines = new ArrayList<String>(); // to store lines read from the file
        ArrayList<String> ListVarNames = new ArrayList<String>(); // to store extracted variable names
        ArrayList<String> CorrectList = new ArrayList<String>(); // to store variable names that match the regular
                                                                 // expression
        try (Scanner sc = new Scanner(file)) {
            // Read each line from the file and add it to the list
            while (sc.hasNextLine()) {
                ListFileLines.add(sc.nextLine());
            }

            String VarRegxString = regxw; // Store the user-provided regular expression
            // Call the compare_datatype_names.arrdatatypeNames method to populate
            // ListVarNames
            ListVarNames = misc.compare_datatype_names.arrdatatypeNames(ListFileLines, ListVarNames);

            // Iterate through each element in ListVarNames
            for (int i = 0; i < ListVarNames.size(); i++) {
                // If the current element matches the user-provided regular expression, add it
                // to CorrectList
                if ((ListVarNames.get(i)).matches(VarRegxString)) {
                    CorrectList.add(ListVarNames.get(i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // If the file is not found, print the stack trace
        }
        // Return the list of variable names that match the regular expression
        return CorrectList;
    }

}
