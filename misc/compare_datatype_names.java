package misc;

import java.util.ArrayList;
import java.util.Arrays;

public class compare_datatype_names {
    // This method extracts data type names from the list of file lines
    public static ArrayList<String> arrdatatypeNames(ArrayList<String> ListFileLines, ArrayList<String> ListVarNames) {
        // Iterate through each line in the list of file lines
        for (int i = 0; i < ListFileLines.size(); i++) {
            // Check if the line contains any of the specified data types and ends with a
            // semicolon
            if (((ListFileLines.get(i)).contains("int") || (ListFileLines.get(i)).contains("String")
                    || (ListFileLines.get(i)).contains("Boolean") || (ListFileLines.get(i)).contains("float")
                    || (ListFileLines.get(i)).contains("byte") || (ListFileLines.get(i)).contains("short")
                    || (ListFileLines.get(i)).contains("long")
                    || (ListFileLines.get(i)).contains("char") || (ListFileLines.get(i)).contains("double"))
                    && (ListFileLines.get(i)).contains(";")) {
                // Split the line into a list of strings for easier manipulation
                ArrayList<String> ListMain = new ArrayList<String>(
                        Arrays.asList(((ListFileLines.get(i)).replace(";", " ;")).split(" ")));
                // Add data type names to ListFuncNames based on the presence of the specified
                // data types
                ListVarNames.add(ListMain.get(((ListMain.indexOf("int"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("String"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("float"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("Boolean"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("byte"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("short"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("long"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("char"))) + 1));
                ListVarNames.add(ListMain.get(((ListMain.indexOf("double"))) + 1));
            }
        }
        // Remove any empty or whitespace strings from the list of data type names
        ListVarNames.remove(" ");
        ListVarNames.remove("");
        // Return the list of extracted data type names
        return ListVarNames;
    }
}
