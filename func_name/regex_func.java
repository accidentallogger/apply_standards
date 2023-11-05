package func_name;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.regex.*;
import java.util.Scanner;

import java.util.ArrayList;

public class regex_func {

    public ArrayList<String> function_name(String Filename, String regxw) {
        File file = new File(Filename);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list_1 = new ArrayList<String>();
        ArrayList<String> correct_list = new ArrayList<String>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            // regxw = "([a-z]+[A-Z]+\\w+)+";
            String var_regxString = regxw; // user input
            // System.out.println(regxw);
            // System.out.println("([a-z]+[A-Z]+\\w+)+");
            list_1 = misc.compare_func_names.funcenames(list, list_1);

            for (int j = 0; j < list_1.size(); j++) {
                if ((list_1.get(j)).matches(var_regxString)) {
                    correct_list.add(list_1.get(j));
                }

            }
            // System.out.println(correct_list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return correct_list;
    }

}
