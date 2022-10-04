package AdvancedPacket;

import java.io.*;
import java.util.*;

public class AlmostPrime {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/home/roomba/GitHub/School-Code/Java/AdvancedPacket/almostprime.dat");
        Scanner data = new Scanner(f);
        List<Integer> ap = new ArrayList<Integer>();
        while (data.hasNextLine()) {
            int n = data.nextInt();
            //System.out.println(n);
            int t = 1;
            while (ap.size() != n) {
                int j = 0;

                for (int i=1;i<=t;i++) {
                    if (i%t==0) {
                        j++;
                    }
                }
                System.out.println(j + " " + t);
                if (j==1) ap.add(t);
                t++;
            }
            System.out.println(ap.indexOf(n-1));
        }
        System.out.println(ap.toString());
    }
}
