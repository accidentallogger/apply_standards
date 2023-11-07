package misc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class input {

    // This method sets up the input values required for the program
    public static void voidSetup() throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            // Prompt the user to input the desired indentation value
            System.out.println("enter indentation: ");
            int Input1 = sc.nextInt(); // Read the integer value for indentation
            // Prompt the user to input the regex value for variable names
            System.out.println("enter regex value for variable names");
            // Consume the remaining newline character
            sc.nextLine();
            String Input2 = sc.nextLine(); // Read the string value for variable name regex
            // Prompt the user to input the number of nests
            System.out.println("no of nests");
            int Input3 = sc.nextInt(); // Read the integer value for the number of nests
            // Prompt the user to input the regex value for function names
            System.out.println("enter regex value for function names");
            // Consume the remaining newline character
            sc.nextLine();
            String Input4 = sc.nextLine(); // Read the string value for function name regex

            // Write the input values to separate files for later use
            try (FileWriter writerObj = new FileWriter("output\\VariableName.txt", false)) {
                writerObj.write(Input2);
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\MethodName.txt", false)) {
                writerObj.write(Input4);
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\Indent.txt", false)) {
                writerObj.write(String.valueOf(Input1));
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\Nest.txt", false)) {
                writerObj.write(String.valueOf(Input3));
                writerObj.close();
            }
        }
        System.out.println("all setup."); // Print confirmation of the completion of the setup
    }

    // This method retrieves and prints the previously set input values
    public static void past_standards() {
        // File paths for the input values
        String F1 = ("output\\VariableName.txt");
        String F2 = ("output\\MethodName.txt");
        String F3 = ("output\\Indent.txt");
        String F4 = ("output\\Nest.txt");

        // Read values from files into an ArrayList
        ArrayList<String> arr = read_files.arrreadFiles(F3, F2, F4, F1);

        // Print the retrieved input values
        System.out.println("variable naming: " + arr.get(3));
        System.out.println("method naming: " + arr.get(1));
        System.out.println("indentation rule: " + Integer.parseInt(arr.get(0)));
        System.out.println("no of nesting: " + Integer.parseInt(arr.get(2)));
    }
}
