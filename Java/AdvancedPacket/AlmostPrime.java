package AdvancedPacket;

import java.io.*;
import java.util.*;

public class AlmostPrime {
    public static void main(String[] args) throws FileNotFoundException {
        File fi = new File(new File("AdvancedPacket/almostprime.dat").getAbsolutePath());
        Scanner data = new Scanner(fi);
        List<Integer> ap = new ArrayList<Integer>();
        while (data.hasNextLine()) {
            int n = data.nextInt();
            int t = ap.size()==0?1:ap.get(ap.size()-1)+1;
            while (ap.size() != n) {
                int f = 0;
                for (int i = 1; i<=t;i++) {
                    if (t%i == 0) {
                        f++;
                    }
                }
                if (f == 3) {
                    ap.add(t);
                }
                t++;
            }
            System.out.println(ap.get(n-1));
        }
    }
}
