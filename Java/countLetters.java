/**
 * @(#)countLetters.java
 *
 *
 * The sentences were randomly generated.
 *
 * @author Nathan Alspaugh
 * @version 1.00 2022/4/28
 */

public class countLetters {
        
    public static void main(String[] args) {
        String[] words = {"tomatoes", "make", "great", "weapons", "when", "water", "balloons", "aren’t", "available.", "i", "used", "to", "practice", "weaving", "with", "spaghetti", "three", "hours", "a", "day", "but", "stopped", "because", "i" ,"didn't", "want", "to", "die", "alone."};
        System.out.println(String.format("There are %d b's\nThere are %d r's\nThere are %d i's\nThere are %d d's\nThere are %d g's\nThere are %d e's\n ", String.join("", words).length() - String.join("", words).replace("b", "").length(), String.join("", words).length() - String.join("", words).replace("r", "").length(), String.join("", words).length() - String.join("", words).replace("i", "").length(), String.join("", words).length() - String.join("", words).replace("d", "").length(), String.join("", words).length() - String.join("", words).replace("g", "").length(), String.join("", words).length() - String.join("", words).replace("e", "").length()));
    }
}