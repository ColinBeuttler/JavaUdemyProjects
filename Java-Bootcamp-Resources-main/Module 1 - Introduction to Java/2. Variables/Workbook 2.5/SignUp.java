import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("\nEnter Your first Name.");
        String firstName = scan.nextLine();
        //Ask for their last name.
        System.out.println("\nEnter your last Name.");
        String lastName = scan.nextLine();
        //Ask: how old are you?
        System.out.println("\nEnter your age.");
        int age = scan.nextInt();
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        System.out.println("\nCreate a username.");
        scan.nextLine();
        String userName = scan.nextLine();
        //Ask what city they live in.
        System.out.println("\nEnter your city.");
        String city = scan.nextLine();
        //Ask what country that's from.
        System.out.println("\nEnter your country.");
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        System.out.println("\nFirst Name: " + firstName);
        //        Last Name: Slim
        System.out.println("\nLast Name: " + lastName);
        //        Age: 27
        System.out.println("\nAge: " + age);
        //        Username: monotonic_relu
        System.out.println("\nUsername: " + userName);
        //        City: Ottawa
        System.out.println("\nCity: " + city);
        //        Country: Canada
        System.out.println("\nCountry: " + country);
        //


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}
