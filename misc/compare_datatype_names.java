package misc;

import java.util.ArrayList;
import java.util.Arrays;

public class compare_datatype_names {
    public static ArrayList<String> datatypenames(ArrayList<String> list, ArrayList<String> list_1) {
        for (int i = 0; i < list.size(); i++) {
            if (((list.get(i)).contains("int") || (list.get(i)).contains("String")
                    || (list.get(i)).contains("Boolean") || (list.get(i)).contains("float")
                    || (list.get(i)).contains("byte") || (list.get(i)).contains("short")
                    || (list.get(i)).contains("long")
                    || (list.get(i)).contains("char") || (list.get(i)).contains("double"))
                    && (list.get(i)).contains(";")) {
                ArrayList<String> list_m = new ArrayList<String>(
                        Arrays.asList(((list.get(i)).replace(";", " ;")).split(" ")));
                list_1.add(list_m.get(((list_m.indexOf("int"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("String"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("float"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("Boolean"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("byte"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("short"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("long"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("char"))) + 1));
                list_1.add(list_m.get(((list_m.indexOf("double"))) + 1));

            }

        }
        list_1.remove(" ");
        list_1.remove("");
        return list_1;
    }
}
