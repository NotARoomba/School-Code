import java.util.InputMismatchException;
import java.util.Scanner;

public class CYOA {
    public static void main(String[] args) {
        Life life = new Life();
        life.print(life.exe());
    }
}

class Life {
    public String b = null;
    public int c;
    public String[] d = {
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
                    + "     |     | %%%%%%%%%%%%%%%%%%%%%% |     |\n" + "            %%%%%%%%%%%%%%%%%%%%%%%%\n"
                    + "           %%%%%%%%%%%%%%%%%%%%%%%%%%\n" + "          %%%%%%%%%%%%%%%%%%%%%%%%%%%%\n"
                    + "         /||||||||||||||||||||||||||||\\\n" + "         ||||||||||||||||||||||||||||||\n"
                    + "         ||||||||||||||||||||||||||||||\n" + "         `============================`\n"
                    + "        `==============================`\n" + "       `================================`\n"
                    + "      `==================================`\n" + "     `====================================`\n"
                    + "    `======================================`\n"
                    + "~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~\n",
            " ______________\n" + "|\\ ___________ /|\n" + "| |  /|,| |   | |\n" + "| | |,x,| |   | |\n"
                    + "| | |,x,' |   | |\n" + "| | |,x   ,   | |\n" + "| | |/    |%==| |\n" + "| |    /] ,   | |\n"
                    + "| |   [/ ()   | |\n" + "| |       |   | |\n" + "| |       |   | |\n" + "| |       |   | |\n"
                    + "| |      ,'   | |\n" + "| |   ,'      | |\n" + "|_|,'_________|_|\n",
            "                   \\  |  /         ___________\n"
                    + "    ____________  \\ \\_# /         |  ___      |       _________\n"
                    + "   |            |  \\  #/          | |   |     |      | = = = = |\n"
                    + "   | |   |   |  |   \\\\#           | |`v'|     |      |         |\n"
                    + "   |            |    \\#  //       |  --- ___  |      | |  || | |\n"
                    + "   | |   |   |  |     #_//        |     |   | |      |         |\n"
                    + "   |            |  \\\\ #_/_______  |     |   | |      | |  || | |\n"
                    + "   | |   |   |  |   \\\\# /_____/ \\ |      ---  |      |         |\n"
                    + "   |            |    \\# |+ ++|  | |  |~~~~~~| |      | |  || | |\n"
                    + "   |            |    \\# |+ ++|  | |  |~~~~~~| |      | |  || | |\n"
                    + " ~~|    (~~~~~) |~~~~~#~| H  |_ |~|  | |||| | |~~~~~~|         |\n"
                    + "   |    ( ||| ) |     # ~~~~~~    |  | |||| | |      | ||||||| |\n"
                    + "   ~~~~~~~~~~~~~________/  /_____ |  | |||| | |      | ||||||| |\n"
                    + "                                  ~~~~~~~~~~~~~      | ||||||| |\n",
            "       ,               ,\n" + "       \\              /\n" + "        \\0          0/\n"
                    + "         |\\/      \\/|\n" + "         |          |\n" + "        / \\        / \\\n"
                    + "  ____/___\\______/___\\_________\n",
            "                    ) ))\n" + "  ( ((  /)\n" + " ,-===-//\n" + "|`-===-'|\n" + "'       '\n"
                    + " \\_____/\n" + " `-----'\n",
            "                                 _.,_\n" + "                              ,-'.' .`-,\n"
                    + "                             ;; '. ' `. ;` - _\n"
                    + "                          _,-; ' ; `.  ,% .-,  -\n"
                    + "  *blegh*          ,_.,-'`   ';; ; : ;%'  | |   \\\n"
                    + "       ___  _._,-`'\\            `'-`'  _.,' `.   )\n"
                    + " __,--`-,,`'  ,._,.-`-., _.,-.--.-,`''`  |  _|   |__\n"
                    + "  `---'////\\ /  .-,     `-`-^--`'^`-...,,| | |.,/\n"
                    + "       //\\)(/   `-\\.-.                   | `-'\n"
                    + "                  ( .-;                  |   |    ,.\n"
                    + "                   `-~ ~~-.              `._.'  ,/ /\n"
                    + "                     `~ ~~~ ~~                 /,.`)\n"
                    + "                                              //  /\n"
                    + "                                             /_ `/\n"
                    + "                                            (  `/\n"
                    + "                                             `-'\n",
            "________.   ._____________________________.\n" + "(///(////\\  ///(///(///(///(///(///(///(////\\\n"
                    + "///(///(  \\///(///(///(///(///(///(///(///(  \\\n"
                    + "//(///(   ///(///(///(///(///(///(///(///(   |\n"
                    + "/(///(  .///(///(///(///(///(///(///(///(  . | \n"
                    + "    | .' |  ___    ___    ___   _____  | .'| | \n"
                    + "    | |.'| |_|_|  |_|_|  |_|_| |__|__| | |.' |\n"
                    + "    | '  | |_|_|  |_|_|  |_|_| |__|__| | ' . ||'--:|\n"
                    + "__  |  .'|    __   _____    _ %%%____  | .'| |  .|\n"
                    + "__| | |.'|   |  | |__|__|  |_%%%%%___| ||.' .'.|   .'         .'\n"
                    + "__| | '.'|   | .| |__|__|  |%%%:%%___| |' .'.|   .'         .'\n"
                    + "____|.'  |___|__|___________%%::%______|.'.|   .'         .'\n"
                    + "       .|   '-=-.'            :'       .|    .'         .'\n"
                    + "     .|   '   .               :      .|    .'         .'\n"
                    + "   .|   '   .                       .|   .'         .'\n"
                    + "  |'--'|==||'--'|'--'|'--'|'--'|'-'|   .'         .'\n"
                    + "======================================'         .' \n"
                    + ".    ...   ...   ...   ...   ...              .'\n"
                    + "                                              \n"
                    + "================================.          \n" + "                              .'         .'\n"
                    + "                            .'         .'\n" };

