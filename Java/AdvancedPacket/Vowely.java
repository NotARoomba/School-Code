package AdvancedPacket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vowely {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(new File(new File("AdvancedPacket/vowely.dat").getAbsolutePath()));
        int n = Integer.parseInt(data.nextLine());
        for (int i = 0; i < n; i++) {
            String s = data.nextLine();
            System.out.println(s.replaceAll("[aeiou]","").length()<=Math.round(s.length()/2)?"YES":"NO");
        }
    }
}
