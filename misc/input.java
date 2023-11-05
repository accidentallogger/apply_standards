package misc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class input {

    public static void setup() throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter indentation: ");
            int a = sc.nextInt();
            System.out.println("enter regex value for variable names");
            String b = sc.nextLine();
            System.out.println("no of nests");
            int c = sc.nextInt();
            System.out.println("enter regex value for function names");
            String d = sc.nextLine();
            try (FileWriter writerObj = new FileWriter("output\\VariableName.txt", false)) {
                writerObj.write(b);
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\MethodName.txt", false)) {
                writerObj.write(c);
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\Indent.txt", false)) {
                writerObj.write(a);
                writerObj.close();
            }
            try (FileWriter writerObj = new FileWriter("output\\Nest.txt", false)) {
                writerObj.write(d);
                writerObj.close();
            }
        }
        System.out.println("all setup.");

    }

    public static void past_standards() {
        String f1 = ("output\\VariableName.txt");
        String f2 = ("output\\MethodName.txt");
        String f3 = ("output\\Indent.txt");
        String f4 = ("output\\Nest.txt");

        ArrayList<String> arr = readfiles.readf(f3, f2, f4, f1);

        System.out.println("variable naming: " + arr.get(3));
        System.out.println("method naming: " + arr.get(1));
        System.out.println("indentaion rule: " + Integer.parseInt(arr.get(0)));
        System.out.println("no of nesting: " + Integer.parseInt(arr.get(2)));

    }
}
