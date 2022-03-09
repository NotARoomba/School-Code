/*
Nathan Alspaugh
5th period
*/
import java.util.*;
public class CYOARunner2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.println("What is your character name?");
        String name = input.nextLine();
        
      CYOA2 adventure = new CYOA2();
      adventure.print(adventure.startAdventure(input, name));
    }
  }