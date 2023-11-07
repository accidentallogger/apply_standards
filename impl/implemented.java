package impl;

import rules.rules;
import indents.indent_spaces;
import no_nests.no_of_nests;
import var_name.regex_variables;
import func_name.regex_func;
import misc.read_files;
import java.util.ArrayList;

public class implemented implements rules {

    // Variables to store the results of various checks
    public static Boolean IndentReturn;
    public static ArrayList<String> FunctionNameReturn;
    public static Boolean NestsReturn;
    public static ArrayList<String> VariableNameReturn;

    // Method to perform all checks on the provided file
    public static void voidcallAll(String Filename) {
        implemented imp = new implemented();
        // Get custom input from user GUI
        String F1 = ("output\\VariableName.txt");
        String F2 = ("output\\MethodName.txt");
        String F3 = ("output\\Indent.txt");
        String F4 = ("output\\Nest.txt");

        ArrayList<String> ArrM = read_files.arrreadFiles(F3, F2, F4, F1);

        // Perform checks and store results in respective variables
        IndentReturn = (imp.boolindentSpaces(Filename, Integer.parseInt(ArrM.get(0))));
        FunctionNameReturn = (imp.arrfunctionName(Filename, ArrM.get(1)));
        NestsReturn = (imp.boolnestNum(Filename, Integer.parseInt(ArrM.get(2))));
        VariableNameReturn = (imp.arrvariableName(Filename, ArrM.get(3)));

        // Print the results of the checks
        System.out.println("Indentation followed: " + IndentReturn);
        System.out.println("Function names that follow the given regex value: " + FunctionNameReturn);
        System.out.println("Below nesting limit: " + NestsReturn);
        System.out.println("Variable names that follow the given regex value: " + VariableNameReturn);
    }

    // Method to check if the indentation spaces are as expected
    public Boolean boolindentSpaces(String Filename, int indspaces) {
        indent_spaces ind = new indent_spaces();
        return ind.boolindentSpaces(Filename, indspaces);
    }

    // Method to check if the number of nests is within the expected limit
    public Boolean boolnestNum(String Filename, int endp) {
        no_of_nests nes = new no_of_nests();
        return nes.boolnestNum(Filename, endp);
    }

    // Method to extract function names that follow a given regex pattern
    public ArrayList<String> arrfunctionName(String Filename, String regxw) {
        regex_func rf = new regex_func();
        return rf.arrfunctionName(Filename, regxw);
    }

    // Method to extract variable names that follow a given regex pattern
    public ArrayList<String> arrvariableName(String Filename, String regxw) {
        regex_variables vn = new regex_variables();
        return vn.arrvariableName(Filename, regxw);
    }
}
