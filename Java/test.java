import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
public class test {
public static void main(String[] args) throws IOException {
    List<Integer> indexes = new ArrayList<Integer>();
        String text = new BufferedReader(new FileReader("C:\\Windows\\explorer.exe")).lines().toString();
        // for(int i = 0; i < 26; i++){
        //     indexes.add(text.indexOf((char)(97 + i)));
        // }
        for(int i = 0; i < 10; i++){
            indexes.add(text.indexOf((char)(48 + i)));
        }
        //ystem.out.println(indexes+ "\n" + text.indexOf("1"));
    //     int a = (int)(Math.random()*100);
    // int b = (int)(Math.random()*20 + 60);
    // int c = (int)(Math.random()*(20 + 70));
    // int d = (int)(Math.random()*100 - 20);
    // int e = (int)(Math.random()*10 * 4);
    // System.out.println(a + " " +  b + " " + c + " " + d + " " + e);
//     System.out.println( 1 % 5 );				// LINE 1

// System.out.println( 15 % 2 );				// LINE 2

// System.out.println( 5 + 9 * 2 );			// LINE 3

// System.out.println( 'A' + 9 );				// LINE 4

// System.out.println( 5 * 9 + 2);			// LINE 5

// System.out.println( 'c' + 5 );				// LINE 6

// System.out.println( Math.pow(3,3) );    		// LINE 7

// System.out.println( Math.ceil(3.4) );    		// LINE 8

// System.out.println( Math.floor(4.6) );   		// LINE 9

// System.out.println( Math.sqrt(12) );    		// LINE 10

// System.out.println( Math.round(12.34) );   		// LINE 11

// System.out.println( Math.round(12.56) );   		// LINE 12

// System.out.println( Math.max(12,34));    		// LINE 13

// System.out.println( Math.min(12,34));    		// LINE 14

// System.out.println( Math.max(12.3,45.6));  	// LINE 15

// System.out.println( Math.min(12.3,45.6));  		// LINE 16

// System.out.println( Math.abs(-213));    		// LINE 17

// System.out.println( Math.abs(213));    		// LINE 18

// System.out.println( Math.ceil(Math.sqrt(17)));	// LINE 19

// System.out.println( (int)(Math.random() * 50 ));  		// LINE 20

// System.out.println( (int)(Math.random() * 1000 ));		// LINE 21

// System.out.println( (int)(Math.random() * 20 + 10));    	// LINE 22
// int[] data = new int[8];
// data[0] = 3;
// data[7] = -18;
// data[4] = 5;
// data[1] = data[0];

// int x = data[4];
// data[4] = 6;
// data[x] = data[0] * data[1];
// System.out.println(Arrays.toString(data));
// double[] fun = {2.1, 4.5, 9.6, 4.3, 0.0, 0.5, 1.6};

// System.out.println(fun[0]);				// LINE 1

// System.out.println(fun[2]);				// LINE 2

// System.out.println(fun[3]);				// LINE 3

// System.out.println(fun[6]);				// LINE 4

// System.out.println(fun [0]+ fun [2]);			// LINE 5

// System.out.println(fun [1]+ fun[2/5]);		            // LINE 6

// System.out.println(fun[5*2/8]);				// LINE 7

// System.out.println(fun[9/3]);				// LINE 8

// System.out.println(fun.length);				// LINE 9

// System.out.println(fun.length/2);			// LINE 10

  
// System.out.println(sum13(new int[] {1, 2, 2, 1}));
//     }
//     static public int sum13(int[] nums) {
//         d a = ()->{int s=0;for(int i=0;i++<nums.length-1;){if(nums[i]==13){return s;}s+=nums[i];}return s;};
//         return a.f();
//       }
//       public interface d{int f();};
// int[] nums = {1, 2, 7, 8, 9, 11};
	
//     double sum=0;
//     for(int spot=0; spot<nums.length; spot++)
//     {
//        sum = sum + nums[spot];
//     }
//     System.out.println(sum/nums.length);
    
System.out.println(equalToSeven(new int[] {1, 5, 7, 8, 7, 4, 7, 3, 5, 7}));
}
static public int equalToSeven(int[] array)
{

return Arrays.stream(array).filter(x -> x==7).toArray().length;

}

}