    public String exe() {
        b = b == null ? (String) input("" + ((char) 87) + ((char) 104) + ((char) 97) + ((char) 116) + ((char) 115) + ((char) 32) + ((char) 89) + ((char) 111) + ((char) 117) + ((char) 114) + ((char) 32) + ((char) 110) + ((char) 97) + ((char) 109) + ((char) 101) + ((char) 58) + ((char) 32) , String.class) : b;
        clear();
        return choiceAndInput(new String[] { "" + ((char) 66) + ((char) 114) + ((char) 117) + ((char) 115) + ((char) 104) + ((char) 32) + ((char) 84) + ((char) 101) + ((char) 101) + ((char) 116) + ((char) 104) , "" + ((char) 69) + ((char) 97) + ((char) 116) + ((char) 32) + ((char) 66) + ((char) 114) + ((char) 101) + ((char) 97) + ((char) 107) + ((char) 102) + ((char) 97) + ((char) 115) + ((char) 116)  }, new String[] {
                "" + ((char) 87) + ((char) 97) + ((char) 107) + ((char) 101) + ((char) 32) + ((char) 85) + ((char) 112) + ((char) 46) + ((char) 46) + ((char) 46)  }, 0, new int[] { 5, 5 }) == 0 ? choiceAndInput(
                        new String[] { "" + ((char) 71) + ((char) 111) + ((char) 32) + ((char) 111) + ((char) 117) + ((char) 116) + ((char) 115) + ((char) 105) + ((char) 100) + ((char) 101) , "" + ((char) 71) + ((char) 111) + ((char) 32) + ((char) 116) + ((char) 111) + ((char) 32) + ((char) 97) + ((char) 32) + ((char) 112) + ((char) 97) + ((char) 114) + ((char) 116) + ((char) 121)  },
                        new String[] { b + "" + ((char) 32) + ((char) 103) + ((char) 111) + ((char) 101) + ((char) 115) + ((char) 32) + ((char) 116) + ((char) 111) + ((char) 32) + ((char) 101) + ((char) 97) + ((char) 116) + ((char) 32) + ((char) 98) + ((char) 114) + ((char) 101) + ((char) 97) + ((char) 107) + ((char) 102) + ((char) 97) + ((char) 115) + ((char) 116) + ((char) 46) + ((char) 46) + ((char) 46) }, 2, new int[] { 3, 666 }) == 0
                                ? choiceAndInput(new String[] { "" + ((char) 80) + ((char) 101) + ((char) 116) + ((char) 32) + ((char) 97) + ((char) 32) + ((char) 100) + ((char) 111) + ((char) 103) , "Go to the park" }, new String[] { b
                                        + " drinks orange juice and pukes..." }, 2, new int[] { -21, 3 }) == 0 ? end(
                                                new String[] { "The dog was a K9..." })
                                                : choiceAndInput(new String[] { "Sit on the bench",
                                                        "Go up to someone" }, new String[] {}, 2,
                                                        new int[] { 20, 5 }) == 0 ? end(
                                                                new String[] { b
                                                                        + " sits on a bench and contemplates life for the rest of the day..." })
                                                                : choiceAndInput(new String[] { "Don't socialize",
                                                                        "Introduce yourself" }, new String[] {}, 3,
                                                                        new int[] { 15, 999 }) == 0 ? end(
                                                                                new String[] { b
                                                                                        + " sits on a bench and contemplates life for the rest of the day..." })
                                                                                : b + " feels a spark and start to spend more time with the person\n"
                                                                                        + b
                                                                                        + " then has the courage to ask them out\n"
                                                                                        + b
                                                                                        + " then gets married and spends the rest of their life with them...\nTHE END\nScore: "
                                                                                        + (c + 999)
                                : choiceAndInput(new String[] { "Drink mysterious fruit punch", "Drink water" },
                                        new String[] {}, 4, new int[] { -666, 5 }) == 0
                                                ? choiceAndInput(
                                                        new String[] { "Ask a friend for a ride home",
                                                                "Try to drive yourself" },
                                                        new String[] {
                                                                b + " feels a bit woozy after drinking the punch..." },
                                                        5, new int[] { 20, -999 }) == 0
                                                                ? end(new String[] { b
                                                                        + " goes home to sleep, pondering the meaning of life..." })
                                                                : end(new String[] { b
                                                                        + " hits the gas and dies in a car accident..." })
                                                : choiceAndInput(new String[] { "Go home and sleep", "After party?" },
                                                        new String[] {}, 6, new int[] { 10, 69 }) == 0
                                                                ? end(new String[] { b
                                                                        + " goes home to sleep, pondering the meaning of life..." })
                                                                : end(new String[] { b
                                                                        + " wakes up in the middle of a desert without a kidney..." })
                        : choiceAndInput(new String[] { "Go outside", "Go to a party" }, new String[] {
                                b + " goes to eat breakfast..." }, 2, new int[] { 3, 666 }) == 0 ? choiceAndInput(
                                        new String[] { "Pet a dog", "Go to the park" },
                                        new String[] { }, 2,
                                        new int[] { -21, 3 }) == 0
                                                ? end(new String[] { "The dog was a K9..." })
                                                : choiceAndInput(
                                                        new String[] { "Sit on the bench", "Go up to someone" },
                                                        new String[] {}, 2, new int[] { 20, 5 }) == 0
                                                                ? end(new String[] { b
                                                                        + " sits on a bench and contemplates life for the rest of the day..." })
                                                                : choiceAndInput(
                                                                        new String[] { "Don't socialize",
                                                                                "Introduce yourself" },
                                                                        new String[] {}, 3, new int[] { 15, 999 }) == 0
                                                                                ? end(new String[] { b
                                                                                        + " sits on a bench and contemplates life for the rest of the day..." })
                                                                                : b + " feels a spark and start to spend more time with the person\n"
                                                                                        + b
                                                                                        + " then has the courage to ask them out\n"
                                                                                        + b
                                                                                        + " then gets married and spends the rest of their life with them...\nTHE END\nScore: "
                                                                                        + (c + 999)
                                        : choiceAndInput(new String[] { "Drink mysterious fruit punch", "Drink water" },
                                                new String[] {}, 4, new int[] { -666, 5 }) == 0
                                                        ? choiceAndInput(
                                                                new String[] { "Ask a friend for a ride home",
                                                                        "Try to drive yourself" },
                                                                new String[] { b
                                                                        + " feels a bit woozy after drinking the punch..." },
                                                                5, new int[] { 20, -999 }) == 0
                                                                        ? end(new String[] { b
                                                                                + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] { b
                                                                                + " hits the gas and dies in a car accident..." })
                                                        : choiceAndInput(
                                                                new String[] { "Go home and sleep", "After party?" },
                                                                new String[] {}, 6, new int[] { 10, 69 }) == 0
                                                                        ? end(new String[] { b
                                                                                + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] { b
                                                                                + " wakes up in the middle of a desert without a kidney..." });
    }

