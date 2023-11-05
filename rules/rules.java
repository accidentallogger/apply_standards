package rules;

import java.util.ArrayList;

public interface rules {
    public Boolean indent(String Filename, int indspaces);

    public Boolean no_of_nests(String Filename, int endp);

    public ArrayList<String> function_name(String Filename, String regxw);

    public ArrayList<String> variable_name(String Filename, String regxw);

}
