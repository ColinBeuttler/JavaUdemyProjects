import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        //store answer 1
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        //store answer 2
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        String answer3 = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        String answer4 = scan.nextLine();

        int score = 0;


        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        if(answer1.equals("c")){
            score += 5;
        }

        if(answer2.equals("a")){
            score += 5;
        }

        if(answer3.equals("d")){
            score += 5;
        }

        if(answer4.equals("a") || answer4.equals("b")){
            score += 5;
        }
        
        System.out.println("\nYour final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        switch(score){
            case 20: System.out.println("\nWow, you know your stuff!");
            break;

            case 15 : System.out.println("\nWow, you know your stuff!");
            break;

            case 10 : System.out.println("\nNot bad!");
            break;

            case 5: System.out.println("\nNot bad!");
            break;

            default: System.out.println("\nbetter luck next time.");


        }

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 


        scan.close();

    }
}