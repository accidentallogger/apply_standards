package impl;

import rules.rules;
import indents.indents;
import no_nests.no_nests;
import var_name.regex_variables;
import func_name.regex_func;
import misc.readfiles;
import java.util.ArrayList;

//"([a-z]+[A-Z]+\\w+)+"
public class implemented implements rules {
    public static Boolean a;
    public static ArrayList<String> b;
    public static Boolean c;
    public static ArrayList<String> d;

    public static void call_all(String Filename) {
        implemented imp = new implemented();
        // get custom input from user gui
        String f1 = ("output\\VariableName.txt");
        String f2 = ("output\\MethodName.txt");
        String f3 = ("output\\Indent.txt");
        String f4 = ("output\\Nest.txt");

        ArrayList<String> arr = readfiles.readf(f3, f2, f4, f1);

        // System.out.println(arr);
        a = (imp.indent(Filename, Integer.parseInt(arr.get(0))));
        b = (imp.function_name(Filename, arr.get(1)));
        c = (imp.no_of_nests(Filename, Integer.parseInt(arr.get(2))));
        d = (imp.variable_name(Filename, arr.get(3)));

    }

    public Boolean indent(String Filename, int indspaces) {
        indents ind = new indents();
        return ind.indent(Filename, indspaces);
    }

    public Boolean no_of_nests(String Filename, int endp) {
        no_nests nes = new no_nests();
        return nes.no_of_nests(Filename, endp);
    }

    public ArrayList<String> function_name(String Filename, String regxw) {
        regex_func rf = new regex_func();
        return rf.function_name(Filename, regxw);
    }

    public ArrayList<String> variable_name(String Filename, String regxw) {
        regex_variables vn = new regex_variables();
        return vn.variable_name(Filename, regxw);
    }
}
