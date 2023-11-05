package no_nests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class no_nests {

    public Boolean no_of_nests(String Filename, int endp) {
        ArrayList<String> list = new ArrayList<String>();
        int count = 0, count_largest = 0;
        File file = new File(Filename);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i)).contains("{")) {
                    count++;
                }
                if (count > count_largest) {
                    count_largest = count;
                }
                if ((list.get(i)).contains("}")) {
                    count--;
                }
            }
            System.out.println(count_largest);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        if (count_largest <= endp) {
            return true;
        } else {
            return false;
        }
    }
}