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
    //     int a = (int)(Math.random()*100);
    // int b = (int)(Math.random()*20 + 60);
    // int c = (int)(Math.random()*(20 + 70));
    // int d = (int)(Math.random()*100 - 20);
    // int e = (int)(Math.random()*10 * 4);
    // System.out.println(a + " " +  b + " " + c + " " + d + " " + e);
    System.out.println( 1 % 5 );				// LINE 1

System.out.println( 15 % 2 );				// LINE 2

System.out.println( 5 + 9 * 2 );			// LINE 3

System.out.println( 'A' + 9 );				// LINE 4

System.out.println( 5 * 9 + 2);			// LINE 5

System.out.println( 'c' + 5 );				// LINE 6

System.out.println( Math.pow(3,3) );    		// LINE 7

System.out.println( Math.ceil(3.4) );    		// LINE 8

System.out.println( Math.floor(4.6) );   		// LINE 9

System.out.println( Math.sqrt(12) );    		// LINE 10

System.out.println( Math.round(12.34) );   		// LINE 11

System.out.println( Math.round(12.56) );   		// LINE 12

System.out.println( Math.max(12,34));    		// LINE 13

System.out.println( Math.min(12,34));    		// LINE 14

System.out.println( Math.max(12.3,45.6));  	// LINE 15

System.out.println( Math.min(12.3,45.6));  		// LINE 16

System.out.println( Math.abs(-213));    		// LINE 17

System.out.println( Math.abs(213));    		// LINE 18

System.out.println( Math.ceil(Math.sqrt(17)));	// LINE 19

System.out.println( (int)(Math.random() * 50 ));  		// LINE 20

System.out.println( (int)(Math.random() * 1000 ));		// LINE 21

System.out.println( (int)(Math.random() * 20 + 10));    	// LINE 22

    }
}
