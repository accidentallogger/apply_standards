// This file is responsible for taking input for the code file and controlling the main flow of the program.

// Import statements
import impl.implemented; // Import the implemented class
import java.io.IOException; // Import IOException for handling file-related exceptions
import java.util.Scanner; // Import Scanner for user input
import misc.input; // Import the input class from the misc package

// Main class for controlling the program flow
public class main_class {
    // Default file path
    static String file = "file.txt";

    // Main method for program execution
    public static void main(String[] Args) throws IOException {
        // Creating a scanner object to take user input
        try (Scanner sc = new Scanner(System.in)) {
            // Run the program in an infinite loop until the user chooses to exit
            while (true) {
                // Display the options to the user
                System.out.println(
                        " (1) setup standards for file. | (2) load past standards. | (3) check standards | (4) change file | (5) exit");
                // Read the user's choice
                int option_no = sc.nextInt();
                // Perform actions based on the user's choice
                switch (option_no) {
                    // Option 1: Setup standards for the file
                    case 1:
                        input.voidSetup(); // Call the voidSetup method from the input class to set up the standards
                        break;
                    // Option 2: Load previously set standards
                    case 2:
                        input.past_standards(); // Call the past_standards method from the input class to load past
                                                // standards
                        break;
                    // Option 3: Check whether the file meets the set standards
                    case 3:
                        implemented.voidcallAll(file); // Call the call_all method from the implemented class to check
                                                       // the
                        // standards for the specified file
                        break;
                    // Option 4: Change the file path
                    case 4:
                        Scanner sc1 = new Scanner(System.in); // Create a new Scanner object to take the new file path
                        System.out.println("current file is: " + file);
                        System.out.println("enter file path: ");
                        file = sc1.nextLine(); // Update the file path based on the user's input
                        break;
                    // Option 5: Exit the program
                    case 5:
                        System.exit(option_no); // Exit the program
                }
            }
        }
    }
}
