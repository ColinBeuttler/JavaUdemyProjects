import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       double secret = (Math.random() * 5) + 1;
       int secretInt = (int) secret;
        
       Scanner scan = new Scanner(System.in);

       System.out.println("\nEnter your guess");
        
       int guess = scan.nextInt();


        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '
        
            2. Once they guess it, print: You got it!
        */
        while (guess != secretInt) {
            System.out.println("Guess Again");

            guess = scan.nextInt();

        }
        
        System.out.println("You got it!");


        scan.close();
    }

}
