
// file for taking input of code file
import impl.implemented;

import java.io.IOException;
import java.util.Scanner;
import misc.input;

public class mainclass {
    static String file = "file.txt"; // default file

    public static void main(String[] Args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {

            while (0 < 1) {
                System.out.println(
                        " (1) setup standards for file. | (2) load past standards. | (3) check standards | (4) change file | (5) exit");
                int option_no = sc.nextInt();
                switch (option_no) {
                    case 1:
                        input.setup();
                        break;
                    case 2:
                        input.past_standards();
                        break;
                    case 3:
                        implemented.call_all(file);
                        break;
                    case 4:
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("current file is: " + file);
                        System.out.println("enter file path: ");
                        file = sc1.nextLine();
                        break;
                    case 5:
                        System.exit(option_no);

                }

            }
        }

    }

}
