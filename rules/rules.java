package rules;

import java.util.ArrayList;

// This interface defines a set of rules for analyzing code files.
public interface rules {

    // This method checks if the file has the required indentation spaces.
    public Boolean boolindentSpaces(String FileName, int IndSpaces);

    // This method checks if the number of nests in the file is within a specified
    // range.
    public Boolean boolnestNum(String FileName, int EndP);

    // This method extracts function names from the file based on a provided regular
    // expression pattern.
    public ArrayList<String> arrfunctionName(String FileName, String RegxW);

    // This method extracts variable names from the file based on a provided regular
    // expression pattern.
    public ArrayList<String> arrvariableName(String FileName, String RegxW);

}
