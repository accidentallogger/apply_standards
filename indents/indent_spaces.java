package indents;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class indent_spaces {

    // This method checks if the indentation spaces in the file are consistent
    public Boolean boolindentSpaces(String FileName, int IndSpaces) {
        File FileM = new File(FileName); // Create a File object using the provided file name
        int CurvCount = 0; // Initialize a count for the number of curly brackets
        int SpaceM = 0; // Initialize a variable to store the expected indentation spaces
        String CharC; // Initialize a string variable to store each line

        int SpacesComp = 0; // Initialize a variable to compare spaces
        String CharM; // Initialize a string to store the last character of each line
        Boolean Follows = true; // Initialize a boolean variable to track if the indentation follows the pattern

        try (Scanner sc = new Scanner(FileM)) {
            int IndentSpaces = IndSpaces; // Set the user-defined indentation spaces
            ArrayList<String> list = new ArrayList<String>(); // Create an ArrayList to store the lines from the file

            // Read each line from the file and add it to the list
            while (sc.hasNextLine()) {
                list.add((sc.nextLine()).stripTrailing());
            }
            list.remove(""); // Remove empty lines
            list.remove(" "); // Remove lines with only spaces

            for (int i = 0; i < list.size(); i++) {
                SpacesComp = 0; // Reset the spaces comparison variable
                CharC = list.get(i); // Get the current line from the list

                CharM = "" + CharC.charAt(CharC.length() - 1); // Get the last character of the line

                // Check the type of character and update the space count accordingly
                if (CharC.equals("") == false) {
                    if (CharM.contains("{")) {
                        SpaceM = CurvCount * IndentSpaces;
                        CurvCount++;
                    } else if (CharM.contains("}")) {
                        CurvCount--;
                        SpaceM = CurvCount * IndentSpaces;
                    } else {
                        SpaceM = CurvCount * IndentSpaces;
                    }

                    // Count the number of spaces in the line
                    for (int j = 0; j < CharC.indexOf("" + CharC.trim().charAt(0)); j++) {
                        if (Character.isWhitespace(CharC.charAt(j))) {
                            SpacesComp++;
                        }
                    }

                    // Compare the spaces with the expected indentation and update the Follows
                    // variable accordingly
                    if (SpacesComp == SpaceM) {
                        Follows = true;
                    } else if (SpacesComp > SpaceM) {
                        Follows = false;
                        break;
                    } else {
                        Follows = false;
                        break;
                    }
                }
            }
        } catch (FileNotFoundException | StringIndexOutOfBoundsException e) {
            Follows = false; // If there is an exception, set Follows to false
        }
        return Follows; // Return the result of the indentation check
    }
}
