import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CYOA {
    public static void main(String[] args) {
        Life life = new Life();
        life.exe();
    }
}

class Life {
    public String name;
    public int points;
    public boolean oj;
    public String[] scenes = {
            "~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~\n"
                    + "                     ** **                     &=(=(=(=(=)=)=)=)=&\n"
                    + "                  -=*=-*-=*=-                    !-!-!}!!!{!-!-!\n"
                    + "                     *   *                       ! ! !} | {! ! !\n"
                    + "        _     ()       *      ()       _         ! ! }  |  { ! !\n"
                    + "       / \\    ||______________||      / \\        ! !'   |   '! !\n"
                    + "      /___\\   |                |     /___\\       ##}----+----{##\n"
                    + "        |     |     -=@@=-     |       |         !!!    |    !!!\n"
                    + "       (_)    |_______  _______|      (_)        !!!    |    !!!\n"
                    + "    ___/_\\___ {_-=*=-_}{_-=*=-_}   ___/_\\___     !!!____|____!!!\n"
                    + "     |__\"__|   %%%%%%%%%%%%%%%%%%   |__\"__|      !!!=========!!!\n"
                    + "    _|_____|__%%%%%%%%%%%%%%%%%%%% _|_____|______!!!_________!!!____\n"
                    + "     |     | %%%%%%%%%%%%%%%%%%%%%% |     |\n"
                    + "            %%%%%%%%%%%%%%%%%%%%%%%%\n"
                    + "           %%%%%%%%%%%%%%%%%%%%%%%%%%\n"
                    + "          %%%%%%%%%%%%%%%%%%%%%%%%%%%%\n"
                    + "         /||||||||||||||||||||||||||||\\\n"
                    + "         ||||||||||||||||||||||||||||||\n"
                    + "         ||||||||||||||||||||||||||||||\n"
                    + "         `============================`\n"
                    + "        `==============================`\n"
                    + "       `================================`\n"
                    + "      `==================================`\n"
                    + "     `====================================`\n"
                    + "    `======================================`\n"
                    + "~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~\n",
            " ______________\n" +
                    "|\\ ___________ /|\n" +
                    "| |  /|,| |   | |\n" +
                    "| | |,x,| |   | |\n" +
                    "| | |,x,' |   | |\n" +
                    "| | |,x   ,   | |\n" +
                    "| | |/    |%==| |\n" +
                    "| |    /] ,   | |\n" +
                    "| |   [/ ()   | |\n" +
                    "| |       |   | |\n" +
                    "| |       |   | |\n" +
                    "| |       |   | |\n" +
                    "| |      ,'   | |\n" +
                    "| |   ,'      | |\n" +
                    "|_|,'_________|_|\n" };
    // public String[][] choices = { ,
    // { "Go outside", "Play videogames", "Go to a party" }, { "Pet a dog", "Go to a
    // park" } };
    public int[][] choicePoints = { { 5, 5 }, { 3, 1, 666 }, { -21, 3 } };

    public String exe() {
        name = (String) input("Whats Your name: ", String.class);
        clear();
        return choiceAndInput(new String[] { "Brush Teeth", "Eat Breakfast" }, new String[] { "Wake Up..." }, 0,
                new int[] { 5, 5 }) == 0
                        ? choiceAndInput(new String[] { "Go outside", "Play videogames", "Go to a party" },
                                new String[] { "You brush your teeth and go down to eat breakfast..." }, 2,
                                new int[] { 3, 1, 666 }) == 0
                                        ? choiceAndInput(
                                                new String[] { "Pet a dog", "Go to the park" },
                                                new String[] { "You drink orange juice and puke..." }, 0,
                                                new int[] { -21, 3 }) == 0 ? end(new String[] { "The dog was a K9..." })
                                                        : choiceAndInput(
                                                                new String[] { "Sit on the bench", "Go up to someone" },
                                                                new String[] { "You drink orange juice and puke..." },
                                                                0,
                                                                new int[] { 20, 5 }) == 0
                                                                        ? end(new String[] {
                                                                                "You contemplate life for the rest of the day..." })
                                                                        : "GO UP TO SOMEONE"
                                        : "VIDEOGAMES"
                        : choiceAndInput(new String[] { "Go outside", "Play videogames", "Go to a party" },
                                new String[] { "You brush your teeth and go down to eat breakfast..." }, 2,
                                new int[] { 3, 1, 666 }) >= 0 ? "AAA" : "AAA";
    }

    public String end(String[] sp) {
        for (int i = 0; i < sp.length; i++) {
            print(sp[i]);
        }
        print("Score: " + points);
        return exe();
    }

    public int choiceAndInput(String[] os, String[] sp, int acsiiI, int[] p) {
        for (int i = 0; i < sp.length; i++) {
            print(sp[i]);
        }
        if (os.length == 0) {
            points += p[0];
            return -1;
        }
        int f = choice(os);
        points += p[f];
        printScene(acsiiI);
        return f;
    }

    public int choice(String[] os) {
        print("Choose a number...");
        for (int i = 0; i < os.length; i++) {
            print("[" + i + "] " + os[i]);
        }
        int f = (int) input("------------------", int.class);
        if (f < 0 || f >= os.length) {
            print("Choose a number between 0 and " + os.length);
            return choice(os);
        }
        return f;
    }

    public void print(Object a) {
        System.out.println(a);
    }

    public Object input(String q, Class<?> b) {
        print(q);
        Scanner r = new Scanner(System.in);
        try {
            return (Object) (b == String.class ? r.nextLine() : b == int.class ? r.nextInt() : r.nextLine());
        } catch (InputMismatchException e) {
            print("Check your input...");
            return input(q, b);
        }
    }

    public void printScene(int a) {
        System.out.println(scenes[a]);
    }

    public void clear() {
        for (int i = 0; i < 80; i++)
            System.out.print("\n");
    }
}
