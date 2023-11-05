package indents;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class indents {

    public Boolean indent(String Filename, int indspaces) {
        File file = new File(Filename);
        int curv_count = 0;
        int space = 0;
        String ch;

        int spaces = 0;
        String cc;
        Boolean follows = true;

        try (Scanner sc = new Scanner(file)) {
            int indent_spaces = indspaces; // add user customization
            ArrayList<String> list = new ArrayList<String>();

            while (sc.hasNextLine()) {

                list.add((sc.nextLine()).stripTrailing());

            }
            list.remove("");
            list.remove(" ");

            // System.out.println(list);
            for (int i = 0; i < list.size(); i++) {

                spaces = 0;
                ch = list.get(i);

                cc = "" + ch.charAt(ch.length() - 1);
                // System.out.println(ch);
                if (ch.equals("") == false) {
                    if (cc.contains("{")) {
                        space = curv_count * indent_spaces;
                        curv_count++;

                    } else if (cc.contains("}")) {
                        curv_count--;
                        space = curv_count * indent_spaces;
                    } else {
                        space = curv_count * indent_spaces;
                    }

                    for (int j = 0; j < ch.indexOf("" + ch.trim().charAt(0)); j++) {
                        if (Character.isWhitespace(ch.charAt(j))) {
                            spaces++;
                        }

                    }
                    if (spaces == space) {
                        follows = true;
                    } else if (spaces > space) {
                        follows = false;
                        break;
                    } else {
                        follows = false;
                        break;
                    }

                }

            }

            // System.out.println(list);
            System.out.println(follows);
        } catch (FileNotFoundException | StringIndexOutOfBoundsException e) {
            follows = false;
            System.out.println(follows);
        }
        return follows;
    }
}
