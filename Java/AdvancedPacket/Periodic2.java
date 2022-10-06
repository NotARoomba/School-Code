package AdvancedPacket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Periodic2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(new File(new File("AdvancedPacket/periodic2.dat").getAbsolutePath()));
        List<String> e = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            e.add(data.next().toLowerCase());
        }
        int a = data.nextInt();
        data.nextLine();
        for (int w = 0;w<a;w++) {
            String s = data.nextLine();
            System.out.println(doesContain(s, e)==null?"no":"yes");


        }
    }
    public static String doesContain(String s, List<String> d) {
        if (d.contains(s)) return s;
        int len = s.length();
        //looping through string
        for (int i = 1; i < len; i++) {
            //gets small bits like chocolate - ch - cho - choc
            String prefix = s.substring(0, i);
            //checks if periodic table contains it if not then skip
            if (d.contains(prefix)) {
                //gets remaining part
                String suffix = s.substring(i, len);
                //recurse through the remaining part until it is all sorted
                String segSuffix = doesContain(suffix, d);
                if (segSuffix != null) {
                    //adds to the prefix recursively like: c + h + o + c + o + la + te
                    return prefix + " " + segSuffix;

                }
            }
        }
        return null;
    }
}