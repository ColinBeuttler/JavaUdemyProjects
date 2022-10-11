import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");

        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if( budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available.");
                    System.out.println("\nDo you Have insurance?");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if( insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                        System.out.println("\nSold! Congrats on your new car.");
                    }
                    else{
                        System.out.println("\nToO BaD SO SAd");
                    }
                }
                else{
                    System.out.println("\nWe do not have anything under 10000.");
                }
            break;
            case "b": 
                System.out.println("\nWhat is you car valued at?");
                int value = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if( value > price && price < 30000){
                    System.out.println("\nWe will buy your car.");
                }

                else{
                    System.out.println("\nSorry not intersested");
                }

            break;
            default: System.out.print("Enter a valid option");

        }
    }
}
