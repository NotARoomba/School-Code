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
    System.out.println("Loop #1");
int x = 1;
do {
    System.out.print(x + " ");
    x = x + 10;
} while (x < 100);
//Answer here:

// System.out.println("Loop #2");
// int max = 10;
// do {
//     System.out.println("count down: " + max);
//     max=max-1;
// } while (max < 10);
// //Answer here:

// 	System.out.println("Loop #3");
// x = 250;
// do {
//     System.out.println(x);
// } while (x % 3 != 0);
// //Answer here:

// System.out.println("Loop #4");
// x = 100;
// do {
//     System.out.println(x);
//     x = x / 2;
// } while (x % 2 == 0);
// //Answer here:

// System.out.println("Loop #5");
// x = 2;
// do {
//     System.out.print(x + " ");
//     x *= x;
// } while (x < 200);
// //Answer here:


// System.out.println("Loop #6");
// String word = "a";
// do {
//     word = "b" + word + "b";
// } while (word.length() < 10);
// System.out.println(word);
// //Answer here:

// System.out.println("Loop #7");
// x = 100;
// do {
//     System.out.println(x / 10);
//     x = x / 2;
// } while (x > 0);
// //Answer here:
int total = 0;
for (int i = 1; i<8;i++) {
    total=total+i;
}
System.out.println(total);

    }
}
