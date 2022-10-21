import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Hangman!!");
        System.out.println("Press Enter to Start");

        scan.nextLine();

        String word = randomWord(words);
        
        char[] misses = new char[0];
        int i = 0;
        char[] placeHolder = createPlaceHolder(word);

        System.out.print("Computer has randomly choosen a word.");

        while (i < gallows.length) {

            System.out.println("\n" + gallows[i]);

            printPlaceHolder(placeHolder);

            printMissedGuesses(misses);

            System.out.print("\nGuess: ");

            char guess = scan.next().charAt(0);

            if (checkGuess(guess, word)) {
                placeHolder = updatePlaceHolder(guess, word, placeHolder);
            } else {
                misses = updateMisses(guess, misses);
                i++;
            };
            if (Arrays.equals(placeHolder, word.toCharArray())) {
                System.out.println("You Won");
                System.exit(0);
            }
        
        };
        System.out.print("\nYou Lost, the word was " + word);
       
        scan.close();
    }
    
    public static String randomWord(String[] words) {
        double wordDouble = Math.random() * words.length;
        int wordInt = (int) wordDouble;
        return words[wordInt];
    }

    public static char[] createPlaceHolder(String word) {
        int wordLength = word.length();
        char[] ch = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            ch[i] = '_';
        }
        return ch;
    }
    
    public static void printPlaceHolder(char[] placeHolder) {
        System.out.print("\nWord: ");
        for (int i = 0; i < placeHolder.length; i++) {
            System.out.print(placeHolder[i]);
        }
    }

    public static boolean checkGuess(char guess, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
    }
    
    public static void printMissedGuesses(char[] misses) {
        System.out.print("\nMisses: ");
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i] + " ");
        }
    }

    public static char[] updatePlaceHolder(char guess, String word, char[] placeHolder) {   
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                placeHolder[i] = guess;
            }
        }
        return placeHolder;
   }

   public static char[] updateMisses(char guess, char[] misses) {
       char[] ch = new char[misses.length + 1];
       for (int i = 0; i < misses.length; i++) {
           ch[i] = misses[i];
       }
       ch[misses.length] = guess;
       return ch;
   }
}





