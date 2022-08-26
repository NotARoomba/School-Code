import java.util.*;
public class PigLatin2 {
  public static void main(String[] args) {
    Scanner i = new Scanner(new Scanner(System.in).nextLine());
    while (i.hasNext()) {
     String a = i.next();         
     System.out.print(("aeiouAEIOU".indexOf(a.charAt(0))!=-1?a+"ay":a.substring(1, a.length())+a.charAt(0)+"ay")+" ");
    }
  }
}
