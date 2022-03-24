import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] nums = new int[] {};
        char[] letters = new char[] {};
        Scanner sc = new Scanner(new File("C:/Windows/explorer.exe"));
        StringBuffer text = new StringBuffer();
        try {
        while(sc.hasNext())
        {
            String currentLine = sc.nextLine();
            text.append(currentLine);
            System.out.println( currentLine );
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     }
}