    public String end(String[] e) {
        for (int f = 0; f < e.length; f++) {
            print(e[f]);
        }
        print("Score: " + c);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return exe();
    }

    public int choiceAndInput(String[] g, String[] h, int i, int[] j) {
        printScene(i);
        for (int k = 0; k < h.length; k++) {
            print(h[k]);
        }
        if (g.length == 0) {
            c += j[0];
            return -1;
        }
        int f = choice(g);
        c += j[f];
        return f;
    }

    public int choice(String[] l) {
        print("Choose a number...");
        for (int m = 0; m < l.length; m++) {
            print("[" + m + "] " + l[m]);
        }
        int n = (int) input("------------------", int.class);
        if (n < 0 || n >= l.length) {
            print("Choose between 0 or 1...");
            return choice(l);
        }
        return n;
    }

    public void print(Object o) {
        System.out.println(o);
    }

    public Object input(String p, Class<?> q) {
        print(p);
        Scanner r = new Scanner(System.in);
        try {
            return (Object) (q == String.class ? r.nextLine() : q == int.class ? r.nextInt() : r.nextLine());
        } catch (InputMismatchException s) {
            print("Check your input...");
            return input(p, q);
        }
    }

    public void printScene(int t) {
        System.out.println(d[t]);
    }

    public void clear() {
        for (int u = 0; u < 80; u++)
            System.out.print("\n");
    }
}