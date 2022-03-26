import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
public class test {
public static void main(String[] args) throws IOException {
    List<Integer> indexes = new ArrayList<Integer>();
        String text = new BufferedReader(new FileReader("C:\\Windows\\explorer.exe")).lines().toString();
        for(int i = 0; i < 26; i++){
            indexes.add(text.indexOf((char)(97 + i)));
        }
        for(int i = 0; i < 10; i++){
            indexes.add(text.indexOf((char)(48 + i)));
        }
    }
}
