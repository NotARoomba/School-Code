import java.util.InputMismatchException;
import java.util.Scanner;

public class CYOA2 {
    public String name = null;
    public int points;
    public Scanner key;
    public String[] scenes = {
            "~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~\n" +
                    "                     ** **                     &=(=(=(=(=)=)=)=)=&\n" +
                    "                  -=*=-*-=*=-                    !-!-!}!!!{!-!-!\n" +
                    "                     *   *                       ! ! !} | {! ! !\n" +
                    "        _     ()       *      ()       _         ! ! }  |  { ! !\n" +
                    "       / \\    ||______________||      / \\        ! !'   |   '! !\n" +
                    "      /___\\   |                |     /___\\       ##}----+----{##\n" +
                    "        |     |     -=@@=-     |       |         !!!    |    !!!\n" +
                    "       (_)    |_______  _______|      (_)        !!!    |    !!!\n" +
                    "    ___/_\\___ {_-=*=-_}{_-=*=-_}   ___/_\\___     !!!____|____!!!\n" +
                    "     |__\"__|   %%%%%%%%%%%%%%%%%%   |__\"__|      !!!=========!!!\n" +
                    "    _|_____|__%%%%%%%%%%%%%%%%%%%% _|_____|______!!!_________!!!____\n" +
                    "     |     | %%%%%%%%%%%%%%%%%%%%%% |     |\n" +
                    "            %%%%%%%%%%%%%%%%%%%%%%%%\n" +
                    "           %%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
                    "          %%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
                    "         /||||||||||||||||||||||||||||\\\n" +
                    "         ||||||||||||||||||||||||||||||\n" +
                    "         ||||||||||||||||||||||||||||||\n" +
                    "         `============================`\n" +
                    "        `==============================`\n" +
                    "       `================================`\n" +
                    "      `==================================`\n" +
                    "     `====================================`\n" +
                    "    `======================================`\n" +
                    "~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~\n",
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
                    "|_|,'_________|_|\n",
            "                   \\  |  /         ___________\n" +
                    "    ____________  \\ \\_# /         |  ___      |       _________\n" +
                    "   |            |  \\  #/          | |   |     |      | = = = = |\n" +
                    "   | |   |   |  |   \\\\#           | |`v'|     |      |         |\n" +
                    "   |            |    \\#  //       |  --- ___  |      | |  || | |\n" +
                    "   | |   |   |  |     #_//        |     |   | |      |         |\n" +
                    "   |            |  \\\\ #_/_______  |     |   | |      | |  || | |\n" +
                    "   | |   |   |  |   \\\\# /_____/ \\ |      ---  |      |         |\n" +
                    "   |            |    \\# |+ ++|  | |  |~~~~~~| |      | |  || | |\n" +
                    "   |            |    \\# |+ ++|  | |  |~~~~~~| |      | |  || | |\n" +
                    " ~~|    (~~~~~) |~~~~~#~| H  |_ |~|  | |||| | |~~~~~~|         |\n" +
                    "   |    ( ||| ) |     # ~~~~~~    |  | |||| | |      | ||||||| |\n" +
                    "   ~~~~~~~~~~~~~________/  /_____ |  | |||| | |      | ||||||| |\n" +
                    "                                  ~~~~~~~~~~~~~      | ||||||| |\n",
            "       ,               ,\n" +
                    "       \\              /\n" +
                    "        \\0          0/\n" +
                    "         |\\/      \\/|\n" +
                    "         |          |\n" +
                    "        / \\        / \\\n" +
                    "  ____/___\\______/___\\_________\n",
            "                    ) ))\n" +
                    "  ( ((  /)\n" +
                    " ,-===-//\n" +
                    "|`-===-'|\n" +
                    "'       '\n" +
                    " \\_____/\n" +
                    " `-----'\n",
            "                                 _.,_\n" +
                    "                              ,-'.' .`-,\n" +
                    "                             ;; '. ' `. ;` - _\n" +
                    "                          _,-; ' ; `.  ,% .-,  -\n" +
                    "  *blegh*          ,_.,-'`   ';; ; : ;%'  | |   \\\n" +
                    "       ___  _._,-`'\\            `'-`'  _.,' `.   )\n" +
                    " __,--`-,,`'  ,._,.-`-., _.,-.--.-,`''`  |  _|   |__\n" +
                    "  `---'////\\ /  .-,     `-`-^--`'^`-...,,| | |.,/\n" +
                    "       //\\)(/   `-\\.-.                   | `-'\n" +
                    "                  ( .-;                  |   |    ,.\n" +
                    "                   `-~ ~~-.              `._.'  ,/ /\n" +
                    "                     `~ ~~~ ~~                 /,.`)\n" +
                    "                                              //  /\n" +
                    "                                             /_ `/\n" +
                    "                                            (  `/\n" +
                    "                                             `-'\n",

            "________.   ._____________________________.\n" +
                    "(///(////\\  ///(///(///(///(///(///(///(////\\\n" +
                    "///(///(  \\///(///(///(///(///(///(///(///(  \\\n" +
                    "//(///(   ///(///(///(///(///(///(///(///(   |\n" +
                    "/(///(  .///(///(///(///(///(///(///(///(  . | \n" +
                    "    | .' |  ___    ___    ___   _____  | .'| | \n" +
                    "    | |.'| |_|_|  |_|_|  |_|_| |__|__| | |.' |\n" +
                    "    | '  | |_|_|  |_|_|  |_|_| |__|__| | ' . ||'--:|\n" +
                    "__  |  .'|    __   _____    _ %%%____  | .'| |  .|\n" +
                    "__| | |.'|   |  | |__|__|  |_%%%%%___| ||.' .'.|   .'         .'\n" +
                    "__| | '.'|   | .| |__|__|  |%%%:%%___| |' .'.|   .'         .'\n" +
                    "____|.'  |___|__|___________%%::%______|.'.|   .'         .'\n" +
                    "       .|   '-=-.'            :'       .|    .'         .'\n" +
                    "     .|   '   .               :      .|    .'         .'\n" +
                    "   .|   '   .                       .|   .'         .'\n" +
                    "  |'--'|==||'--'|'--'|'--'|'--'|'-'|   .'         .'\n" +
                    "======================================'         .' \n" +
                    ".    ...   ...   ...   ...   ...              .'\n" +
                    "                                              \n" +
                    "================================.          \n" +
                    "                              .'         .'\n" +
                    "                            .'         .'\n"

    };

