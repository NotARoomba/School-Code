/**
 * @(#)PigLatin.java
 *
 *
 * @author Nathan Alspaugh 
 * @version 1.00 2022/4/26
 */

public class PigLatin {

    public static void main(String[] args) {
        String[] words = {"this", "is", "the", "example"};
        for (String a:words) {
            System.out.println("aeiouAEIOU".indexOf(a.charAt(0))!=-1?a+"ay":a.substring(1, a.length())+a.charAt(0)+"ay");
        }
    }
}