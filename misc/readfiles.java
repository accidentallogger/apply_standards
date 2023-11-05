package misc;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class readfiles {
    public static ArrayList<String> readf(String indent, String methodname, String nests, String varname) {
        ArrayList<String> arra = new ArrayList<>();
        File findent = new File(indent);
        File fmethod = new File(methodname);
        File fnests = new File(nests);
        File fvar = new File(varname);
        try (Scanner sc = new Scanner(findent)) {
            while (sc.hasNextLine()) {
                arra.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        try (Scanner sc = new Scanner(fmethod)) {
            while (sc.hasNextLine()) {
                arra.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        try (Scanner sc = new Scanner(fnests)) {
            while (sc.hasNextLine()) {
                arra.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        try (Scanner sc = new Scanner(fvar)) {
            while (sc.hasNextLine()) {
                arra.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        // System.out.println(arra);
        return arra;
    }
}