    public String startAdventure(Scanner k, String n) {
        name = name == null ? n : name;
        key = k;
        clear();
        return choiceAndInput(new String[] { "Brush Teeth", "Eat Breakfast" }, new String[] { "Wake Up..." }, 0,
                new int[] { 5, 5 }) == 0
                        ? choiceAndInput(new String[] { "Go outside", "Go to a party" },
                                new String[] { name + " goes to eat breakfast..." }, 2,
                                new int[] { 3, 666 }) == 0
                                        ? choiceAndInput(
                                                new String[] { "Pet a dog", "Go to the park" },
                                                new String[] { name + " drinks orange juice and pukes..." }, 2,
                                                new int[] { -21, 3 }) == 0 ? end(new String[] { "The dog was a K9..." })
                                                        : choiceAndInput(
                                                                new String[] { "Sit on the bench", "Go up to someone" },
                                                                new String[] {},
                                                                2,
                                                                new int[] { 20, 5 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " sits on a bench and contemplates life for the rest of the day..." })
                                                                        : choiceAndInput(
                                                                                new String[] { "Don't socialize",
                                                                                        "Introduce yourself" },
                                                                                new String[] {}, 3,
                                                                                new int[] { 15, 999 }) == 0 ? end(
                                                                                        new String[] {
                                                                                                name + " sits on a bench and contemplates life for the rest of the day..." })
                                                                                        : name + " feels a spark and start to spend more time with the person\n"
                                                                                                + name
                                                                                                + " then has the courage to ask them out\n"
                                                                                                + name
                                                                                                + " then gets married and spends the rest of their life with them...\nTHE END\nScore: "
                                                                                                + (points + 999)
                                        : choiceAndInput(new String[] { "Drink mysterious fruit punch", "Drink water" },
                                                new String[] {}, 4,
                                                new int[] { -666, 5 }) == 0
                                                        ? choiceAndInput(
                                                                new String[] { "Ask a friend for a ride home",
                                                                        "Try to drive yourself" },
                                                                new String[] {
                                                                        name + " feels a bit woozy after drinking the punch..." },
                                                                5,
                                                                new int[] { 20, -999 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] {
                                                                                name + " hits the gas and dies in a car accident..." })
                                                        : choiceAndInput(
                                                                new String[] { "Go home and sleep", "After party?" },
                                                                new String[] {}, 6,
                                                                new int[] { 10, 69 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] {
                                                                                name + " wakes up in the middle of a desert without a kidney..." })
                        : choiceAndInput(new String[] { "Go outside", "Go to a party" },
                                new String[] { name + " goes to eat breakfast..." }, 2,
                                new int[] { 3, 666 }) == 0
                                        ? choiceAndInput(
                                                new String[] { "Pet a dog", "Go to the park" },
                                                new String[] { name + " drinks orange juice and pukes..." }, 2,
                                                new int[] { -21, 3 }) == 0 ? end(new String[] { "The dog was a K9..." })
                                                        : choiceAndInput(
                                                                new String[] { "Sit on the bench", "Go up to someone" },
                                                                new String[] {},
                                                                2,
                                                                new int[] { 20, 5 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " sits on a bench and contemplates life for the rest of the day..." })
                                                                        : choiceAndInput(
                                                                                new String[] { "Don't socialize",
                                                                                        "Introduce yourself" },
                                                                                new String[] {}, 3,
                                                                                new int[] { 15, 999 }) == 0 ? end(
                                                                                        new String[] {
                                                                                                name + " sits on a bench and contemplates life for the rest of the day..." })
                                                                                        : name + " feels a spark and start to spend more time with the person\n"
                                                                                                + name
                                                                                                + " then has the courage to ask them out\n"
                                                                                                + name
                                                                                                + " then gets married and spends the rest of their life with them...\nTHE END\nScore: "
                                                                                                + (points + 999)
                                        : choiceAndInput(new String[] { "Drink mysterious fruit punch", "Drink water" },
                                                new String[] {}, 4,
                                                new int[] { -666, 5 }) == 0
                                                        ? choiceAndInput(
                                                                new String[] { "Ask a friend for a ride home",
                                                                        "Try to drive yourself" },
                                                                new String[] {
                                                                        name + " feels a bit woozy after drinking the punch..." },
                                                                5,
                                                                new int[] { 20, -999 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] {
                                                                                name + " hits the gas and dies in a car accident..." })
                                                        : choiceAndInput(
                                                                new String[] { "Go home and sleep", "After party?" },
                                                                new String[] {}, 6,
                                                                new int[] { 10, 69 }) == 0
                                                                        ? end(new String[] {
                                                                                name + " goes home to sleep, pondering the meaning of life..." })
                                                                        : end(new String[] {
                                                                                name + " wakes up in the middle of a desert without a kidney..." });
    }

    public String end(String[] sp) {
        for (int i = 0; i < sp.length; i++) {
            print(sp[i]);
        }
        print("Score: " + points);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return startAdventure(key, name);
    }

    public int choiceAndInput(String[] os, String[] sp, int acsiiI, int[] p) {
        printScene(acsiiI);
        for (int i = 0; i < sp.length; i++) {
            print(sp[i]);
        }
        if (os.length == 0 || false) {
            points += p[0];
            return -1;
        }
        int f = choice(os);
        points += p[f];
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