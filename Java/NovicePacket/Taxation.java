package NovicePacket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Taxation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(new File(new File("NovicePacket/taxation.dat").getAbsolutePath()));
        int n = Integer.parseInt(data.nextLine());
        double t = 0;
        for (int i = 0; i < n; i++) {
            String f = data.next();
            t+=f.trim().equals("T")?Double.parseDouble(data.next())*1.0825:Double.parseDouble(f);
        }
        System.out.println("The total is $" + Math.round(t * 100.0) / 100.0);
    }
}
