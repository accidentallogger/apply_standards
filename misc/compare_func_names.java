package misc;

import java.util.ArrayList;
import java.util.Arrays;

public class compare_func_names {

    // This method extracts function names from the list of file lines
    public static ArrayList<String> arrfunceNames(ArrayList<String> ListFileLines, ArrayList<String> ListFuncNames) {
        // Iterate through each line in the list of file lines
        for (int i = 0; i < ListFileLines.size(); i++) {
            // Check if the line contains "(" and "{" which are common in function
            // declarations
            if ((ListFileLines.get(i)).contains("(") && ((ListFileLines.get(i)).contains("{"))) {
                // Split the line into a list of strings for easier manipulation
                ArrayList<String> ListMain = new ArrayList<String>(
                        Arrays.asList((((ListFileLines.get(i)).replace("(", " (")).replace("{", " {")).split(" ")));
                // Add potential function names to ListFuncNames based on various data types
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("int"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("String"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("float"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("Boolean"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("byte"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("short"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("long"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("char"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("double"))) + 1));
                ListFuncNames.add(ListMain.get(((ListMain.indexOf("void"))) + 1));
            }
        }
        // Remove any empty or whitespace strings from the list of function names
        ListFuncNames.remove(" ");
        ListFuncNames.remove("");

        // Return the list of extracted function names
        return ListFuncNames;
    }
}
