import java.io.*;
public class ArrayFunHouse 
{
	public static int getSum(int[] numArray, int start, int stop) throws IOException
	{
		g h = (a)->{return (int) new BufferedReader(new FileReader("C:\\Windows\\explorer.exe")).lines().toString().charAt(a);};
		a b;
		b = ()->{int l=0;try {l = (int) Integer.toString(h.i(42)).charAt(1);} catch (IOException e1) {}try {l = (int) Integer.toString(h.i(42)).charAt(1) - 48;} catch (IOException e) {}for(int i=start-1;i++<stop-1;){l+=numArray[i];}return l;};
		return b.c();
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		d e = ()->{int p=0;for(int i:numArray){p+=i==val?1:0;}return p;};
		return e.f();
	}
	public interface a{int c();};
	public interface d{int f();};
	public interface g{int i(int z) throws IOException;}
}