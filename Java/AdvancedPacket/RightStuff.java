package AdvancedPacket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RightStuff {
    public static void main(String[] args) throws FileNotFoundException {
        File fi = new File("/Users/roomba/Documents/GitHub/School-Code/Java/AdvancedPacket/rightstuff.dat");
        Scanner data = new Scanner(fi);
        int n = Integer.parseInt(data.nextLine());
        for (int i = 0; i < n; i++) {
            List<Double> l = new java.util.ArrayList<>(Arrays.stream(data.nextLine().split(" ")).mapToDouble(Double::parseDouble).boxed().toList());
            double t = l.remove(0);
            boolean a = Math.abs((100*(t-(l.stream().mapToDouble(Double::doubleValue).sum()/l.size()))/t))<=5;
            boolean p = Math.abs((100*((l.stream().mapToDouble(Double::doubleValue).sum()/l.size())-(l.get(0)-l.get(l.size()-1)))/(l.stream().mapToDouble(Double::doubleValue).sum()/l.size())))-100<=10;
            System.out.println(a&&p?"Both":!a&&!p?"Neither":a?"Accurate":"Precise");

        }
    }
}
