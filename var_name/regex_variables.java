package var_name;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.regex.*;
import java.util.Scanner;

import java.util.ArrayList;

public class regex_variables {

    public ArrayList<String> variable_name(String Filename, String regxw) {
        File file = new File(Filename);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list_1 = new ArrayList<String>();
        ArrayList<String> correct_list = new ArrayList<String>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }

            String var_regxString = regxw; // user input
            // System.out.println(regxw);
            list_1 = misc.compare_datatype_names.datatypenames(list, list_1);

            for (int i = 0; i < list_1.size(); i++) {
                if ((list_1.get(i)).matches(var_regxString)) {
                    correct_list.add(list_1.get(i));
                }

            }
            // System.out.println(correct_list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return correct_list;
    }

}